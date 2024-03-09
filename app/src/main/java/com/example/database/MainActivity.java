package com.example.database;
import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Entity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Entity
public class MainActivity extends AppCompatActivity {
    private NoteRepository noteRepository;
    private final ExecutorService executorService = Executors.newFixedThreadPool(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button butt = findViewById(R.id.butt);
        TextView tx = findViewById(R.id.tx);
        noteRepository = new NoteRepository(getApplication());
        butt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //executorService.execute(() -> noteRepository.insert(new Note(88, "Alex")));
                //executorService.execute(() -> tx.setText(noteRepository.getAllNote().toString()));
                //executorService.execute(() -> noteRepository.deleteById(1));
                //executorService.execute(() -> Log.d("Base123",noteRepository.getAllNote()));
                executorService.execute(() -> Log.d("Base123",noteRepository.findById(2)));
            }
        });
    }
}