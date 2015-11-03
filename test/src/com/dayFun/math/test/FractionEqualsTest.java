package com.dayFun.math.test;

        import com.dayFun.math.Fraction;
        import org.junit.Test;

        import static junit.framework.Assert.assertEquals;

public class FractionEqualsTest {

    @Test
    public void testSameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3, 5), new Fraction(3, 5));
    }
}
