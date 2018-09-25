package com.vattenfall.kata.berlinclock.display;

import java.util.Arrays;
import java.util.List;

class SegmentForSingleHours extends Segment {

    @Override
    protected List<Bulb> createBulbsRow() {
        return Arrays.asList(
                new Bulb(BulbColor.RED),
                new Bulb(BulbColor.RED),
                new Bulb(BulbColor.RED),
                new Bulb(BulbColor.RED)
        );
    }

    @Override
    String parseTime(String time) {
        StringBuilder builder = new StringBuilder();
        int hours = hours(time);
        int result = hours % 5;
        bulbs.stream()
                .filter(bulb -> bulbs.indexOf(bulb) < result)
                .forEach(Bulb::switchOn);
        bulbs.forEach(bulb -> builder.append(bulbColorCode(bulb)));
        return builder.toString();
    }

    private String bulbColorCode(Bulb bulb) {
        return bulb.currentColor().getColourCode();
    }
}
