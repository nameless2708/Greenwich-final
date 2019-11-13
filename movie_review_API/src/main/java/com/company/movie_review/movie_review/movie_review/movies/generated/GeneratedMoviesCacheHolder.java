package com.company.movie_review.movie_review.movie_review.movies.generated;

import com.company.movie_review.movie_review.movie_review.movies.Movies;
import com.company.movie_review.movie_review.movie_review.movies.MoviesEntityStoreSerializerImpl;
import com.company.movie_review.movie_review.movie_review.movies.MoviesManager;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.tuple.Tuple2;
import com.speedment.common.tuple.Tuples;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStore;
import com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreHolder;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfComparable;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfInt;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache.OfString;
import com.speedment.enterprise.datastore.runtime.fieldcache.FieldCache;
import com.speedment.enterprise.datastore.runtime.fieldcache.MultiFieldCache;
import com.speedment.enterprise.datastore.runtime.statistic.Statistics;
import com.speedment.enterprise.datastore.runtime.util.DataStoreHolderUtil;
import com.speedment.enterprise.datastore.runtime.util.StatisticsUtil;
import com.speedment.runtime.bulk.PersistOperation;
import com.speedment.runtime.bulk.RemoveOperation;
import com.speedment.runtime.bulk.UpdateOperation;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.ColumnLabel;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.StreamSupplierComponent;
import com.speedment.runtime.field.Field;
import com.speedment.runtime.field.trait.HasIdentifier;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

/**
 * A holder class for the various caches that are used to speed up the {@link
 * MoviesManager}.
 * 
 * Generated by
 * com.speedment.enterprise.datastore.generator.internal.code.GeneratedEntityCacheHolderTranslator
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public final class GeneratedMoviesCacheHolder implements EntityStoreHolder<Movies> {
    
    private final EntityStore<Movies> entityStore;
    private final OfInt fieldIdCache;
    private final OfString fieldPosterPathCache;
    private final OfString fieldOriginalTitleCache;
    private final OfString fieldBackdropPathCache;
    private final OfString fieldOverviewCache;
    private final OfComparable<Timestamp> fieldReleaseDateCache;
    private final OfString fieldDirectorCache;
    private final OfInt fieldVoteAverageCache;
    
    public GeneratedMoviesCacheHolder(
            EntityStore<Movies> entityStore,
            OfInt fieldIdCache,
            OfString fieldPosterPathCache,
            OfString fieldOriginalTitleCache,
            OfString fieldBackdropPathCache,
            OfString fieldOverviewCache,
            OfComparable<Timestamp> fieldReleaseDateCache,
            OfString fieldDirectorCache,
            OfInt fieldVoteAverageCache) {
        
        this.entityStore             = requireNonNull(entityStore);
        this.fieldIdCache            = requireNonNull(fieldIdCache);
        this.fieldPosterPathCache    = requireNonNull(fieldPosterPathCache);
        this.fieldOriginalTitleCache = requireNonNull(fieldOriginalTitleCache);
        this.fieldBackdropPathCache  = requireNonNull(fieldBackdropPathCache);
        this.fieldOverviewCache      = requireNonNull(fieldOverviewCache);
        this.fieldReleaseDateCache   = requireNonNull(fieldReleaseDateCache);
        this.fieldDirectorCache      = requireNonNull(fieldDirectorCache);
        this.fieldVoteAverageCache   = requireNonNull(fieldVoteAverageCache);
    }
    
    @Override
    public EntityStore<Movies> getEntityStore() {
        return entityStore;
    }
    
    @Override
    @SuppressWarnings("unchecked")
    public <CACHE extends FieldCache<CACHE>> CACHE getFieldCache(ColumnIdentifier<Movies> columnId) {
        if (columnId instanceof Movies.Identifier) {
            final Movies.Identifier _id = (Movies.Identifier) columnId;
            switch (_id) {
                case ID             : return (CACHE) fieldIdCache;
                case POSTER_PATH    : return (CACHE) fieldPosterPathCache;
                case ORIGINAL_TITLE : return (CACHE) fieldOriginalTitleCache;
                case BACKDROP_PATH  : return (CACHE) fieldBackdropPathCache;
                case OVERVIEW       : return (CACHE) fieldOverviewCache;
                case RELEASE_DATE   : return (CACHE) fieldReleaseDateCache;
                case DIRECTOR       : return (CACHE) fieldDirectorCache;
                case VOTE_AVERAGE   : return (CACHE) fieldVoteAverageCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown enum constant '%s'.", _id)
                    );
                }
            }
        } else {
            final String _colName = columnId.getColumnId();
            switch (_colName) {
                case "ID"             : return (CACHE) fieldIdCache;
                case "poster_path"    : return (CACHE) fieldPosterPathCache;
                case "original_title" : return (CACHE) fieldOriginalTitleCache;
                case "backdrop_path"  : return (CACHE) fieldBackdropPathCache;
                case "overview"       : return (CACHE) fieldOverviewCache;
                case "release_date"   : return (CACHE) fieldReleaseDateCache;
                case "director"       : return (CACHE) fieldDirectorCache;
                case "vote_average"   : return (CACHE) fieldVoteAverageCache;
                default : {
                    throw new UnsupportedOperationException(
                        String.format("Unknown column name '%s'.", _colName)
                    );
                }
            }
        }
    }
    
    @Override
    public boolean isHavingMultiFieldCache(ColumnIdentifier<Movies> columnId) {
        return false;
    }
    
    public static CompletableFuture<GeneratedMoviesCacheHolder> reload(StreamSupplierComponent streamSupplier, ExecutorService executor) {
        return reload(DataStoreHolderUtil.buildEntityStore(
            streamSupplier,
            executor,
            MoviesEntityStoreSerializerImpl::new,
            TableIdentifier.of("movie_review", "movie_review", "movies")
        ), executor);
    }
    
    @Override
    public EntityStoreHolder<Movies> recycleAndPersist(PersistOperation<Movies> persistOperation) {
        return wrapped().recycleAndPersist(persistOperation);
    }
    
    @Override
    public EntityStoreHolder<Movies> recycleAndRemove(RemoveOperation<Movies> removeOperation) {
        return wrapped().recycleAndRemove(removeOperation);
    }
    
    @Override
    public EntityStoreHolder<Movies> recycleAndUpdate(UpdateOperation<Movies> updateOperation) {
        return wrapped().recycleAndUpdate(updateOperation);
    }
    
    private EntityStoreHolder<Movies> wrapped() {
        // Use explicit type for Stream to improve compilation time.
        final Map<ColumnLabel, FieldCache<?>> fieldCaches = Stream.<Tuple2<HasIdentifier<Movies>, FieldCache<?>>>of(
            Tuples.of(Movies.ID,            fieldIdCache),
            Tuples.of(Movies.POSTER_PATH,   fieldPosterPathCache),
            Tuples.of(Movies.ORIGINAL_TITLE,fieldOriginalTitleCache),
            Tuples.of(Movies.BACKDROP_PATH, fieldBackdropPathCache),
            Tuples.of(Movies.OVERVIEW,      fieldOverviewCache),
            Tuples.of(Movies.RELEASE_DATE,  fieldReleaseDateCache),
            Tuples.of(Movies.DIRECTOR,      fieldDirectorCache),
            Tuples.of(Movies.VOTE_AVERAGE,  fieldVoteAverageCache)
        )
            .collect(toMap(t2 -> t2.get0().identifier().label(), Tuple2::get1));
        final Map<ColumnLabel,  Map<ColumnLabel, MultiFieldCache<?, ?, ?>>>  multiFieldCaches = createMultiCacheMap();
        final Set<ColumnIdentifier<Movies>> columnIdentifiers = Stream.<HasIdentifier<Movies>>of(
            Movies.ID,
            Movies.POSTER_PATH,
            Movies.ORIGINAL_TITLE,
            Movies.BACKDROP_PATH,
            Movies.OVERVIEW,
            Movies.RELEASE_DATE,
            Movies.DIRECTOR,
            Movies.VOTE_AVERAGE
        )
            .map(HasIdentifier::identifier)
            .collect(toSet());
        return EntityStoreHolder.of(
            entityStore,
            fieldCaches,
            multiFieldCaches,
            columnIdentifiers
        );
    }
    
    public static CompletableFuture<GeneratedMoviesCacheHolder> reload(CompletableFuture<EntityStore<Movies>> entityStoreFuture, ExecutorService executor) {
        final CompletableFuture<FieldCache.OfInt> fieldIdCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Movies.ID, FieldCache.DISTINCT);
        
        final CompletableFuture<FieldCache.OfString> fieldPosterPathCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Movies.POSTER_PATH, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldOriginalTitleCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Movies.ORIGINAL_TITLE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldBackdropPathCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Movies.BACKDROP_PATH, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldOverviewCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Movies.OVERVIEW, 0);
        
        final CompletableFuture<FieldCache.OfComparable<Timestamp>> fieldReleaseDateCacheFuture =
            DataStoreHolderUtil.buildComparableCache(entityStoreFuture, executor, Movies.RELEASE_DATE, 0);
        
        final CompletableFuture<FieldCache.OfString> fieldDirectorCacheFuture =
            DataStoreHolderUtil.buildStringCache(entityStoreFuture, executor, Movies.DIRECTOR, 0);
        
        final CompletableFuture<FieldCache.OfInt> fieldVoteAverageCacheFuture =
            DataStoreHolderUtil.buildIntCache(entityStoreFuture, executor, Movies.VOTE_AVERAGE, 0);
        
        return entityStoreFuture.thenApplyAsync(entityStore -> {
            try {
                return new GeneratedMoviesCacheHolder(
                    entityStore,
                    fieldIdCacheFuture.get(),
                    fieldPosterPathCacheFuture.get(),
                    fieldOriginalTitleCacheFuture.get(),
                    fieldBackdropPathCacheFuture.get(),
                    fieldOverviewCacheFuture.get(),
                    fieldReleaseDateCacheFuture.get(),
                    fieldDirectorCacheFuture.get(),
                    fieldVoteAverageCacheFuture.get()
                );
            } catch (final ExecutionException | InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        });
    }
    
    @Override
    public void close() {
        entityStore.close();
        fieldIdCache.close();
        fieldPosterPathCache.close();
        fieldOriginalTitleCache.close();
        fieldBackdropPathCache.close();
        fieldOverviewCache.close();
        fieldReleaseDateCache.close();
        fieldDirectorCache.close();
        fieldVoteAverageCache.close();
    }
    
    @Override
    public Statistics getStatistics() {
        return StatisticsUtil.getStatistics(    
            this,
            entityStore.identifier(),
            Arrays.asList(
                Movies.Identifier.ID,
                Movies.Identifier.POSTER_PATH,
                Movies.Identifier.ORIGINAL_TITLE,
                Movies.Identifier.BACKDROP_PATH,
                Movies.Identifier.OVERVIEW,
                Movies.Identifier.RELEASE_DATE,
                Movies.Identifier.DIRECTOR,
                Movies.Identifier.VOTE_AVERAGE
            )
        
        );
    }
    
    private Map<ColumnLabel, Map<ColumnLabel, MultiFieldCache<?, ?, ?>>> createMultiCacheMap() {
        return Collections.emptyMap();
    }
}