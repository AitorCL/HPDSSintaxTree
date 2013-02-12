
package sintaxtree.Nodes.Operators;

import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.OperatiorNode;


public abstract class BinaryOperationNode extends OperatiorNode{
    private Node leftNode, rigthNode;
    
    

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
    public abstract double evaluate();
}
