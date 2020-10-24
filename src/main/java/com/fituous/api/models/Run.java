package com.fituous.api.models;

public class Run {
    int hours;
    int minutes;

    public Run(int minutes, int hours){
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }
}
