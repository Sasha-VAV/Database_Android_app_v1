package com.example.database;

import android.app.Application;

import androidx.room.Room;

public class NoteRepository{
    private final NoteDAO noteDAO;

    public NoteRepository(Application application){
        AppDatabase db = Room.databaseBuilder(application.getApplicationContext(),AppDatabase.class, "MyDB").build();
        noteDAO = db.noteDAO();
    }
    public String getAllNote() {
        String s ="";
        for (int i = 0; i < noteDAO.getAllNote().toArray().length; i++){
            s += noteDAO.getAllNote().get(i).getName()+ " " + noteDAO.getAllNote().get(i).getId() + "\n";
        }
        return s;
    }

    public void insert(Note note) {
        noteDAO.insert(note);
    }

    public String findById(int id){
        return noteDAO.findById(id).getId() + noteDAO.findById(id).getName();
    }

    public void deleteById(int n){
        noteDAO.deleteById(n);
    }
}
