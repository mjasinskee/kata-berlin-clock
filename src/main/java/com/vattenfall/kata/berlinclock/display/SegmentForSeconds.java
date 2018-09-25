package com.vattenfall.kata.berlinclock.display;

import java.util.Collections;
import java.util.List;

class SegmentForSeconds extends Segment {

    @Override
    protected List<Bulb> createBulbsRow() {
        return Collections.singletonList(new Bulb(BulbColor.YELLOW));
    }

    @Override
    String parseTime(String time) {
        int seconds = seconds(time);
        int result = seconds % 2;
        if (result == 0) {
            bulbs.get(0).switchOn();
        }
        return bulbColorCode();
    }

    private String bulbColorCode() {
        return bulbs.get(0).currentColor().getColourCode();
    }

}
