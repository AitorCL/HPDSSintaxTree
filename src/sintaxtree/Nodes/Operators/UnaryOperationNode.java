
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.OperatiorNode;


public abstract class UnaryOperationNode extends OperatiorNode{
    
    private Node nextNode;

    public UnaryOperationNode() {
        this.nextNode = null;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
        
    @Override
    public abstract double evaluate();
    
}
