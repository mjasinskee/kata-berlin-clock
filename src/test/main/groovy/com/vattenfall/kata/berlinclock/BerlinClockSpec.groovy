package com.vattenfall.kata.berlinclock

import spock.lang.Specification

class BerlinClockSpec extends Specification {

    def "should convert human readable time to berlin clock format with only seconds"() {
        given:
        def clock = new BerlinClock()

        expect:
        clock.displayTime(humanReadableTime) == berlinTimeFormat

        where:
        humanReadableTime || berlinTimeFormat
        "00:00:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "00:00:01"        || "O\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "00:00:02"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
    }

    def "should convert human readable time to berlin clock format with only hours"() {
        given:
        def clock = new BerlinClock()

        expect:
        clock.displayTime(humanReadableTime) == berlinTimeFormat

        where:
        humanReadableTime || berlinTimeFormat
        "00:00:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "01:00:00"        || "Y\n" + "OOOO\n" + "ROOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "05:00:00"        || "Y\n" + "ROOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "07:00:00"        || "Y\n" + "ROOO\n" + "RROO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "15:00:00"        || "Y\n" + "RRRO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "23:00:00"        || "Y\n" + "RRRR\n" + "RRRO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "24:00:00"        || "Y\n" + "RRRR\n" + "RRRR\n" + "OOOOOOOOOOO\n" + "OOOO"
    }

    def "should convert human readable time to berlin clock format with minutes only"() {
        given:
        def clock = new BerlinClock()

        expect:
        clock.displayTime(humanReadableTime) == berlinTimeFormat

        where:
        humanReadableTime || berlinTimeFormat
        "00:00:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "00:01:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "YOOO"
        "00:03:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "YYYO"
        "00:05:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "YOOOOOOOOOO\n" + "OOOO"
        "00:07:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "YOOOOOOOOOO\n" + "YYOO"
        "00:10:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "YYOOOOOOOOO\n" + "OOOO"
        "00:17:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "YYROOOOOOOO\n" + "YYOO"
        "00:38:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "YYRYYRYOOOO\n" + "YYYO"
        "00:59:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "YYRYYRYYRYY\n" + "YYYY"
    }

    def "should convert human readable time to berlin clock time format" () {
        given:
        def clock = new BerlinClock()

        expect:
        clock.displayTime(humanReadableTime) == berlinTimeFormat

        where:
        humanReadableTime || berlinTimeFormat
        "06:52:01"        || "O\n" + "ROOO\n" + "ROOO\n" + "YYRYYRYYRYO\n" + "YYOO"
        "17:17:17"        || "O\n" + "RRRO\n" + "RROO\n" + "YYROOOOOOOO\n" + "YYOO"
        "22:23:02"        || "Y\n" + "RRRR\n" + "RROO\n" + "YYRYOOOOOOO\n" + "YYYO"
    }
}