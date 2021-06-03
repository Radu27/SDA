package com.company;

public class HexColorValidator {
    private String hexColor;

    HexColorValidator() {
    }

    HexColorValidator(String hexColor) {
        this.hexColor = hexColor;
    }

    Boolean validate(String hexColor) {
        char c = hexColor.charAt(0);
        if (c == '#' && hexColor.length() == 7) {
            String valoare = hexColor.substring(1, hexColor.length());
            if (valoare.matches("^[a-fA-F0-9]+$")) {
                return true;
            } else return false;
        } else {
            return false;
        }
    }
}
