package com.company.movie_review.movie_review.movie_review.movie_cast.generated;

import com.company.movie_review.movie_review.movie_review.movie_cast.MovieCast;
import com.company.movie_review.movie_review.movie_review.movie_cast.MovieCastManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.AbstractManager;
import com.speedment.runtime.field.Field;

import java.util.stream.Stream;

/**
 * The generated base implementation for the manager of every {@link
 * com.company.movie_review.movie_review.movie_review.movie_cast.MovieCast}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieCastManagerImpl 
extends AbstractManager<MovieCast> 
implements GeneratedMovieCastManager {
    
    private final TableIdentifier<MovieCast> tableIdentifier;
    
    protected GeneratedMovieCastManagerImpl() {
        this.tableIdentifier = TableIdentifier.of("movie_review", "movie_review", "movie_cast");
    }
    
    @Override
    public TableIdentifier<MovieCast> getTableIdentifier() {
        return tableIdentifier;
    }
    
    @Override
    public Stream<Field<MovieCast>> fields() {
        return MovieCastManager.FIELDS.stream();
    }
    
    @Override
    public Stream<Field<MovieCast>> primaryKeyFields() {
        return Stream.of(
            MovieCast.ID
        );
    }
}