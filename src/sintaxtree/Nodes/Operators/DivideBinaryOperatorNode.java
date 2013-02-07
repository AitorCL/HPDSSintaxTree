
package sintaxtree.Nodes.Operators;

public class DivideBinaryOperatorNode extends BinaryOperationNode {

    public DivideBinaryOperatorNode() {
        super();
    }

    @Override
    public int evaluate() {
        return (this.getLeftNode().evaluate() / this.getRigthNode().evaluate());
    }
}
