package com.example.avery3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Color;
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
        adapter = new ArrayAdapter<Reminder>(this, android.R.layout.simple_list_item_1, android.R.id.text1, reminders) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View row = super.getView(position, convertView, parent);
                if(position % 5 == 0) {
                    row.setBackgroundColor(Color.parseColor("#FFE2D4"));
                }
                else if (position % 5 == 1) {
                    row.setBackgroundColor(Color.parseColor("#FFEED4"));
                }
                else if (position % 5 == 2){
                    row.setBackgroundColor(Color.parseColor("#D4FFD6"));
                }
                else if (position % 5 == 3) {
                    row.setBackgroundColor(Color.parseColor("#D4FFF3"));
                }
                else {
                    row.setBackgroundColor(Color.parseColor("#8860F8"));
                }
                return row;
            }
        };
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