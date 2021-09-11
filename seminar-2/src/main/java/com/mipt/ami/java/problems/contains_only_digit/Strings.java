package com.mipt.ami.java.problems.contains_only_digit;


import org.apache.commons.lang3.StringUtils;

public final class Strings {

    private Strings() {
        throw new AssertionError("Cannot be instantiated");
    }

    // Note: For Unicode supplementary characters use codePointAt() instead of charAt()
    //       and codePoints() instead of chars()

    public static boolean containsOnlyDigitsV1(String str) {

        if (str == null || StringUtils.isBlank(str)) {
            // or throw IllegalArgumentException
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }

    public static boolean containsOnlyDigitsV2(String str) {

        if (str == null ) {
            // or throw IllegalArgumentException
            return false;
        }

        return str.matches("[0-9]+");
    }

    public static boolean containsOnlyDigitsV3(String str) {

        if (str == null ) {
            // or throw IllegalArgumentException
            return false;
        }

        return str.chars()
                .allMatch(Character::isDigit);
    }
}
