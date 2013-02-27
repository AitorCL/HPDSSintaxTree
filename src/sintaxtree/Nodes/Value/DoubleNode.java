package sintaxtree.Nodes.Value;

public class DoubleNode extends Value{

    private double valueDouble;

    public DoubleNode(double valueDouble) {
        this.valueDouble = valueDouble;
    }
  
    @Override
    public double evaluate() {
        return valueDouble;
    }
    
}
