package com.vattenfall.kata.berlinclock.display;

import java.util.Arrays;
import java.util.List;

public class SegmentForSingleMinutes extends Segment {

    @Override
    protected List<Bulb> createBulbsRow() {
        return Arrays.asList(
                new Bulb(BulbColor.YELLOW),
                new Bulb(BulbColor.YELLOW),
                new Bulb(BulbColor.YELLOW),
                new Bulb(BulbColor.YELLOW)
        );
    }

    @Override
    String parseTime(String time) {
        StringBuilder builder = new StringBuilder();
        int minutes = minutes(time);
        int result = minutes % 5;
        bulbs.stream()
             .filter(bulb -> bulbs.indexOf(bulb) < result)
             .forEach(Bulb::switchOn);
        bulbs.forEach(bulb -> builder.append(bulb.currentColor().getColourCode()));
        return builder.toString();
    }

}
