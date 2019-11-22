import {Component, OnInit, Input, SimpleChanges, AfterViewInit, OnChanges} from '@angular/core';
import { trigger, state, style, transition, animate } from '@angular/animations'
import { NotificationService } from 'src/app/services/notification.service';
import { TranslateService } from '@ngx-translate/core';
import { MovieService } from 'src/app/services/movie.service';

@Component({
  selector: 'app-movie-detail',
  templateUrl: './movie-detail.component.html',
  styleUrls: ['./movie-detail.component.css'],
  animations: [
    trigger('detailAppeared', [
      state('', style({opacity: 1})),
      transition('void => ready', [
        style({opacity: 0, transform: 'translate(-30px, -10px)'}),
        animate('500ms 0s ease-in-out')
      ])
    ])
  ]
})
export class MovieDetailComponent implements OnInit, OnChanges {

  detailState: string = 'ready'
  favorite: boolean
  favorites = JSON.parse(localStorage.getItem('favorites')) || []
  userReview = '';

  @Input() detail: any
  @Input() reviewList : any;

  constructor(private ns: NotificationService, private translate: TranslateService, private movieService: MovieService) { }

  ngOnInit() {
    console.log(this.reviewList);
  }


  ngOnChanges(changes: SimpleChanges){
    // if (changes.detail.currentValue) {
    console.log(changes);
      this.favorite = this.isFavorite()
    // }
  }

  isFavorite(): boolean {
    return this.favorites.find(f => f.id === this.detail.id) ? true : false
  }

  addFavorite(){
    if (!this.isFavorite()) {
      this.favorites.push(this.detail);
      localStorage.setItem('favorites', JSON.stringify(this.favorites))
      this.ns.notify(`${this.translate.instant('favorites.msgAdd')}`)
      this.favorite = this.isFavorite()
    }
  }

  removeFavorite(){
    let index = this.favorites.findIndex(f => f.id === this.detail.id)
    this.favorites.splice(index, 1)
    localStorage.setItem('favorites', JSON.stringify(this.favorites))
    this.ns.notify(`${this.translate.instant('favorites.msgRemove')}`)
    this.favorite = this.isFavorite()
  }



  submitReview(){
    this.movieService.predictReview(this.userReview).subscribe(predict => {
      predict = predict.substring(1, predict.length-1);
      console.log(predict);
      let predictResult = predict.toString().split(" ");
      console.log(predictResult);
      this.movieService.submitReview(
        {
          rating : Math.ceil(predictResult[1] * 10),
          tag : parseFloat(predictResult[0]) > 0.5?0:1,
          movie_id :this.detail.movies.id,
          review : this.userReview,
          user_id : localStorage.getItem('user_id')?localStorage.getItem('user_id'):0
        }
      ).subscribe(res => {
        console.log(res);
        this.userReview = '';
        this.reviewList.unshift(res);
      }, err=>{
        console.log(err)
      })
    })

  }

}
