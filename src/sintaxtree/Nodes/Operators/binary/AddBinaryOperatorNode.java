
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.BinaryOperationNode;


public class AddBinaryOperatorNode extends BinaryOperationNode{

    public AddBinaryOperatorNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }

    @Override
    public double evaluate() {
        return (this.getLeftNode().evaluate()+this.getRigthNode().evaluate());
    }
    
}
