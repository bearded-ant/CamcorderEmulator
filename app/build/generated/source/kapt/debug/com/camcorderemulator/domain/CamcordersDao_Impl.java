package com.camcorderemulator.domain;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CamcordersDao_Impl implements CamcordersDao {
  private final RoomDatabase __db;

  public CamcordersDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<Camcorder> getAll() {
    final String _sql = "select * from camcorders";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfVendorCode = CursorUtil.getColumnIndexOrThrow(_cursor, "vendorCode");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfCost = CursorUtil.getColumnIndexOrThrow(_cursor, "cost");
      final int _cursorIndexOfAngle = CursorUtil.getColumnIndexOrThrow(_cursor, "viewing_angle");
      final List<Camcorder> _result = new ArrayList<Camcorder>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Camcorder _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpVendorCode;
        if (_cursor.isNull(_cursorIndexOfVendorCode)) {
          _tmpVendorCode = null;
        } else {
          _tmpVendorCode = _cursor.getString(_cursorIndexOfVendorCode);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpCost;
        if (_cursor.isNull(_cursorIndexOfCost)) {
          _tmpCost = null;
        } else {
          _tmpCost = _cursor.getString(_cursorIndexOfCost);
        }
        final String _tmpAngle;
        if (_cursor.isNull(_cursorIndexOfAngle)) {
          _tmpAngle = null;
        } else {
          _tmpAngle = _cursor.getString(_cursorIndexOfAngle);
        }
        _item = new Camcorder(_tmpId,_tmpVendorCode,_tmpName,_tmpCost,_tmpAngle);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
