
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Operators.UnaryOperationNode;

public class SinUnaryOperatorNode extends UnaryOperationNode{

    public SinUnaryOperatorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (Math.sin((this.getNextNode().evaluate())));
    }
    
}
