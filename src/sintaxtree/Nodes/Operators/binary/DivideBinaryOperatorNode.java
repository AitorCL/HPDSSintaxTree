
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.BinaryOperationNode;

public class DivideBinaryOperatorNode extends BinaryOperationNode {

    public DivideBinaryOperatorNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        
        if (getRigthNode().evaluate() == 0.0) {
            throw new RuntimeException("The divisor is equal to zero");
        }
        
        return (this.getLeftNode().evaluate() / this.getRigthNode().evaluate());
    }
}