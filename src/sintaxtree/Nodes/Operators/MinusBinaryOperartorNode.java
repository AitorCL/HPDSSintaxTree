package sintaxtree.Nodes.Operators;

public class MinusBinaryOperartorNode extends BinaryOperationNode {

    public MinusBinaryOperartorNode() {
        super();
    }

    @Override
    public int evaluate() {
        return (this.getLeftNode().evaluate() - this.getRigthNode().evaluate());
    }
}
