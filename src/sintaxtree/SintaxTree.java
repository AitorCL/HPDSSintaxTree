package sintaxtree;

import sintaxtree.Nodes.Node;

public class SintaxTree {

    private Node treeRoot;

    public SintaxTree() {
        this.treeRoot = null;
    }

    public Node getTreeRoot() {
        return treeRoot;
    }

    public void setTreeRoot(Node treeRoot) {
        this.treeRoot = treeRoot;
    }

    public boolean isEmptySintaxTree() {
        boolean isEmpty = false;
        if (this.getTreeRoot() == null) {
            isEmpty = true;
        }
        return isEmpty;
    }
}
