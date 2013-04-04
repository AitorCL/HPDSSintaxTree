package Caculator.operations;

import Caculator.Calculator;
import Caculator.operations.Annotations.Operators;

public class CoreNumberCalculator extends Calculator implements numberCalculator {

    @Override
    @Operators("+")
    public int add(Integer param0, Integer param1) {
        return param0 + param1;
    }

    @Override
    @Operators("+")
    public double add(Double param0, Integer param1) {
        return param0 + param1;
    }

    @Override
    @Operators("+")
    public double add(Integer param0, Double param1) {
        return param0 + param1;
    }

    @Override
    @Operators("+")
    public double add(Double param0, Double param1) {
        return param0 + param1;
    }

    @Override
    @Operators("-")
    public int minus(Integer param0, Integer param1) {
        return param0 - param1;
    }

    @Override
    @Operators("-")
    public double minus(Double param0, Integer param1) {
        return param0 - param1;
    }

    @Override
    @Operators("-")
    public double minus(Integer param0, Double param1) {
        return param0 - param1;
    }

    @Override
    @Operators("-")
    public double minus(Double param0, Double param1) {
        return param0 - param1;
    }

    @Override
    @Operators("*")
    public int mult(Integer param0, Integer param1) {
        return param0 * param1;
    }

    @Override
    @Operators("*")
    public double mult(Double param0, Integer param1) {
        return param0 * param1;
    }

    @Override
    @Operators("*")
    public double mult(Integer param0, Double param1) {
        return param0 * param1;
    }

    @Override
    @Operators("*")
    public double mult(Double param0, Double param1) {
        return param0 * param1;
    }

    @Override
    public int division(Integer param0, Integer param1) {
        return param0 / param1;
    }

    @Override
    @Operators("/")
    public double division(Double param0, Integer param1) {
        return param0 / param1;
    }

    @Override
    @Operators("/")
    public double division(Integer param0, Double param1) {
        return param0 / param1;
    }

    @Override
    @Operators("/")
    public double division(Double param0, Double param1) {
        return param0 / param1;
    }

    @Override
    @Operators("++")
    public int increase(Integer param0) {
        return param0 + 1;
    }

    @Override
    @Operators("++")
    public double increase(Double param0) {
        return param0 + 1;
    }

    @Override
    @Operators("--")
    public int decrease(Integer param0) {
        return param0 - 1;
    }

    @Override
    @Operators("--")
    public double decrease(Double param0) {
        return param0 - 1;
    }
}