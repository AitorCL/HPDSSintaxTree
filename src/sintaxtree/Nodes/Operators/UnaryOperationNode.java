
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.OperatorNode;
import sintaxtree.Nodes.Values.Value;
import sintaxtree.Type;


public abstract class UnaryOperationNode extends OperatorNode{
    
    private Node nextNode;

    public UnaryOperationNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
        
    @Override
    public abstract Type evaluate();
    
}
