package Caculator.operations;

import Caculator.Calculator;

public class CoreNumberCalculator extends Calculator implements numberCalculator {

    @Override
    public int add(Integer param0, Integer param1) {
        return param0 + param1;
    }

    @Override
    public double add(Double param0, Integer param1) {
        return param0 + param1;
    }

    @Override
    public double add(Integer param0, Double param1) {
        return param0 + param1;
    }

    @Override
    public double add(Double param0, Double param1) {
        return param0 + param1;
    }

    @Override
    public int minus(Integer param0, Integer param1) {
        return param0 - param1;
    }

    @Override
    public double minus(Double param0, Integer param1) {
        return param0 - param1;
    }

    @Override
    public double minus(Integer param0, Double param1) {
        return param0 - param1;
    }

    @Override
    public double minus(Double param0, Double param1) {
        return param0 - param1;
    }

    @Override
    public int mult(Integer param0, Integer param1) {
        return param0 * param1;
    }

    @Override
    public double mult(Double param0, Integer param1) {
        return param0 * param1;
    }

    @Override
    public double mult(Integer param0, Double param1) {
        return param0 * param1;
    }

    @Override
    public double mult(Double param0, Double param1) {
        return param0 * param1;
    }

    @Override
    public int division(Integer param0, Integer param1) {
        return param0 / param1;
    }

    @Override
    public double division(Double param0, Integer param1) {
        return param0 / param1;
    }

    @Override
    public double division(Integer param0, Double param1) {
        return param0 / param1;
    }

    @Override
    public double division(Double param0, Double param1) {
        return param0 / param1;
    }
}