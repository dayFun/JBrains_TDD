package com.dayFun.math.test;

import com.dayFun.math.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ReduceFractionsTest {

    @Test
    public void testDoNotReduceWhenAlreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(3, 4));
    }

    @Test
    public void testReduceFractionWithoutWholeNumber() throws Exception {
        assertEquals(new Fraction(3, 4), new Fraction(6, 8));
    }
}
