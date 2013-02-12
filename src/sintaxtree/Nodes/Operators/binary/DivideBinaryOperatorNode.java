
package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Operators.BinaryOperationNode;

public class DivideBinaryOperatorNode extends BinaryOperationNode {

    public DivideBinaryOperatorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (this.getLeftNode().evaluate() / this.getRigthNode().evaluate());
    }
}
