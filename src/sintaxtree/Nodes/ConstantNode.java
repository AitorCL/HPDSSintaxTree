
package sintaxtree.Nodes;


public class ConstantNode extends Node {

    private int value;

    public ConstantNode(int value) {
        this.value = value;
    }
    
    @Override
    public int evaluate() {
        return value;
    }
    
}
