
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.UnaryOperationNode;
import sintaxtree.Nodes.Values.Value;

public class SinUnaryOperatorNode extends UnaryOperationNode{

    public SinUnaryOperatorNode(Node nextNode) {
        super(nextNode);
    }

    @Override
    public double evaluate() {
        return (Math.sin((this.getNextNode().evaluate())));
    }
    
}
