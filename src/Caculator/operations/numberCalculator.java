
package Caculator.operations;

public interface numberCalculator {
    
   
    public int add (Integer param0, Integer param1);
    public double add (Double param0, Integer param1);
    public double add (Integer param0, Double param1);
    public double add (Double param0, Double param1);
 
    public int minus (Integer param0, Integer param1);
    public double minus (Double param0, Integer param1);
    public double minus (Integer param0, Double param1);
    public double minus (Double param0, Double param1);
    
    public int mult (Integer param0, Integer param1);
    public double mult (Double param0, Integer param1);
    public double mult (Integer param0, Double param1);
    public double mult (Double param0, Double param1);
    
    public int division (Integer param0, Integer param1);
    public double division (Double param0, Integer param1);
    public double division (Integer param0, Double param1);
    public double division (Double param0, Double param1);
    
    public int increase(Integer param0);
    public double increase(Double param0);
    
     public int decrease(Integer param0);
    public double decrease(Double param0);
}
