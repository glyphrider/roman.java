package org.glyphrider.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanTests {
    private Roman subject;

    @BeforeEach
    public void setup() {
        subject = new Roman();
    }

    @Test
    public void convertToOne() {
        assertEquals("I",subject.to(1));
    }

    @Test
    public void convertToTwo() {
        assertEquals("II", subject.to(2));
    }

    @Test
    public void convertToThree() {
        assertEquals("III",subject.to(3));
    }

    @Test
    public void convertToFour() {
        assertEquals("IV",subject.to(4));
    }

    @Test
    public void convertToFive() {
        assertEquals("V",subject.to(5));
    }
}
