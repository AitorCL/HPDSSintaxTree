
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Operators.BinaryOperationNode;

public class MultiplicationBinaryOperartorNode extends BinaryOperationNode {
   
    public MultiplicationBinaryOperartorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (this.getLeftNode().evaluate()*this.getRigthNode().evaluate());
    }
    
    
}
