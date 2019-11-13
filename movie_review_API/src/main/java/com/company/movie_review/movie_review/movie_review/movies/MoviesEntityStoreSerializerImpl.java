package com.company.movie_review.movie_review.movie_review.movies;

import com.company.movie_review.movie_review.movie_review.movies.generated.GeneratedMoviesEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named movies.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class MoviesEntityStoreSerializerImpl extends GeneratedMoviesEntityStoreSerializerImpl {
    
    public MoviesEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}