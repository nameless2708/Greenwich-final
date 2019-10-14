package com.company.movie_review.movie_review.movie_review.user.generated;

import com.company.movie_review.movie_review.movie_review.user.User;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * com.company.movie_review.movie_review.movie_review.user.User} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedUserManager extends Manager<User> {
    
    TableIdentifier<User> IDENTIFIER = TableIdentifier.of("movie_review", "movie_review", "user");
    List<Field<User>> FIELDS = unmodifiableList(asList(
        User.ID,
        User.USERNAME,
        User.PASSWORD,
        User.EMAIL,
        User.PHONE,
        User.FULLNAME,
        User.ADDRESS
    ));
    
    @Override
    default Class<User> getEntityClass() {
        return User.class;
    }
}