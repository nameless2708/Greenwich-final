package com.company.movie_review.movie_review.movie_review.cast.generated;

import com.company.movie_review.movie_review.movie_review.cast.Cast;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.field.DatastoreFields;
import com.speedment.runtime.config.identifier.ColumnIdentifier;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.util.OptionalUtil;
import com.speedment.runtime.field.ComparableField;
import com.speedment.runtime.field.IntField;
import com.speedment.runtime.field.StringField;
import com.speedment.runtime.typemapper.TypeMapper;

import java.sql.Date;
import java.util.Optional;
import java.util.OptionalInt;


@GeneratedCode("Speedment")
public interface GeneratedCast {
    

    IntField<Cast, Integer> ID = DatastoreFields.createIntField(
        Identifier.ID,
        Cast::getId,
        Cast::setId,
        TypeMapper.primitive(),
        true
    );

    StringField<Cast, String> CAST_NAME = DatastoreFields.createStringField(
        Identifier.CAST_NAME,
        o -> OptionalUtil.unwrap(o.getCastName()),
        Cast::setCastName,
        TypeMapper.identity(),
        false
    );

    ComparableField<Cast, Integer, Integer> CAST_GENDER = DatastoreFields.createComparableField(
        Identifier.CAST_GENDER,
        o -> OptionalUtil.unwrap(o.getCastGender()),
        Cast::setCastGender,
        TypeMapper.identity(),
        false
    );

    StringField<Cast, String> CAST_IMAGE = DatastoreFields.createStringField(
        Identifier.CAST_IMAGE,
        o -> OptionalUtil.unwrap(o.getCastImage()),
        Cast::setCastImage,
        TypeMapper.identity(),
        false
    );

    StringField<Cast, String> CAST_DESCRIPTION = DatastoreFields.createStringField(
        Identifier.CAST_DESCRIPTION,
        o -> OptionalUtil.unwrap(o.getCastDescription()),
        Cast::setCastDescription,
        TypeMapper.identity(),
        false
    );

    ComparableField<Cast, Date, Date> CAST_BIRTHDAY = DatastoreFields.createComparableField(
        Identifier.CAST_BIRTHDAY,
        o -> OptionalUtil.unwrap(o.getCastBirthday()),
        Cast::setCastBirthday,
        TypeMapper.identity(),
        false
    );
    

    int getId();
    

    Optional<String> getCastName();
    
    /**
     * Returns the castGender of this Cast. The castGender field corresponds to
     * the database column movie_review.movie_review.cast.Cast_gender.
     * 
     * @return the castGender of this Cast
     */
    OptionalInt getCastGender();
    
    /**
     * Returns the castImage of this Cast. The castImage field corresponds to
     * the database column movie_review.movie_review.cast.Cast_image.
     * 
     * @return the castImage of this Cast
     */
    Optional<String> getCastImage();
    
    /**
     * Returns the castDescription of this Cast. The castDescription field
     * corresponds to the database column
     * movie_review.movie_review.cast.Cast_description.
     * 
     * @return the castDescription of this Cast
     */
    Optional<String> getCastDescription();
    
    /**
     * Returns the castBirthday of this Cast. The castBirthday field corresponds
     * to the database column movie_review.movie_review.cast.Cast_birthday.
     * 
     * @return the castBirthday of this Cast
     */
    Optional<Date> getCastBirthday();
    
    /**
     * Sets the id of this Cast. The id field corresponds to the database column
     * movie_review.movie_review.cast.ID.
     * 
     * @param id to set of this Cast
     * @return   this Cast instance
     */
    Cast setId(int id);
    
    /**
     * Sets the castName of this Cast. The castName field corresponds to the
     * database column movie_review.movie_review.cast.Cast_name.
     * 
     * @param castName to set of this Cast
     * @return         this Cast instance
     */
    Cast setCastName(String castName);
    
    /**
     * Sets the castGender of this Cast. The castGender field corresponds to the
     * database column movie_review.movie_review.cast.Cast_gender.
     * 
     * @param castGender to set of this Cast
     * @return           this Cast instance
     */
    Cast setCastGender(Integer castGender);
    
    /**
     * Sets the castImage of this Cast. The castImage field corresponds to the
     * database column movie_review.movie_review.cast.Cast_image.
     * 
     * @param castImage to set of this Cast
     * @return          this Cast instance
     */
    Cast setCastImage(String castImage);
    
    /**
     * Sets the castDescription of this Cast. The castDescription field
     * corresponds to the database column
     * movie_review.movie_review.cast.Cast_description.
     * 
     * @param castDescription to set of this Cast
     * @return                this Cast instance
     */
    Cast setCastDescription(String castDescription);
    
    /**
     * Sets the castBirthday of this Cast. The castBirthday field corresponds to
     * the database column movie_review.movie_review.cast.Cast_birthday.
     * 
     * @param castBirthday to set of this Cast
     * @return             this Cast instance
     */
    Cast setCastBirthday(Date castBirthday);
    
    enum Identifier implements ColumnIdentifier<Cast> {
        
        ID               ("ID"),
        CAST_NAME        ("Cast_name"),
        CAST_GENDER      ("Cast_gender"),
        CAST_IMAGE       ("Cast_image"),
        CAST_DESCRIPTION ("Cast_description"),
        CAST_BIRTHDAY    ("Cast_birthday");
        
        private final String columnId;
        private final TableIdentifier<Cast> tableIdentifier;
        
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
            return "cast";
        }
        
        @Override
        public String getColumnId() {
            return this.columnId;
        }
        
        @Override
        public TableIdentifier<Cast> asTableIdentifier() {
            return this.tableIdentifier;
        }
    }
}