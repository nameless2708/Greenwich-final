package com.company.movie_review.movie_review.movie_review.cast.generated;

import com.company.movie_review.movie_review.movie_review.cast.Cast;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.util.OptionalUtil;

import java.sql.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.movie_review.movie_review.movie_review.cast.Cast}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCastImpl implements Cast {
    
    private int id;
    private String castName;
    private Integer castGender;
    private String castImage;
    private String castDescription;
    private Date castBirthday;
    
    protected GeneratedCastImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public Optional<String> getCastName() {
        return Optional.ofNullable(castName);
    }
    
    @Override
    public OptionalInt getCastGender() {
        return OptionalUtil.ofNullable(castGender);
    }
    
    @Override
    public Optional<String> getCastImage() {
        return Optional.ofNullable(castImage);
    }
    
    @Override
    public Optional<String> getCastDescription() {
        return Optional.ofNullable(castDescription);
    }
    
    @Override
    public Optional<Date> getCastBirthday() {
        return Optional.ofNullable(castBirthday);
    }
    
    @Override
    public Cast setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Cast setCastName(String castName) {
        this.castName = castName;
        return this;
    }
    
    @Override
    public Cast setCastGender(Integer castGender) {
        this.castGender = castGender;
        return this;
    }
    
    @Override
    public Cast setCastImage(String castImage) {
        this.castImage = castImage;
        return this;
    }
    
    @Override
    public Cast setCastDescription(String castDescription) {
        this.castDescription = castDescription;
        return this;
    }
    
    @Override
    public Cast setCastBirthday(Date castBirthday) {
        this.castBirthday = castBirthday;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "              + Objects.toString(getId()));
        sj.add("castName = "        + Objects.toString(OptionalUtil.unwrap(getCastName())));
        sj.add("castGender = "      + Objects.toString(OptionalUtil.unwrap(getCastGender())));
        sj.add("castImage = "       + Objects.toString(OptionalUtil.unwrap(getCastImage())));
        sj.add("castDescription = " + Objects.toString(OptionalUtil.unwrap(getCastDescription())));
        sj.add("castBirthday = "    + Objects.toString(OptionalUtil.unwrap(getCastBirthday())));
        return "CastImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Cast)) { return false; }
        final Cast thatCast = (Cast)that;
        if (this.getId() != thatCast.getId()) { return false; }
        if (!Objects.equals(this.getCastName(), thatCast.getCastName())) { return false; }
        if (!Objects.equals(this.getCastGender(), thatCast.getCastGender())) { return false; }
        if (!Objects.equals(this.getCastImage(), thatCast.getCastImage())) { return false; }
        if (!Objects.equals(this.getCastDescription(), thatCast.getCastDescription())) { return false; }
        if (!Objects.equals(this.getCastBirthday(), thatCast.getCastBirthday())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCastName()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCastGender()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCastImage()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCastDescription()));
        hash = 31 * hash + Objects.hashCode(OptionalUtil.unwrap(getCastBirthday()));
        return hash;
    }
}