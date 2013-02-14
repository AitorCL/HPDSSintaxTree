
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.UnaryOperationNode;

public class decreaseUnaryOperatorNode extends UnaryOperationNode{

    public decreaseUnaryOperatorNode(Node nextNode) {
        super(nextNode);
    }

    @Override
    public double evaluate() {
        return ((this.getNextNode().evaluate()-1));
    }    
}
