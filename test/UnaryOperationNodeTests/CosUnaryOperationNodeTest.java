package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.Unary.CosUnaryOperatorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class CosUnaryOperationNodeTest {
    
    @Test
    public void CosUnaryOperationNodeTest() {
        ConstantNode constantNodeZero = new ConstantNode(0);
        CosUnaryOperatorNode cosOperatorNode = new CosUnaryOperatorNode(constantNodeZero);
        Assert.assertEquals(1, cosOperatorNode.evaluate(), 0);
    }

}
