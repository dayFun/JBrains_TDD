package com.dayFun.math.test;

import com.dayFun.math.Fraction;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class AddFractionsTest {

    @Test
    public void testZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(0).plus(new Fraction(0));
        assertEquals(0, sum.intValue());
    }

    @Test
    public void testNonZeroPlusZero() throws Exception {
        Fraction sum = new Fraction(3).plus(new Fraction(0));
        assertEquals(3, sum.intValue());
    }
}
