package com.vattenfall.kata.berlinclock;

import java.util.List;

abstract class Segment {

    private final int numberOfBulbs;
    private final List<Bulb> bulbs;

    Segment(int numberOfBulbs) {
        this.numberOfBulbs = numberOfBulbs;
        bulbs = createBulbsRow();

    }

    protected abstract List<Bulb> createBulbsRow();

}
