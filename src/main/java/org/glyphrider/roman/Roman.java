package org.glyphrider.roman;

public class Roman {
    public String to(int arabic) {
        String result;
        result = "";
        while(arabic >= 40) {
            result += "XL";
            arabic -= 40;
        }
        while(arabic >= 10) {
            result += "X";
            arabic -= 10;
        }
        while(arabic >= 9) {
            result += "IX";
            arabic -= 9;
        }
        while(arabic >= 5) {
            result += "V";
            arabic -= 5;
        }
        while(arabic >= 4) {
            result += "IV";
            arabic -= 4;
        }
        while(arabic-- > 0)
            result += "I";
        return result;
    }
}
