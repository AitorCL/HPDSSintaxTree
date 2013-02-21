
package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.Unary.decreaseUnaryOperatorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class decreaseUnaryOperationNode {
    
    @Test
    public void increaseUnaryOperationNodeTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        decreaseUnaryOperatorNode decreaseNode = new decreaseUnaryOperatorNode(constantNodeOne);
        Assert.assertEquals(0, decreaseNode.evaluate(), 0);
    }
}
