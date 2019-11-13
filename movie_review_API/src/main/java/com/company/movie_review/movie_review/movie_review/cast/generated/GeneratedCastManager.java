package com.company.movie_review.movie_review.movie_review.cast.generated;

import com.company.movie_review.movie_review.movie_review.cast.Cast;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.movie_review.movie_review.movie_review.cast.Cast} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedCastManager extends Manager<Cast> {
    
    TableIdentifier<Cast> IDENTIFIER = TableIdentifier.of("movie_review", "movie_review", "cast");
    List<Field<Cast>> FIELDS = unmodifiableList(asList(
        Cast.ID,
        Cast.CAST_NAME,
        Cast.CAST_GENDER,
        Cast.CAST_IMAGE,
        Cast.CAST_DESCRIPTION,
        Cast.CAST_BIRTHDAY
    ));
    
    @Override
    default Class<Cast> getEntityClass() {
        return Cast.class;
    }
}