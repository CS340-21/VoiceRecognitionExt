package com.example.avery3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SortedList;

import android.os.Bundle;
import android.widget.Button;
import android.view.*;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private Button button;
    RecyclerView recycle;
    SortedList<String> buttonNames;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewEvent();
            }
        });
    }

    public void openNewEvent() {
        Intent intent = new Intent(this, addEvent.class);
        startActivity(intent);
    }

    //Intended to create a RecyclerView in order to set up a list of buttons,
    //look at my implementation and see if you can figure out why it didn't work for me lol
    public void createRecyclerView() {
        CustomAdaptor tmp = new CustomAdaptor(buttonNames);
    }
}