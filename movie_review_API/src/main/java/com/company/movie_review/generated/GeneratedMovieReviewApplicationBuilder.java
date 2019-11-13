package com.company.movie_review.generated;

import com.company.movie_review.MovieReviewApplication;
import com.company.movie_review.MovieReviewApplicationBuilder;
import com.company.movie_review.MovieReviewApplicationImpl;
import com.company.movie_review.MovieReviewCacheReloader;
import com.company.movie_review.movie_review.movie_review.cast.CastManagerImpl;
import com.company.movie_review.movie_review.movie_review.cast.CastSqlAdapter;
import com.company.movie_review.movie_review.movie_review.movie_cast.MovieCastManagerImpl;
import com.company.movie_review.movie_review.movie_review.movie_cast.MovieCastSqlAdapter;
import com.company.movie_review.movie_review.movie_review.movie_review.MovieReviewManagerImpl;
import com.company.movie_review.movie_review.movie_review.movie_review.MovieReviewSqlAdapter;
import com.company.movie_review.movie_review.movie_review.movies.MoviesManagerImpl;
import com.company.movie_review.movie_review.movie_review.movies.MoviesSqlAdapter;
import com.company.movie_review.movie_review.movie_review.user.UserManagerImpl;
import com.company.movie_review.movie_review.movie_review.user.UserSqlAdapter;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.Injector;
import com.speedment.runtime.application.AbstractApplicationBuilder;

/**
 * A generated base {@link
 * com.speedment.runtime.application.AbstractApplicationBuilder} class for the
 * {@link com.speedment.runtime.config.Project} named movie_review.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieReviewApplicationBuilder extends AbstractApplicationBuilder<MovieReviewApplication, MovieReviewApplicationBuilder> {
    
    protected GeneratedMovieReviewApplicationBuilder() {
        super(MovieReviewApplicationImpl.class, GeneratedMovieReviewMetadata.class);
        withManager(CastManagerImpl.class);
        withManager(MovieCastManagerImpl.class);
        withManager(MovieReviewManagerImpl.class);
        withManager(MoviesManagerImpl.class);
        withManager(UserManagerImpl.class);
        withComponent(CastSqlAdapter.class);
        withComponent(MovieCastSqlAdapter.class);
        withComponent(MovieReviewSqlAdapter.class);
        withComponent(MoviesSqlAdapter.class);
        withComponent(UserSqlAdapter.class);
        withComponent(MovieReviewCacheReloader.class);
    }
    
    @Override
    public MovieReviewApplication build(Injector injector) {
        return injector.getOrThrow(MovieReviewApplication.class);
    }
}