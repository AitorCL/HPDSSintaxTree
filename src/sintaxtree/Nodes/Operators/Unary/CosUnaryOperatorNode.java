
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.UnaryOperationNode;


public class CosUnaryOperatorNode extends UnaryOperationNode {

    public CosUnaryOperatorNode(Node nextNode) {
        super(nextNode);
    }

    @Override
    public double evaluate() {
        return (Math.cos((this.getNextNode().evaluate())));
    }    
}