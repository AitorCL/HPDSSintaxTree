
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Operators.UnaryOperationNode;

public class SinUninaryOperatorNode extends UnaryOperationNode{

    public SinUninaryOperatorNode() {
        super();
    }

    @Override
    public double evaluate() {
        return (Math.sin((this.getNextNode().evaluate())));
    }
    
}
