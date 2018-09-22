package com.vattenfall.kata.berlinclock;

import java.util.List;

class SegmentForSeconds extends Segment {

    SegmentForSeconds() {
        super(1);
    }

    @Override protected List<Bulb> createBulbsRow() {
        return null;
    }
}
