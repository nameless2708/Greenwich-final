package com.company.movie_review.movie_review.movie_review.movie_review.generated;

import com.company.movie_review.movie_review.movie_review.movie_review.MovieReview;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.movie_review.movie_review.movie_review.movie_review.MovieReview}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieReviewImpl implements MovieReview {
    
    private int id;
    private Integer movieId;
    private String content;
    private Integer tag;
    private Integer userId;
    
    protected GeneratedMovieReviewImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public OptionalInt getMovieId() {
        return OptionalUtil.ofNullable(movieId);
    }
    
    @Override
    public Optional<String> getContent() {
        return Optional.ofNullable(content);
    }
    
    @Override
    public OptionalInt getTag() {
        return OptionalUtil.ofNullable(tag);
    }
    
    @Override
    public OptionalInt getUserId() {
        return OptionalUtil.ofNullable(userId);
    }
    
    @Override
    public MovieReview setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public MovieReview setMovieId(Integer movieId) {
        this.movieId = movieId;
        return this;
    }
    
    @Override
    public MovieReview setContent(String content) {
        this.content = content;
        return this;
    }
    
    @Override
    public MovieReview setTag(Integer tag) {
        this.tag = tag;
        return this;
    }
    
    @Override
    public MovieReview setUserId(Integer userId) {
        this.userId = userId;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "      + Objects.toString(getId()));
        sj.add("movieId = " + Objects.toString(OptionalUtil.unwrap(getMovieId())));
        sj.add("content = " + Objects.toString(OptionalUtil.unwrap(getContent())));
        sj.add("tag = "     + Objects.toString(OptionalUtil.unwrap(getTag())));
        sj.add("userId = "  + Objects.toString(OptionalUtil.unwrap(getUserId())));
        return "MovieReviewImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof MovieReview)) { return false; }
        final MovieReview thatMovieReview = (MovieReview)that;
        if (this.getId() != thatMovieReview.getId()) { return false; }
        if (!Objects.equals(this.getMovieId(), thatMovieReview.getMovieId())) { return false; }
        if (!Objects.equals(this.getContent(), thatMovieReview.getContent())) { return false; }
        if (!Objects.equals(this.getTag(), thatMovieReview.getTag())) { return false; }
        if (!Objects.equals(this.getUserId(), thatMovieReview.getUserId())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getMovieId()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getContent()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getTag()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getUserId()));
        return hash;
    }
}