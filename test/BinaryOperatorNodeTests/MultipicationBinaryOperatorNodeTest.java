package BinaryOperatorNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.MultiplicationBinaryOperartorNode;

public class MultipicationBinaryOperatorNodeTest {
    
    @Test
    public void multiplicationBinaryOperatorTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(2);
        MultiplicationBinaryOperartorNode multNode = new MultiplicationBinaryOperartorNode(constantNodeUno,
                                                                                           constantNodeDos);
        multNode.setLeftNode(constantNodeUno);
        multNode.setRigthNode(constantNodeDos);
        Assert.assertEquals(2, multNode.evaluate(), 0);
    }

}
