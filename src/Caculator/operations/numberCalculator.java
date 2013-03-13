
package Caculator.operations;

import Caculator.Calculator;

public class numberCalculator extends Calculator{
    
   
    public int add (Integer param0, Integer param1){
        return param0+param1;
    }
    public double add (Double param0, Integer param1){
        return param0+param1;
    }
    public double add (Integer param0, Double param1){
        return param0+param1;
    }
    public double add (Double param0, Double param1){
        return param0+param1;
    }
 
    public int minus (int param0, int param1){
        return param0-param1;
    }
    public double minus (double param0, int param1){
        return  param0-param1;
    }
    public double minus (int param0, double param1){
        return  param0-param1;
    }
    public double minus (double param0, double param1){
        return  param0-param1;
    }
    public int mult (int param0, int param1){
        return  param0*param1;
    }
    public double mult (double param0, int param1){
        return  param0*param1;
    }
    public double mult (int param0, double param1){
        return param0*param1;
    }
    public double mult (double param0, double param1){
        return  param0*param1;
    }
    public int division (int param0, int param1){
        return  param0/param1;
    }
    public double division (double param0, int param1){
        return  param0/param1;
    }
    public double division (int param0, double param1){
        return param0/param1;
    }
    public double division (double param0, double param1){
        return param0/param1;
    }
}
