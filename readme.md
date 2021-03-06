# Berlin Clock Code Kata #

![Mengenlehreuhr](berlin_clock_1.jpg)

This Java Code Kata is about to implementation of Berlin Clock (https://en.wikipedia.org/wiki/Mengenlehreuhr).

We will use Java8 and try to follow TDD way of coding to end with OO programing style.

# Berlin Clock #

Mengenlehreuhr is a fancy clock currently located in Budapester Straße in front of Europa-Center in Berlin.

## How to read time ##

![Mengenlehreuhr time representation](berlin_clock_2.jpg)

Time is presented in 24H format in the way of turning on or off lights divided into 5 rows.
- First row from the top represents SECONDS and blinks in 1 second interval (on for even and off for odd numbers);
- Second row represents HOURS divided into 5-hours blocks;
    - so if 2 lamps is on it represents 10 AM;
- Third row represents HOURS divided into 1-hour blocks;
    - so if first 3 lamps from this row are on it represents 3 AM;
- Fourth row represents MINUTES divided into 5-minutes blocks;
    - so if 3 lamps from this row is on it means 15 minutes after midnight;
    - every third lamp in this row is red witch has no special meaning beside visual one
- Fifth row represents MINUTES divided into 1-minute blocks;
    - so if 2 lamps from this row are on it means 2 minutes after midnight;

# Goal of this Kata #

Main goal of this kata is to have a lot of fun while development.

Use TDD and play with Spock framework to implement Your tests. Remember that Java is object oriented language - use OOP (it's not Pascal).

## Problem description ##

General goal is to implement Berlin Clock to be able to consume input in 24H format (like HH:MM:SS) and produce display representation of the time.
It is up to You how internal implementation will look like but You should stick to BerlinClockDisplay contract.
You will find some tests already implemented in test/main/groovy showing You how to start and below You'll find full specification of tests that needs to be implemented.

## Test cases ##

In tests description lets assume we have:

    “O” = Light off
    “R” = Red light
    “Y” = Yellow light

- for input "00:00:00" we have:<br>
    Y<br>
    OOOO<br>
    OOOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "00:00:01" we have:<br>
    O<br>
    OOOO<br>
    OOOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "00:00:02" we have:<br>
    Y<br>
    OOOO<br>
    OOOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "00:01:00" we have:<br>
    Y<br>
    OOOO<br>
    OOOO<br>
    OOOOOOOOOOO<br>
    YOOO<br>
- for input "00:06:00" we have:<br>
    Y<br>
    OOOO<br>
    OOOO<br>
    YOOOOOOOOOO<br>
    YOOO<br>
- for input "00:37:00" we have:<br>
    Y<br>
    OOOO<br>
    OOOO<br>
    YYRYYRYOOOO<br>
    YYOO<br>
- for input "00:59:00" we have:<br>
    Y<br>
    OOOO<br>
    OOOO<br>
    YYRYYRYYRYY<br>
    YYYY<br>
- for input "01:00:00" we have:<br>
    Y<br>
    OOOO<br>
    YOOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "05:00:00" we have:<br>
    Y<br>
    YOOO<br>
    OOOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "07:00:00" we have:<br>
    Y<br>
    YOOO<br>
    YYOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "15:00:00" we have:<br>
    Y<br>
    YYYO<br>
    OOOO<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "24:00:00" we have:<br>
    Y<br>
    YYYY<br>
    YYYY<br>
    OOOOOOOOOOO<br>
    OOOO<br>
- for input "12:56:01" we have:<br>
    O<br>
    RROO<br>
    RROO<br>
    YYRYYRYYRYY<br>
    YOOO<br>