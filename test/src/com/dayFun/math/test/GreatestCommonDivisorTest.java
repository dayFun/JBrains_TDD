package com.dayFun.math.test;

import org.junit.Test;

import static com.dayFun.math.NumberTheory.gcd;
import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void testExamples() throws Exception {
        assertEquals(1, gcd(1, 1));
        assertEquals(2, gcd(2, 2));
        assertEquals(1, gcd(-1, -1));
    }

    @Test
    public void testRelativelyPRime() throws Exception {
        assertEquals(1, gcd(2, 3));
        assertEquals(1, gcd(4, 7));
        assertEquals(1, gcd(-3, -2));
    }

    @Test
    public void testOneMultipleOfTheOther() throws Exception {
        assertEquals(3, gcd(3, 9));
        assertEquals(5, gcd(5, 30));
    }

    @Test
    public void testCommonFactor() throws Exception {
        assertEquals(2, gcd(6, 8));
        assertEquals(7, gcd(49, 315));
        assertEquals(8, gcd(-24, -32));
    }

    @Test
    public void testNegatives() throws Exception {
        assertEquals(4, gcd(-24, 28));
        assertEquals(4, gcd(24, -28));
    }
}
