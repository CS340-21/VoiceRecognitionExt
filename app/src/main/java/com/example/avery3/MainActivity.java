package com.example.avery3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.*;
import android.content.Intent;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Serializable {
    final String TAG = "demo";
    private Button button;
    public static ArrayList<Reminder> reminders = new ArrayList<>();
    ListView remindersList;
    public ArrayAdapter<Reminder> adapter;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        i = getIntent();
        Bundle extras = i.getExtras();
        if (extras != null) {
            if (extras.getString("reminder") != null) reminders.add(new Reminder(extras.getString("reminder")));
        }

        remindersList = findViewById(R.id.remindersList);
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1, reminders);
        remindersList.setAdapter(adapter);

        remindersList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.d(TAG, "onItemClick: position " + position + ", user is " + reminders.get(position));
                Reminder reminder = reminders.get(position);
                reminders.remove(reminder);
                adapter.notifyDataSetChanged();
            }
        });

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
}