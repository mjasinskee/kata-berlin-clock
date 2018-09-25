package com.vattenfall.kata.berlinclock.display;

public class BerlinClockDisplay {

    private final Segment segmentForSeconds = new SegmentForSeconds();
    private final Segment segmentForFiveHours = new SegmentForFiveHours();
    private final Segment segmentForSingleHours = new SegmentForSingleHours();
    private final Segment segmentForFiveMinutes = new SegmentForFiveMinutes();
    private final Segment segmentForSingleMinutes = new SegmentForSingleMinutes();

    public String berlinTime(String time) {
        return segmentForSeconds.parseTime(time) + "\n" +
                segmentForFiveHours.parseTime(time) + "\n" +
                segmentForSingleHours.parseTime(time) + "\n" +
                segmentForFiveMinutes.parseTime(time) + "\n" +
                segmentForSingleMinutes.parseTime(time);
    }
}
