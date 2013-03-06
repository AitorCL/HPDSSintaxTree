package sintaxtree.Nodes.Value;

public class DoubleNode extends Value{

    private double doubleValue;

    public DoubleNode(double doubleValue) {
        this.doubleValue = doubleValue;
    }
    
    @Override
    public double evaluate() {
        return doubleValue;
    }
    
}
