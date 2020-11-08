package com.fituous.api.models.workouts;

public class Walk implements Distance, Pace{
    @Override
    public long distance() {
        return 0;
    }

    @Override
    public int hours() {
        return 0;
    }

    @Override
    public int minutes() {
        return 0;
    }

    @Override
    public int seconds() {
        return 0;
    }

    @Override
    public int milliseconds() {
        return 0;
    }
}
