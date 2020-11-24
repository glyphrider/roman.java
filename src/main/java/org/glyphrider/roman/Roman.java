package org.glyphrider.roman;

public class Roman {

    private Object[][] translation = new Object[][]{
            {1000, "M"},
            {900, "CM"},
            {500, "D"},
            {400, "CD"},
            {100, "C"},
            {90, "XC"},
            {50, "L"},
            {40, "XL"},
            {10, "X"},
            {9, "IX"},
            {5, "V"},
            {4, "IV"},
            {1, "I"}
    };


    public int from(String roman) {
        int result;
        result = 0;

        for (Object[] item : translation) {
            int arabic = (int) item[0];
            String prefix = (String) item[1];

            while (roman.startsWith(prefix)) {
                result += arabic;
                roman = roman.substring((prefix.length()));
            }
        }

        return result;
    }

    public String to(int arabic) {
        String result;
        result = "";

        for (Object[] item : translation) {
            int value = (int) item[0];
            String roman = (String) item[1];

            while (arabic >= value) {
                result += roman;
                arabic -= value;
            }

        }
        return result;
    }
}
