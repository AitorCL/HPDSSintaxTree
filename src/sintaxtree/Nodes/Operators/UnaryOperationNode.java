
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.OperatiorNode;


public abstract class UnaryOperationNode extends OperatiorNode{
    
    private Node nextNode;

    public UnaryOperationNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
        
    @Override
    public abstract int evaluate();
    
}
