package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Type;

public class UnaryOperation extends Operation {

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
    public Type evaluate() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Object increase() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Object decrease() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
