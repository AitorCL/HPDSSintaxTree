package UnaryOperationNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.Unary.CosUnaryOperatorNode;

public class CosUnaryOperationNodeTest {
    
    @Test
    public void CosUnaryOperationNodeTest() {
        ConstantNode constantNodeUno = new ConstantNode(0);
        CosUnaryOperatorNode cosOperatorNode = new CosUnaryOperatorNode();
        cosOperatorNode.setNextNode(constantNodeUno);
        Assert.assertEquals(1, cosOperatorNode.evaluate(), 0);
    }

}
