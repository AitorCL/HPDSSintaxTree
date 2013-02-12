
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Operators.BinaryOperationNode;


public class AddBinaryOperatorNode extends BinaryOperationNode{

    public AddBinaryOperatorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (this.getLeftNode().evaluate()+this.getRigthNode().evaluate());
    }
    
}
