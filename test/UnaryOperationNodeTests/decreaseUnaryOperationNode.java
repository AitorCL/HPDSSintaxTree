
package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.Unary.decreaseUnaryOperatorNode;

public class decreaseUnaryOperationNode {
    
    @Test
    public void increaseUnaryOperationNodeTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        decreaseUnaryOperatorNode decreaseNode = new decreaseUnaryOperatorNode(constantNodeUno);
        Assert.assertEquals(0, decreaseNode.evaluate(), 0);
    }
}
