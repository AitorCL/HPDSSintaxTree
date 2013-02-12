
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Operators.UnaryOperationNode;


public class CosUnaryOperatorNode extends UnaryOperationNode {
    public CosUnaryOperatorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (Math.cos((this.getNextNode().evaluate())));
    }    
}
