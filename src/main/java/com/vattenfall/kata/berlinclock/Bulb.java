package com.vattenfall.kata.berlinclock;

class Bulb {

    private final BulbColor colorWhenOn;
    private boolean isSwitchedOn = false;

    Bulb(BulbColor colorWhenOn) {
        this.colorWhenOn = colorWhenOn;
    }

    void switchOn() {
        isSwitchedOn = true;
    }

    void switchOff() {
        isSwitchedOn = false;
    }

    BulbColor currentColor() {
        return isSwitchedOn ? colorWhenOn : BulbColor.OFF;
    }
}
