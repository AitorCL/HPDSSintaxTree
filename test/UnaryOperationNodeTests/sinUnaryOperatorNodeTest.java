package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.Unary.SinUnaryOperatorNode;

public class sinUnaryOperatorNodeTest {

    @Test
    public void sinUnaryOperatorNodeTest() {
        ConstantNode constantNodeCero = new ConstantNode(0);
        SinUnaryOperatorNode sinOperatorNode = new SinUnaryOperatorNode(constantNodeCero);
        Assert.assertEquals(0, sinOperatorNode.evaluate(), 0);
    }

}
