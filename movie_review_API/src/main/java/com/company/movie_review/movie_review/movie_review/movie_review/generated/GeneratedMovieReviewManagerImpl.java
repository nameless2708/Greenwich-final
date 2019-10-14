package com.company.movie_review.movie_review.movie_review.movie_review.generated;

import com.company.movie_review.movie_review.movie_review.movie_review.MovieReview;
import com.company.movie_review.movie_review.movie_review.movie_review.MovieReviewManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.movie_review.movie_review.movie_review.movie_review.MovieReview}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieReviewManagerImpl 
extends AbstractManager<MovieReview> 
implements GeneratedMovieReviewManager {
    
    private final TableIdentifier<MovieReview> tableIdentifier;
    
    protected GeneratedMovieReviewManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("movie_review", "movie_review", "movie_review");
    }
    
    @Override
    public TableIdentifier<MovieReview> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<MovieReview>> fields() {
        return MovieReviewManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<MovieReview>> primaryKeyFields() {
        return Stream.of(
            MovieReview.ID
        );
    }
}