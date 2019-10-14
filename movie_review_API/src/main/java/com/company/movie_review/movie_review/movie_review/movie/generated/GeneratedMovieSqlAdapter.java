package com.company.movie_review.movie_review.movie_review.movie.generated;

import com.company.movie_review.movie_review.movie_review.movie.Movie;
import com.company.movie_review.movie_review.movie_review.movie.MovieImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link
 * com.company.movie_review.movie_review.movie_review.movie.Movie} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieSqlAdapter implements SqlAdapter<Movie> {
    
    private final TableIdentifier<Movie> tableIdentifier;
    
    protected GeneratedMovieSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("movie_review", "movie_review", "movie");
    }
    
    protected Movie apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(               resultSet.getInt(1 + offset))
            .setMovieName(        resultSet.getString(2 + offset))
            .setMovieCategory(    resultSet.getString(3 + offset))
            .setMovieDescription( resultSet.getString(4 + offset))
            .setMovieDirector(    resultSet.getString(5 + offset))
            .setMovieDuration(    resultSet.getString(6 + offset))
            .setMovieRating(      resultSet.getString(7 + offset))
            .setMovieImage(       resultSet.getString(8 + offset))
            ;
    }
    
    protected MovieImpl createEntity() {
        return new MovieImpl();
    }
    
    @Override
    public TableIdentifier<Movie> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Movie> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Movie> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}