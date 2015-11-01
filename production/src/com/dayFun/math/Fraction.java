package com.dayFun.math;

public class Fraction {
    private int integerValue;

    public Fraction(int integerValue) {
        this.integerValue = integerValue;
    }

    public Fraction plus(Fraction that) {
        if (this.integerValue != 0) {
            return new Fraction(this.integerValue + that.integerValue);
        } else {
            return that;
        }
    }

    public int intValue() {
        return integerValue;
    }
}
