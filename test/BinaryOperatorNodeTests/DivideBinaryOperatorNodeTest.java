package BinaryOperatorNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.DivideBinaryOperatorNode;

public class DivideBinaryOperatorNodeTest {
    

    @Test
    public void divideBinaryOperatorTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(1);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode();
        divideNode.setLeftNode(constantNodeUno);
        divideNode.setRigthNode(constantNodeDos);
        Assert.assertEquals(1, divideNode.evaluate(), 0);
        //TODO Exception test.
    }
}
