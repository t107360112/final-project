package com.example.finalproject;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Myincome extends SQLiteOpenHelper
{
    private static final String name = "mdatabase.db";
    private static final int version = 1;

    Myincome(Context context)
    {
        super(context,name,null,version);
    }
    @Override
    public void onCreate(SQLiteDatabase db)
    {
        db.execSQL("CREATE TABLE myTable(money integer NOT NULL,reason text PRIMARY KEY,year integer NOT NULL,month integer NOT NULL,day integer NOT NULL)");
    }
    @Override
        public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS myTable");
        onCreate(db);
    }
}
