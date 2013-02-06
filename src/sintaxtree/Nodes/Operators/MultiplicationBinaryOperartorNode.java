
package sintaxtree.Nodes.Operators;

public class MultiplicationBinaryOperartorNode extends BinaryOperationNode {
   
    public MultiplicationBinaryOperartorNode() {
        super();
    }

    @Override
    public int evaluate() {
        return (this.getLeftNode().evaluate()+this.getRigthNode().evaluate());
    }
    
    
}
