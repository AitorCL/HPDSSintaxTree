
package sintaxtree.Nodes.Values;

import sintaxtree.Nodes.Node;
import sintaxtree.evaluator.Type;


public class ConstantNode extends Node {

    private final Type value;

    public ConstantNode(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    @Override
    public Type evaluate() {
        return value;
    }


    
}
