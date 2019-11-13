package com.company.movie_review.movie_review.movie_review.movies.generated;

import com.company.movie_review.movie_review.movie_review.movies.Movies;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Timestamp;
import java.util.Optional;
import java.util.OptionalInt;

/**
 * The generated base for the {@link
 * com.company.movie_review.movie_review.movie_review.movies.Movies}-interface
 * representing entities of the {@code movies}-table in the database.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedMovies {
    
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getId()} method.
     */
    IntField<Movies, Integer> ID = DatastoreFields.createIntField(
        Identifier.ID,
        Movies::getId,
        Movies::setId,
        TypeMapper.primitive(),
        true
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getPosterPath()} method.
     */
    StringField<Movies, String> POSTER_PATH = DatastoreFields.createStringField(
        Identifier.POSTER_PATH,
        o -> OptionalUtil.unwrap(o.getPosterPath()),
        Movies::setPosterPath,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getOriginalTitle()} method.
     */
    StringField<Movies, String> ORIGINAL_TITLE = DatastoreFields.createStringField(
        Identifier.ORIGINAL_TITLE,
        o -> OptionalUtil.unwrap(o.getOriginalTitle()),
        Movies::setOriginalTitle,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getBackdropPath()} method.
     */
    StringField<Movies, String> BACKDROP_PATH = DatastoreFields.createStringField(
        Identifier.BACKDROP_PATH,
        o -> OptionalUtil.unwrap(o.getBackdropPath()),
        Movies::setBackdropPath,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getOverview()} method.
     */
    StringField<Movies, String> OVERVIEW = DatastoreFields.createStringField(
        Identifier.OVERVIEW,
        o -> OptionalUtil.unwrap(o.getOverview()),
        Movies::setOverview,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getReleaseDate()} method.
     */
    ComparableField<Movies, Timestamp, Timestamp> RELEASE_DATE = DatastoreFields.createComparableField(
        Identifier.RELEASE_DATE,
        o -> OptionalUtil.unwrap(o.getReleaseDate()),
        Movies::setReleaseDate,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getDirector()} method.
     */
    StringField<Movies, String> DIRECTOR = DatastoreFields.createStringField(
        Identifier.DIRECTOR,
        o -> OptionalUtil.unwrap(o.getDirector()),
        Movies::setDirector,
        TypeMapper.identity(),
        false
    );
    /**
     * This Field corresponds to the {@link Movies} field that can be obtained
     * using the {@link Movies#getVoteAverage()} method.
     */
    ComparableField<Movies, Integer, Integer> VOTE_AVERAGE = DatastoreFields.createComparableField(
        Identifier.VOTE_AVERAGE,
        o -> OptionalUtil.unwrap(o.getVoteAverage()),
        Movies::setVoteAverage,
        TypeMapper.identity(),
        false
    );
    
    /**
     * Returns the id of this Movies. The id field corresponds to the database
     * column movie_review.movie_review.movies.ID.
     * 
     * @return the id of this Movies
     */
    int getId();
    
    /**
     * Returns the posterPath of this Movies. The posterPath field corresponds
     * to the database column movie_review.movie_review.movies.poster_path.
     * 
     * @return the posterPath of this Movies
     */
    Optional<String> getPosterPath();
    
    /**
     * Returns the originalTitle of this Movies. The originalTitle field
     * corresponds to the database column
     * movie_review.movie_review.movies.original_title.
     * 
     * @return the originalTitle of this Movies
     */
    Optional<String> getOriginalTitle();
    
    /**
     * Returns the backdropPath of this Movies. The backdropPath field
     * corresponds to the database column
     * movie_review.movie_review.movies.backdrop_path.
     * 
     * @return the backdropPath of this Movies
     */
    Optional<String> getBackdropPath();
    
    /**
     * Returns the overview of this Movies. The overview field corresponds to
     * the database column movie_review.movie_review.movies.overview.
     * 
     * @return the overview of this Movies
     */
    Optional<String> getOverview();
    
    /**
     * Returns the releaseDate of this Movies. The releaseDate field corresponds
     * to the database column movie_review.movie_review.movies.release_date.
     * 
     * @return the releaseDate of this Movies
     */
    Optional<Timestamp> getReleaseDate();
    
    /**
     * Returns the director of this Movies. The director field corresponds to
     * the database column movie_review.movie_review.movies.director.
     * 
     * @return the director of this Movies
     */
    Optional<String> getDirector();
    
    /**
     * Returns the voteAverage of this Movies. The voteAverage field corresponds
     * to the database column movie_review.movie_review.movies.vote_average.
     * 
     * @return the voteAverage of this Movies
     */
    OptionalInt getVoteAverage();
    
    /**
     * Sets the id of this Movies. The id field corresponds to the database
     * column movie_review.movie_review.movies.ID.
     * 
     * @param id to set of this Movies
     * @return   this Movies instance
     */
    Movies setId(int id);
    
    /**
     * Sets the posterPath of this Movies. The posterPath field corresponds to
     * the database column movie_review.movie_review.movies.poster_path.
     * 
     * @param posterPath to set of this Movies
     * @return           this Movies instance
     */
    Movies setPosterPath(String posterPath);
    
    /**
     * Sets the originalTitle of this Movies. The originalTitle field
     * corresponds to the database column
     * movie_review.movie_review.movies.original_title.
     * 
     * @param originalTitle to set of this Movies
     * @return              this Movies instance
     */
    Movies setOriginalTitle(String originalTitle);
    
    /**
     * Sets the backdropPath of this Movies. The backdropPath field corresponds
     * to the database column movie_review.movie_review.movies.backdrop_path.
     * 
     * @param backdropPath to set of this Movies
     * @return             this Movies instance
     */
    Movies setBackdropPath(String backdropPath);
    
    /**
     * Sets the overview of this Movies. The overview field corresponds to the
     * database column movie_review.movie_review.movies.overview.
     * 
     * @param overview to set of this Movies
     * @return         this Movies instance
     */
    Movies setOverview(String overview);
    
    /**
     * Sets the releaseDate of this Movies. The releaseDate field corresponds to
     * the database column movie_review.movie_review.movies.release_date.
     * 
     * @param releaseDate to set of this Movies
     * @return            this Movies instance
     */
    Movies setReleaseDate(Timestamp releaseDate);
    
    /**
     * Sets the director of this Movies. The director field corresponds to the
     * database column movie_review.movie_review.movies.director.
     * 
     * @param director to set of this Movies
     * @return         this Movies instance
     */
    Movies setDirector(String director);
    
    /**
     * Sets the voteAverage of this Movies. The voteAverage field corresponds to
     * the database column movie_review.movie_review.movies.vote_average.
     * 
     * @param voteAverage to set of this Movies
     * @return            this Movies instance
     */
    Movies setVoteAverage(Integer voteAverage);
    
    enum Identifier implements ColumnIdentifier<Movies> {
        
        ID             ("ID"),
        POSTER_PATH    ("poster_path"),
        ORIGINAL_TITLE ("original_title"),
        BACKDROP_PATH  ("backdrop_path"),
        OVERVIEW       ("overview"),
        RELEASE_DATE   ("release_date"),
        DIRECTOR       ("director"),
        VOTE_AVERAGE   ("vote_average");
        
        private final String columnId;
        private final TableIdentifier<Movies> tableIdentifier;
        
        Identifier(String columnId) {
            this.columnId        = columnId;
            this.tableIdentifier = TableIdentifier.of(    getDbmsId(), 
                getSchemaId(), 
                getTableId());
        }
        
        @Override
        public String getDbmsId() {
            return "movie_review";
        }
        
        @Override
        public String getSchemaId() {
            return "movie_review";
        }
        
        @Override
        public String getTableId() {
            return "movies";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Movies> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}