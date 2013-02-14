package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.Unary.increaseUnaryOperatorNode;

/**
 *
 * @author AitorC
 */
public class increaseUnaryOperationNodeTest {

    @Test
    public void increaseUnaryOperationNodeTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        increaseUnaryOperatorNode increaseNode = new increaseUnaryOperatorNode(constantNodeUno);
        Assert.assertEquals(2, increaseNode.evaluate(), 0);
    }
}
