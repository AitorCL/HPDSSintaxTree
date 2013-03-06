
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.OperatiorNode;
import sintaxtree.Nodes.Values.Value;
import sintaxtree.evaluator.Type;


public abstract class UnaryOperationNode extends OperatiorNode{
    
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
