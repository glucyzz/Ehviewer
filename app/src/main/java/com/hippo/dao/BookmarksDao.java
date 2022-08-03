package com.hippo.ehviewer.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BOOKMARKS".
*/
public class BookmarksDao extends AbstractDao<BookmarkInfo, Long> {

    public static final String TABLENAME = "BOOKMARKS";

    /**
     * Properties of entity BookmarkInfo.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Gid = new Property(0, long.class, "gid", true, "GID");
        public final static Property Token = new Property(1, String.class, "token", false, "TOKEN");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property TitleJpn = new Property(3, String.class, "titleJpn", false, "TITLE_JPN");
        public final static Property Thumb = new Property(4, String.class, "thumb", false, "THUMB");
        public final static Property Category = new Property(5, int.class, "category", false, "CATEGORY");
        public final static Property Posted = new Property(6, String.class, "posted", false, "POSTED");
        public final static Property Uploader = new Property(7, String.class, "uploader", false, "UPLOADER");
        public final static Property Rating = new Property(8, float.class, "rating", false, "RATING");
        public final static Property SimpleLanguage = new Property(9, String.class, "simpleLanguage", false, "SIMPLE_LANGUAGE");
        public final static Property Page = new Property(10, int.class, "page", false, "PAGE");
        public final static Property Time = new Property(11, long.class, "time", false, "TIME");
    }


    public BookmarksDao(DaoConfig config) {
        super(config);
    }
    
    public BookmarksDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BOOKMARKS\" (" + //
                "\"GID\" INTEGER PRIMARY KEY NOT NULL ," + // 0: gid
                "\"TOKEN\" TEXT," + // 1: token
                "\"TITLE\" TEXT," + // 2: title
                "\"TITLE_JPN\" TEXT," + // 3: titleJpn
                "\"THUMB\" TEXT," + // 4: thumb
                "\"CATEGORY\" INTEGER NOT NULL ," + // 5: category
                "\"POSTED\" TEXT," + // 6: posted
                "\"UPLOADER\" TEXT," + // 7: uploader
                "\"RATING\" REAL NOT NULL ," + // 8: rating
                "\"SIMPLE_LANGUAGE\" TEXT," + // 9: simpleLanguage
                "\"PAGE\" INTEGER NOT NULL ," + // 10: page
                "\"TIME\" INTEGER NOT NULL );"); // 11: time
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BOOKMARKS\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BookmarkInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getGid());
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(2, token);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String titleJpn = entity.getTitleJpn();
        if (titleJpn != null) {
            stmt.bindString(4, titleJpn);
        }
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(5, thumb);
        }
        stmt.bindLong(6, entity.getCategory());
 
        String posted = entity.getPosted();
        if (posted != null) {
            stmt.bindString(7, posted);
        }
 
        String uploader = entity.getUploader();
        if (uploader != null) {
            stmt.bindString(8, uploader);
        }
        stmt.bindDouble(9, entity.getRating());
 
        String simpleLanguage = entity.getSimpleLanguage();
        if (simpleLanguage != null) {
            stmt.bindString(10, simpleLanguage);
        }
        stmt.bindLong(11, entity.getPage());
        stmt.bindLong(12, entity.getTime());
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BookmarkInfo entity) {
        stmt.clearBindings();
        stmt.bindLong(1, entity.getGid());
 
        String token = entity.getToken();
        if (token != null) {
            stmt.bindString(2, token);
        }
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String titleJpn = entity.getTitleJpn();
        if (titleJpn != null) {
            stmt.bindString(4, titleJpn);
        }
 
        String thumb = entity.getThumb();
        if (thumb != null) {
            stmt.bindString(5, thumb);
        }
        stmt.bindLong(6, entity.getCategory());
 
        String posted = entity.getPosted();
        if (posted != null) {
            stmt.bindString(7, posted);
        }
 
        String uploader = entity.getUploader();
        if (uploader != null) {
            stmt.bindString(8, uploader);
        }
        stmt.bindDouble(9, entity.getRating());
 
        String simpleLanguage = entity.getSimpleLanguage();
        if (simpleLanguage != null) {
            stmt.bindString(10, simpleLanguage);
        }
        stmt.bindLong(11, entity.getPage());
        stmt.bindLong(12, entity.getTime());
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.getLong(offset + 0);
    }    

    @Override
    public BookmarkInfo readEntity(Cursor cursor, int offset) {
        BookmarkInfo entity = new BookmarkInfo( //
            cursor.getLong(offset + 0), // gid
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // token
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // titleJpn
            cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4), // thumb
            cursor.getInt(offset + 5), // category
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // posted
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // uploader
            cursor.getFloat(offset + 8), // rating
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // simpleLanguage
            cursor.getInt(offset + 10), // page
            cursor.getLong(offset + 11) // time
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BookmarkInfo entity, int offset) {
        entity.setGid(cursor.getLong(offset + 0));
        entity.setToken(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setTitleJpn(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setThumb(cursor.isNull(offset + 4) ? null : cursor.getString(offset + 4));
        entity.setCategory(cursor.getInt(offset + 5));
        entity.setPosted(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setUploader(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setRating(cursor.getFloat(offset + 8));
        entity.setSimpleLanguage(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setPage(cursor.getInt(offset + 10));
        entity.setTime(cursor.getLong(offset + 11));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BookmarkInfo entity, long rowId) {
        entity.setGid(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BookmarkInfo entity) {
        if(entity != null) {
            return entity.getGid();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BookmarkInfo entity) {
        throw new UnsupportedOperationException("Unsupported for entities with a non-null key");
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
