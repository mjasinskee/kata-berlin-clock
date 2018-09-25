package com.vattenfall.kata.berlinclock.display;

import java.util.List;

abstract class Segment {

    protected final List<Bulb> bulbs;

    Segment() {
        bulbs = createBulbsRow();
    }

    protected abstract List<Bulb> createBulbsRow();

    abstract String parseTime(String time);

    protected int seconds(String time) {
        return Integer.parseInt(time.split(":")[2]);
    }

    protected int minutes(String time) {
        return Integer.parseInt(time.split(":")[1]);
    }

    protected int hours(String time) {
        return Integer.parseInt(time.split(":")[0]);
    }

}
