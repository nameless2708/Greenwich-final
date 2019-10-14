package com.company.movie_review.movie_review.movie_review.movie_cast.generated;

import com.company.movie_review.movie_review.movie_review.movie_cast.MovieCast;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.movie_review.movie_review.movie_review.movie_cast.MovieCast}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMovieCastManager extends Manager<MovieCast> {
    
    TableIdentifier<MovieCast> IDENTIFIER = TableIdentifier.of("movie_review", "movie_review", "movie_cast");
    List<Field<MovieCast>> FIELDS = unmodifiableList(asList(
        MovieCast.ID,
        MovieCast.MOVIE_ID,
        MovieCast.CAST_ID,
        MovieCast.ROLE_NAME
    ));
    
    @Override
    default Class<MovieCast> getEntityClass() {
        return MovieCast.class;
    }
}