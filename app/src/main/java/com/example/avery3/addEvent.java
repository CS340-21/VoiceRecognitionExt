package com.example.avery3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;

public class addEvent extends AppCompatActivity {
    private Button button;
    private TextInputLayout eventName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        button = (Button) findViewById(R.id.saveButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNewEvent();
            }
        });
    }

    public void saveNewEvent() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}