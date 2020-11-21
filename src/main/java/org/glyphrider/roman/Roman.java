package org.glyphrider.roman;

public class Roman {
    public String to(int arabic) {
        String result;
        result = "";
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
