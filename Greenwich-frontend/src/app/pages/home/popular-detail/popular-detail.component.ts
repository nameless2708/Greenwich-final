import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router'
import { MovieService } from 'src/app/services/movie.service';
import { TranslateService, LangChangeEvent } from '@ngx-translate/core';

@Component({
  selector: 'app-popular-detail',
  templateUrl: './popular-detail.component.html'
})
export class PopularDetailComponent implements OnInit {

  constructor(private movieService: MovieService,
              private route: ActivatedRoute,
              private translate: TranslateService) { }

  detail : any = {
    movie : {},
    cast : []
  };

  reviewList : any = [];

  ngOnInit() {
    this.getDetail()
  }

  getDetail(){
    this.movieService.getMovieDetail(this.route.snapshot.params['id']).subscribe(data => {
      this.detail = data;

      this.detail.movie_cast.map(movieCast => {
        // if(element
        this.detail.cast.map(cast =>{
          if(movieCast.castId == cast.id){
            cast['roleName'] = movieCast.roleName;
          }
        })
      })
      this.getReview();

    });
  }

  getReview(){
    this.movieService.getReviewById(this.detail.movies.id).subscribe(res => {
        console.log(res);
        this.reviewList = res;
      }
    )
  }

}
