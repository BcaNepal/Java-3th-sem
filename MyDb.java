Sqlite database with android java

SQLiteDatabase
SQLiteOpenHelper

android.database.sqlite

 DbHelper sqliteHelper =  new DbHelper(MainActivity.this);
// insert values into database

SQLiteDatabase db = sqliteHelper.getWritableDatabase();
ContentValues values = new ContentValues();
values.put("Id", 1);
values.put("StdName", "Ram");
values.put("Email", "ram@gmail.com");
long numRowsAdded = db.insert("Student", null, values);
db.close();
// for delete
SQLiteDatabase db = sqliteHelper.getWritableDatabase();
// delete from Student where id=1 and stdName like 'ra%'
long numRowsDeleted = db.delete("Student", "id=?", {stdId}); // values;
// for update 
SQLiteDatabase db = sqliteHelper.getWritableDatabase();
ContentValues values = new ContentValues();
values.put("Id", 1);
values.put("StdName", "Ram");
values.put("Email", "ram@gmail.com");
long numRowsEdited = db.update("Student", values, "id=?", {stdId});
// for query
SQLiteDatabase db = sqliteHelper.getReadableDatabase();
Cursor cr = db.rawQuery("SELECT * FROM Student WHERE id=?", {stdId});
//Cursor cr = db.query("Student", null, "id=?", {stdId}, null, null, null );
//db.query("Student", columns_name_Array, "where_Clause", where_value_Array, group_by, having, order_by );
cr.moveToNext();
int id = cr.getInt(0);
String stdName = cr.getString(1);
cr.close();
db.close();

