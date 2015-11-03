package com.dayFun.math.test;

import com.dayFun.math.Fraction;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class FractionEqualsTest {

    @Test
    public void testSameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }

    @Test
    public void testDifferentNumerators() throws Exception {
        assertNotEquals(new Fraction(2, 5), new Fraction(1, 5));
    }

    @Test
    public void testDifferentDenominators() throws Exception {
        assertNotEquals(new Fraction(2, 6), new Fraction(1, 2));
    }

    @Test
    public void testWholeNumberEqualsSameFraction() throws Exception {
        assertEquals(new Fraction(3, 1), new Fraction(3));
    }

    @Test
    public void testWholeNumbersAreNotEquals() throws Exception {
        assertNotEquals(new Fraction(3), new Fraction(2));
    }

    
}
