package com.vattenfall.kata.berlinclock

import spock.lang.Specification

class BerlinClockSpec extends Specification {

    def "should convert human readable time to berlin clock format"() {
        given:
        def clock = new BerlinClock()

        expect:
        clock.displayTime(humanReadableTime) == berlinTimeFormat

        where:
        humanReadableTime || berlinTimeFormat
        "00:00:00"        || "Y\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"
        "00:00:01"        || "O\n" + "OOOO\n" + "OOOO\n" + "OOOOOOOOOOO\n" + "OOOO"

    }
}
