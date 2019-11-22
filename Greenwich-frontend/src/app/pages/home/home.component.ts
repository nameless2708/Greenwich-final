import {Component, HostListener, OnInit} from '@angular/core';
import { MovieService } from 'src/app/services/movie.service';
import { TranslateService, LangChangeEvent } from '@ngx-translate/core';
// import {HostListener} from '@angular/compiler/src/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private movieService: MovieService, private translate: TranslateService) {}
  page = 1;

  scrollEv(ev){
    if(ev.srcElement.scrollHeight - ev.srcElement.scrollTop < 900){
        this.page++;
    this.getPopular(this.page);
    }
  }

  popular = [];

  ngOnInit() {
    this.getPopular(1);

  }

  getPopular(page){
    this.movieService.getPopularMovie(page).subscribe(data => {
      console.log(data);
      this.popular = this.popular.concat(data);
    });
  }



}
