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
        if (seconds % 2 == 0) {
            bulbs.get(0).switchOn();
        } else {
            bulbs.get(0).switchOff();
        }
        return bulbs.get(0).currentColor().getColourCode();
    }

}
