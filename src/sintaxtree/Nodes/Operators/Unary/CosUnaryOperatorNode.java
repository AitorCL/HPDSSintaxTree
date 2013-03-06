
package sintaxtree.Nodes.Operators.Unary;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.UnaryOperationNode;
import sintaxtree.evaluator.Type;


public class CosUnaryOperatorNode extends UnaryOperationNode {

    public CosUnaryOperatorNode(Node nextNode) {
        super(nextNode);
    }

    @Override
    public Type evaluate() {
        return (Math.cos((this.getNextNode().evaluate())));
    }    
}
