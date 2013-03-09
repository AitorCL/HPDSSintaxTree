
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Type;


public abstract class UnaryOperation extends Operation{
    
    private Node nextNode;

    public UnaryOperation(Node nextNode) {
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
