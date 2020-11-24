package org.glyphrider.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class RomanTests {
    private Roman subject;


    private org.junit.jupiter.api.DynamicTest dynamic_to(int arabic, String roman) {
        return dynamicTest("to: " + Integer.toString(arabic) + " -> "+roman,() -> assertEquals(roman,subject.to(arabic)));
    }

    private org.junit.jupiter.api.DynamicTest dynamic_from(int arabic, String roman) {
        return dynamicTest("from: " + roman + " -> " + Integer.toString(arabic),() -> assertEquals(arabic,subject.from(roman)));
    }

    @TestFactory
    DynamicTest[] from() {
	return new DynamicTest[] {
	    dynamic_from(1, "I"),
	    dynamic_from(2, "II"),
	    dynamic_from(3, "III"),
	    dynamic_from(4, "IV"),
	    dynamic_from(5, "V"),
	    dynamic_from(6, "VI"),
	    dynamic_from(7, "VII"),
	    dynamic_from(8, "VIII"),
	    dynamic_from(9, "IX"),
	    dynamic_from(10, "X"),
	    dynamic_from(11, "XI"),
	    dynamic_from(14, "XIV"),
	    dynamic_from(15, "XV"),
	    dynamic_from(16, "XVI"),
	    dynamic_from(19, "XIX"),
	    dynamic_from(20, "XX"),
	    dynamic_from(21, "XXI"),
	    dynamic_from(39, "XXXIX"),
	    dynamic_from(40, "XL"),
	    dynamic_from(41, "XLI"),
	    dynamic_from(42, "XLII"),
	    dynamic_from(43, "XLIII"),
	    dynamic_from(44, "XLIV"),
	    dynamic_from(45, "XLV"),
	    dynamic_from(46, "XLVI"),
	    dynamic_from(47, "XLVII"),
	    dynamic_from(48, "XLVIII"),
	    dynamic_from(49, "XLIX"),
	    dynamic_from(50, "L"),
	    dynamic_from(89, "LXXXIX"),
	    dynamic_from(90, "XC"),
	    dynamic_from(91, "XCI"),
	    dynamic_from(99, "XCIX"),
	    dynamic_from(100, "C"),
	    dynamic_from(101, "CI"),
	    dynamic_from(200, "CC"),
	    dynamic_from(399, "CCCXCIX"),
	    dynamic_from(400, "CD"),
	    dynamic_from(401, "CDI"),
	    dynamic_from(499, "CDXCIX"),
	    dynamic_from(500, "D"),
	    dynamic_from(501, "DI"),
	    dynamic_from(899, "DCCCXCIX"),
	    dynamic_from(900, "CM"),
	    dynamic_from(999, "CMXCIX"),
	    dynamic_from(1000, "M"),
	    dynamic_from(1001, "MI"),
	    dynamic_from(1968, "MCMLXVIII")
	};
    }

    @TestFactory
    DynamicTest[] to() {
        return new DynamicTest[] {
	    dynamic_to(1, "I"),
	    dynamic_to(2, "II"),
	    dynamic_to(3, "III"),
	    dynamic_to(4, "IV"),
	    dynamic_to(5, "V"),
	    dynamic_to(6, "VI"),
	    dynamic_to(7, "VII"),
	    dynamic_to(8, "VIII"),
	    dynamic_to(9, "IX"),
	    dynamic_to(10, "X"),
	    dynamic_to(11, "XI"),
	    dynamic_to(14, "XIV"),
	    dynamic_to(15, "XV"),
	    dynamic_to(16, "XVI"),
	    dynamic_to(19, "XIX"),
	    dynamic_to(20, "XX"),
	    dynamic_to(21, "XXI"),
	    dynamic_to(39, "XXXIX"),
	    dynamic_to(40, "XL"),
	    dynamic_to(41, "XLI"),
	    dynamic_to(42, "XLII"),
	    dynamic_to(43, "XLIII"),
	    dynamic_to(44, "XLIV"),
	    dynamic_to(45, "XLV"),
	    dynamic_to(46, "XLVI"),
	    dynamic_to(47, "XLVII"),
	    dynamic_to(48, "XLVIII"),
	    dynamic_to(49, "XLIX"),
	    dynamic_to(50, "L"),
	    dynamic_to(89, "LXXXIX"),
	    dynamic_to(90, "XC"),
	    dynamic_to(91, "XCI"),
	    dynamic_to(99, "XCIX"),
	    dynamic_to(100, "C"),
	    dynamic_to(101, "CI"),
	    dynamic_to(200, "CC"),
	    dynamic_to(399, "CCCXCIX"),
	    dynamic_to(400, "CD"),
	    dynamic_to(401, "CDI"),
	    dynamic_to(499, "CDXCIX"),
	    dynamic_to(500, "D"),
	    dynamic_to(501, "DI"),
	    dynamic_to(899, "DCCCXCIX"),
	    dynamic_to(900, "CM"),
	    dynamic_to(999, "CMXCIX"),
	    dynamic_to(1000, "M"),
	    dynamic_to(1001, "MI"),
	    dynamic_to(1968, "MCMLXVIII")
	};
    }

    @BeforeEach
    public void setup() {
        subject = new Roman();
    }

}
