package io.qualified.challenge.calculator;

import java.util.function.DoubleBinaryOperator;

class Multiplication implements DoubleBinaryOperator {

    @Override
    public double applyAsDouble(double arg1, double arg2) {
        return arg1 * arg2;
    }
}
