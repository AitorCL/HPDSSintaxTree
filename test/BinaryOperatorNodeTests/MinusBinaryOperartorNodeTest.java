package BinaryOperatorNodeTests;


import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.MinusBinaryOperartorNode;

public class MinusBinaryOperartorNodeTest {
    
    @Test
    public void minusBinaryOperatorTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(1);
        MinusBinaryOperartorNode minusNode = new MinusBinaryOperartorNode();
        minusNode.setLeftNode(constantNodeUno);
        minusNode.setRigthNode(constantNodeDos);
        Assert.assertEquals(0, minusNode.evaluate(), 0);
    }
}
