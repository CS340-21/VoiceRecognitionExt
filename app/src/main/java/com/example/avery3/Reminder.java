package com.example.avery3;

import java.util.ArrayList;

public class Reminder {
    public String event;
    public ArrayList<String> keywords = new ArrayList<>();

    public Reminder(String event) {
        this.event = event;
    }
    public Reminder(String event, String KeyWord) {
        this.event = event;
        keywords.add(KeyWord);
    }

    @Override
    public String toString() {
        return event;
    }
}
