
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.BinaryOperationNode;

public class MultiplicationBinaryOperartorNode extends BinaryOperationNode {

    public MultiplicationBinaryOperartorNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }
   
    @Override
    public double evaluate() {
        return (this.getLeftNode().evaluate()*this.getRigthNode().evaluate());
    }
    
    
}