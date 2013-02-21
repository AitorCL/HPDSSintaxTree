package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.Unary.SinUnaryOperatorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class sinUnaryOperatorNodeTest {

    @Test
    public void sinUnaryOperatorNodeTest() {
        ConstantNode constantNodeZero = new ConstantNode(0);
        SinUnaryOperatorNode sinOperatorNode = new SinUnaryOperatorNode(constantNodeZero);
        Assert.assertEquals(0, sinOperatorNode.evaluate(), 0);
    }

}
