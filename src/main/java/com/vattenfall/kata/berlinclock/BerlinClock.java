package com.vattenfall.kata.berlinclock;

import com.vattenfall.kata.berlinclock.display.BerlinClockDisplay;

public class BerlinClock {

    private BerlinClockDisplay display = new BerlinClockDisplay();

    String displayTime(String humanReadableTime) {
        return display.berlinTime(humanReadableTime);
    }
}
