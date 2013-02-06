
package sintaxtree.Nodes.Operators;


public class AddBinaryOperatorNode extends BinaryOperationNode{

    public AddBinaryOperatorNode() {
        super();
    }

    @Override
    public int evaluate() {
        return (this.getLeftNode().evaluate()+this.getRigthNode().evaluate());
    }
    
}
