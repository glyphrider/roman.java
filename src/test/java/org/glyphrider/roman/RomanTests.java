package org.glyphrider.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.DynamicTest.dynamicTest;

public class RomanTests {
    private Roman subject;


    private org.junit.jupiter.api.DynamicTest dt(int arabic, String roman) {
        return dynamicTest("to: " + Integer.toString(arabic) + " -> "+roman,() -> assertEquals(roman,subject.to(arabic)));
    }

    @TestFactory
    DynamicTest[] to() {
        return new DynamicTest[]{
                dt(1, "I"),
                dt(2, "II"),
                dt(3,"III"),
                dt(4,"IV"),
                dt(5,"V"),
                dt(6,"VI"),
                dt(7,"VII"),
                dt(8,"VIII"),
                dt(9,"IX"),
                dt(10,"X"),
                dt(40,"XL")
        };
    }

    @BeforeEach
    public void setup() {
        subject = new Roman();
    }

}
