package com.example.test_01.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper {
    //tạo database sql
    private Context context;
    private static final String DATABASE_NAME = "sinhvien.db";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_USER = "user";

    //tạo constructor
    public DbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        this.context = context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        //tạo table
        String Sinhvien = "CREATE TABLE SINHVIEN (MASV INTEGER PRIMARY KEY AUTOINCREMENT, TENSV TEXT, DIEMSV INTEGER)";
        sqLiteDatabase.execSQL(Sinhvien);


        //tạo data mẫu
        String InsertSinhvien = "INSERT INTO SINHVIEN VALUES (1, 'Nguyen Van A', 9)";
        sqLiteDatabase.execSQL(InsertSinhvien);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
       if (i != i1) {
           sqLiteDatabase.execSQL("DROP TABLE IF EXISTS SINHVIEN");
           onCreate(sqLiteDatabase);
       }
    }
}
