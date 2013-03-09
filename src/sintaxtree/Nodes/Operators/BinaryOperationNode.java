
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.OperatorNode;
import sintaxtree.Nodes.Values.Value;
import sintaxtree.Type;


public abstract class BinaryOperationNode extends OperatorNode{
    private Node leftNode, rigthNode;

    public BinaryOperationNode(Node leftNode, Node rigthNode) {
        this.leftNode = leftNode;
        this.rigthNode = rigthNode;
    }
    
    public BinaryOperationNode() {
        this.leftNode = null;
        this.rigthNode = null;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRigthNode() {
        return rigthNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRigthNode(Node rigthNode) {
        this.rigthNode = rigthNode;
    }
    
    @Override
    public abstract Type evaluate();
}
