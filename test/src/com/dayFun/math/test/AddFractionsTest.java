package com.dayFun.math.test;

import com.dayFun.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AddFractionsTest {

    @Test
    public void testZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(new Fraction(0), sum);
    }

    @Test
    public void testNonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(new Fraction(3), sum);
    }

    @Test
    public void testZeroPlusNonZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(5));
        assertEquals(new Fraction(5), sum);
    }

    @Test
    public void testNonNegativeNonZeroPlusNonNegativeNonZero() throws Exception {
        Fraction sum = new Fraction(5).plus(new Fraction(5));
        assertEquals(new Fraction(10), sum);
    }

    @Test
    public void testNegativeInputsAndNegativeOutput() throws Exception {
        Fraction sum = new Fraction(-3).plus(new Fraction(1));
        assertEquals(new Fraction(-2), sum);
    }

    @Test
    public void testNonTrivialButCommonDenominator() throws Exception {
        Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(new Fraction(3, 5), sum);
    }

    @Test
    public void testDifferentDenominatorsWithoutReducing() throws Exception {
        Fraction sum = new Fraction(1,2).plus(new Fraction(1,3));
        assertEquals(new Fraction(5,6), sum);
    }
}
