
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.BinaryOperationNode;
import sintaxtree.evaluator.Type;

public class MultiplicationBinaryOperartorNode extends BinaryOperationNode {

    public MultiplicationBinaryOperartorNode(Node leftNode, Node rigthNode) {
        super(leftNode, rigthNode);
    }
   
    @Override
    public Type evaluate() {
       return (this.getLeftNode().evaluate()*this.getRigthNode().evaluate());
    }
    
    
}
