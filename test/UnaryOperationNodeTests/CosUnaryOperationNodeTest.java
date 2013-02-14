package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.Unary.CosUnaryOperatorNode;

public class CosUnaryOperationNodeTest {
    
    @Test
    public void CosUnaryOperationNodeTest() {
        ConstantNode constantNodeCero = new ConstantNode(0);
        CosUnaryOperatorNode cosOperatorNode = new CosUnaryOperatorNode(constantNodeCero);
        Assert.assertEquals(1, cosOperatorNode.evaluate(), 0);
    }

}
