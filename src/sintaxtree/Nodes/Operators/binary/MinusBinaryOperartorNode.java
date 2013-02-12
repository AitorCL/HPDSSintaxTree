package sintaxtree.Nodes.Operators.binary;

import sintaxtree.Nodes.Operators.BinaryOperationNode;

public class MinusBinaryOperartorNode extends BinaryOperationNode {

    public MinusBinaryOperartorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (this.getLeftNode().evaluate() - this.getRigthNode().evaluate());
    }
}
