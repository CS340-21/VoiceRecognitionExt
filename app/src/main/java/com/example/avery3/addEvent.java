package com.example.avery3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputLayout;

public class addEvent extends AppCompatActivity {
    private Button button;
    //private TextInputLayout eventName;
    private EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

        mEditText = (EditText) findViewById(R.id.newEventName);
        button = (Button) findViewById(R.id.saveButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveNewEvent();
            }
        });
    }

    public void saveNewEvent() {
        String event = mEditText.getText().toString();
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("reminder", event);
        startActivity(intent);
    }
}