package com.example.database;

import androidx.room.Dao;
import androidx.room.Index;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NoteDAO {
    @Query("SELECT * FROM Note_Table")
    List<Note> getAllNote();

    @Query("DELETE FROM Note_Table WHERE id=:id")
    void deleteById(int id);

    @Query("SELECT * FROM NOTE_TABLE WHERE id=:id")
    Note findById(int id);

    @Insert
    void insert(Note note);
}
