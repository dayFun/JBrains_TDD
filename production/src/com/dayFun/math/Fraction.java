package com.dayFun.math;

public class Fraction {
    private final int numerator;
    private final int denominator;

    public Fraction(int intValue) {
        this(intValue, 1);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction plus(Fraction that) {
        if (this.denominator != that.denominator) {
            return new Fraction(this.numerator * that.denominator + that.numerator * this.denominator,
                    this.denominator * that.denominator);
        } else {
            return new Fraction(this.numerator + that.numerator, this.denominator);
        }
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof Fraction) {
            Fraction that = (Fraction) other;
            return this.numerator == that.numerator
                    && this.denominator == that.denominator;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = numerator;
        result = 31 * result + denominator;
        return result;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
