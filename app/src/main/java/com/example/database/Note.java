package com.example.database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Note_Table")
public class Note {
    @PrimaryKey
    private int id;
    @ColumnInfo(name = "Note_name")
    private String name;

    public Note(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
