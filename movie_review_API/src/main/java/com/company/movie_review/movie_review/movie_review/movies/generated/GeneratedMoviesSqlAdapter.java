package com.company.movie_review.movie_review.movie_review.movies.generated;

import com.company.movie_review.movie_review.movie_review.movies.Movies;
import com.company.movie_review.movie_review.movie_review.movies.MoviesImpl;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.db.SqlFunction;

import java.sql.ResultSet;
import java.sql.SQLException;

import static com.speedment.common.injector.State.RESOLVED;
import static com.speedment.runtime.core.internal.util.sql.ResultSetUtil.*;

/**
 * The generated Sql Adapter for a {@link
 * com.company.movie_review.movie_review.movie_review.movies.Movies} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMoviesSqlAdapter implements SqlAdapter<Movies> {
    
    private final TableIdentifier<Movies> tableIdentifier;
    
    protected GeneratedMoviesSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("movie_review", "movie_review", "movies");
    }
    
    protected Movies apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(            resultSet.getInt(1 + offset))
            .setPosterPath(    resultSet.getString(2 + offset))
            .setOriginalTitle( resultSet.getString(3 + offset))
            .setBackdropPath(  resultSet.getString(4 + offset))
            .setOverview(      resultSet.getString(5 + offset))
            .setReleaseDate(   resultSet.getTimestamp(6 + offset))
            .setDirector(      resultSet.getString(7 + offset))
            .setVoteAverage(   getInt(resultSet, 8 + offset))
            ;
    }
    
    protected MoviesImpl createEntity() {
        return new MoviesImpl();
    }
    
    @Override
    public TableIdentifier<Movies> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Movies> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Movies> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
}