package com.camcorderemulator.domain;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class CamcordersBase_Impl extends CamcordersBase {
  private volatile CamcordersDao _camcordersDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `camcorders` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `vendorCode` TEXT, `name` TEXT, `cost` TEXT, `viewing_angle` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `camdimensions` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `cam_id` INTEGER, `cam_dimens` TEXT, `aspect_ratio` TEXT)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a768bef31166ac3aa83e483b6a2fe8b0')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `camcorders`");
        _db.execSQL("DROP TABLE IF EXISTS `camdimensions`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCamcorders = new HashMap<String, TableInfo.Column>(5);
        _columnsCamcorders.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamcorders.put("vendorCode", new TableInfo.Column("vendorCode", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamcorders.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamcorders.put("cost", new TableInfo.Column("cost", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamcorders.put("viewing_angle", new TableInfo.Column("viewing_angle", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCamcorders = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCamcorders = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCamcorders = new TableInfo("camcorders", _columnsCamcorders, _foreignKeysCamcorders, _indicesCamcorders);
        final TableInfo _existingCamcorders = TableInfo.read(_db, "camcorders");
        if (! _infoCamcorders.equals(_existingCamcorders)) {
          return new RoomOpenHelper.ValidationResult(false, "camcorders(com.camcorderemulator.domain.Camcorder).\n"
                  + " Expected:\n" + _infoCamcorders + "\n"
                  + " Found:\n" + _existingCamcorders);
        }
        final HashMap<String, TableInfo.Column> _columnsCamdimensions = new HashMap<String, TableInfo.Column>(4);
        _columnsCamdimensions.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamdimensions.put("cam_id", new TableInfo.Column("cam_id", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamdimensions.put("cam_dimens", new TableInfo.Column("cam_dimens", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCamdimensions.put("aspect_ratio", new TableInfo.Column("aspect_ratio", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCamdimensions = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCamdimensions = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCamdimensions = new TableInfo("camdimensions", _columnsCamdimensions, _foreignKeysCamdimensions, _indicesCamdimensions);
        final TableInfo _existingCamdimensions = TableInfo.read(_db, "camdimensions");
        if (! _infoCamdimensions.equals(_existingCamdimensions)) {
          return new RoomOpenHelper.ValidationResult(false, "camdimensions(com.camcorderemulator.domain.Dimensions).\n"
                  + " Expected:\n" + _infoCamdimensions + "\n"
                  + " Found:\n" + _existingCamdimensions);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "a768bef31166ac3aa83e483b6a2fe8b0", "3074c68ddaf56b18da5786d507b026c3");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "camcorders","camdimensions");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `camcorders`");
      _db.execSQL("DELETE FROM `camdimensions`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(CamcordersDao.class, CamcordersDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList();
  }

  @Override
  public CamcordersDao camcordersDao() {
    if (_camcordersDao != null) {
      return _camcordersDao;
    } else {
      synchronized(this) {
        if(_camcordersDao == null) {
          _camcordersDao = new CamcordersDao_Impl(this);
        }
        return _camcordersDao;
      }
    }
  }
}
