
package sintaxtree.Nodes;


public class ConstantNode extends Node {

    private double value;

    public ConstantNode(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
    
    @Override
    public double evaluate() {
        return value;
    }
    
}
