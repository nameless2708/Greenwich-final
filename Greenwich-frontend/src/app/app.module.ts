//angular
import { BrowserModule } from '@angular/platform-browser';
import { NgModule, ErrorHandler, LOCALE_ID } from '@angular/core';
import { HttpClient, HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations'
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { ROUTES } from './app.routes';
import { registerLocaleData } from '@angular/common';
import localePt from '@angular/common/locales/pt'
registerLocaleData(localePt, 'pt')

//translate
import { TranslateModule, TranslateLoader } from '@ngx-translate/core'
import { TranslateHttpLoader } from '@ngx-translate/http-loader'

// AoT requires an exported function for factories
export function HttpLoaderFactory(httpClient: HttpClient) {
  return new TranslateHttpLoader(httpClient);
}

//libs
import { AngularSvgIconModule } from 'angular-svg-icon';

//components
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { FooterComponent } from './components/footer/footer.component';
import { MovieComponent } from './components/movie/movie.component';
import { MovieDetailComponent } from './components/movie-detail/movie-detail.component';
import { SnackbarComponent } from './components/snackbar/snackbar.component';

//pages
import { HomeComponent } from './pages/home/home.component';
import { PopularDetailComponent } from './pages/home/popular-detail/popular-detail.component';
import { FavoritesComponent } from './pages/favorites/favorites.component';
import { FavoriteDetailComponent } from './pages/favorites/favorite-detail/favorite-detail.component';
import { SearchComponent } from './pages/search/search.component';
import { SearchDetailComponent } from './pages/search/search-detail/search-detail.component';
import { NotFoundComponent } from './pages/not-found/not-found.component';

//services
import { MovieService } from './services/movie.service';
import { NotificationService } from './services/notification.service';
import { RequestInterceptor } from './services/request.interceptor';

//pipes
import { datePipeProxy } from './pipes/date-proxy.pipe';
import { currencyPipeProxy } from './pipes/currency-proxy.pipe';
import { ratingPipe} from './pipes/rating.pipe';

//outros
import { ApplicationErrorHandler } from './app.error-handler';
import { ActorDetailComponent } from './components/actor-detail/actor-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    HomeComponent,
    FavoritesComponent,
    NotFoundComponent,
    SnackbarComponent,
    MovieComponent,
    MovieDetailComponent,
    SearchComponent,
    SearchDetailComponent,
    PopularDetailComponent,
    FavoriteDetailComponent,
    datePipeProxy,
    currencyPipeProxy,
    ratingPipe,
    ActorDetailComponent
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
    // InfiniteScroll
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    AngularSvgIconModule,
    TranslateModule.forRoot({
      loader: {
        provide: TranslateLoader,
        useFactory: HttpLoaderFactory,
        deps: [HttpClient]
      }
    }),
    RouterModule.forRoot(ROUTES, {onSameUrlNavigation: 'reload'})
  ],
  providers: [
    MovieService,
    NotificationService,
    {provide: LOCALE_ID, useValue: 'pt'},
    {provide: HTTP_INTERCEPTORS, useClass: RequestInterceptor, multi: true},
    {provide: ErrorHandler, useClass: ApplicationErrorHandler}
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
