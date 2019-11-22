import { Injectable } from "@angular/core";
import {HttpClient, HttpHeaders, HttpParams} from '@angular/common/http';
import { environment } from '../../environments/environment'
import { Observable } from 'rxjs';

@Injectable()
export class MovieService {

    url: string = environment.api

    constructor(private http: HttpClient) { }

    getPopularMovie(page): Observable<any> {
        return this.http.get(`${this.url}/movies?start=` + (page-1) * 25);
    }

    getMovieDetail(movie_id): Observable<any> {
        return this.http.get(`${this.url}/movies/${movie_id}`)
    }

    searchMovies(name): Observable<any> {
        return this.http.get(this.url +'/movies/search?keyword=' + name);
    }

    submitReview(review) : Observable<any>{
      let headers = new HttpHeaders({ "content-type": "application/json", "Accept": "application/json" });
      return this.http.post(this.url+ '/movie_review' ,review, {headers : headers });
    }

    getReviewById(id) : Observable<any>{
      let headers = new HttpHeaders({ "content-type": "application/json", "Accept": "application/json" });
      return this.http.get(this.url+ '/movie_review/' + id);
    }

    predictReview(content) : Observable<any>{
      let headers = new HttpHeaders({ "content-type": "application/json", "Accept": "application/json" });
      return this.http.post('http://localhost:5000/predict', JSON.stringify({'content':content}), {headers:headers, responseType : "text"});

    }

}
