
package sintaxtree.Nodes.Value;

public class IntegerNode extends Value{

    private int integerValue;

    public IntegerNode(int integerValue) {
        this.integerValue = integerValue;
    }
    
    @Override
    public double evaluate() {
        return integerValue;
    }
    
}
