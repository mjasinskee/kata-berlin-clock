package com.vattenfall.kata.berlinclock;

enum BulbColor {
    OFF("O"),
    YELLOW("Y"),
    RED("R");

    private final String colourCode;

    BulbColor(String colourCode) {
        this.colourCode = colourCode;
    }

    String getColourCode() {
        return colourCode;
    }
}
