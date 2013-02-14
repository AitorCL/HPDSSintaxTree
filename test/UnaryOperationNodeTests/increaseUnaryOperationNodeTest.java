package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.Unary.increaseUnaryOperatorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class increaseUnaryOperationNodeTest {

    @Test
    public void increaseUnaryOperationNodeTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        increaseUnaryOperatorNode increaseNode = new increaseUnaryOperatorNode(constantNodeOne);
        Assert.assertEquals(2, increaseNode.evaluate(), 0);
    }
}
