package com.vattenfall.kata.berlinclock

import spock.lang.Specification

class BerlinClockSpec extends Specification {

    def 'should convert time'() {
        given:
        def clock = new BerlinClock()
        def humanReadableTime = "00:00:00"

        when:
        def berlinTime = clock.displyTime(humanReadableTime)

        then:
        berlinTime == "Y\n" +
                "OOOO\n" +
                "OOOO\n" +
                "OOOOOOOOOOO\n" +
                "OOOO"
    }
}
