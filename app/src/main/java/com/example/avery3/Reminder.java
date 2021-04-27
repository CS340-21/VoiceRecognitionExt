package com.example.avery3;

public class Reminder {
    public String event;

    public Reminder(String event) {
        this.event = event;
    }

    @Override
    public String toString() {
        return event;
    }
}
