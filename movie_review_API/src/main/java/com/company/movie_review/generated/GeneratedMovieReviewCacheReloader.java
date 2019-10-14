package com.company.movie_review.generated;

import com.company.movie_review.movie_review.movie_review.cast.generated.GeneratedCastCacheHolder;
import com.company.movie_review.movie_review.movie_review.movie.generated.GeneratedMovieCacheHolder;
import com.company.movie_review.movie_review.movie_review.movie_cast.generated.GeneratedMovieCastCacheHolder;
import com.company.movie_review.movie_review.movie_review.movie_review.generated.GeneratedMovieReviewCacheHolder;
import com.company.movie_review.movie_review.movie_review.user.generated.GeneratedUserCacheHolder;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.benchmark.Stopwatch;
import com.speedment.enterprise.datastore.runtime.DataStoreHolder;
import com.speedment.enterprise.datastore.runtime.DataStoreReloader;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.runtime.core.component.StreamSupplierComponent;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;

/**
 * A reloader that loads updates from a stream source and creates a new holder
 * for that state.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedMovieReviewCacheReloader implements DataStoreReloader {
    
    @Override
    public DataStoreHolder reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        final CompletableFuture<GeneratedCastCacheHolder> castHolder                = GeneratedCastCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedMovieCacheHolder> movieHolder              = GeneratedMovieCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedMovieCastCacheHolder> movieCastHolder      = GeneratedMovieCastCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedMovieReviewCacheHolder> movieReviewHolder  = GeneratedMovieReviewCacheHolder.reload(streamSupplier, executor);
        final CompletableFuture<GeneratedUserCacheHolder> userHolder                = GeneratedUserCacheHolder.reload(streamSupplier, executor);
        
        final DataStoreHolder holder;
        try {
            holder = new GeneratedMovieReviewDataStoreHolder(
                castHolder.get(),
                movieHolder.get(),
                movieCastHolder.get(),
                movieReviewHolder.get(),
                userHolder.get()
            );
        } catch (final ExecutionException | InterruptedException ex) {
            throw new RuntimeException("Error reloading caches.", ex);
        }
        
        DataStoreHolderUtil.decorateEntityStores(holder, executor);
        return holder;
    }
}