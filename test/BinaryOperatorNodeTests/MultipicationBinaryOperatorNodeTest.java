package BinaryOperatorNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.binary.MultiplicationBinaryOperartorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class MultipicationBinaryOperatorNodeTest {
    
    @Test
    public void multiplicationBinaryOperator_TwoPositiveNumbersTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeTwo = new ConstantNode(2);
        MultiplicationBinaryOperartorNode multNode = new MultiplicationBinaryOperartorNode(constantNodeOne,
                                                                                           constantNodeTwo);
        Assert.assertEquals(2, multNode.evaluate(), 0);
    }
    @Test
    public void multiplicationBinaryOperator_TwoNegativeNumbersTest() {
        ConstantNode constantNodeMinusOne = new ConstantNode(-1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        MultiplicationBinaryOperartorNode multNode = new MultiplicationBinaryOperartorNode(constantNodeMinusOne,
                                                                                           constantNodeMinusTwo);
        Assert.assertEquals(2, multNode.evaluate(), 0);
    }
    @Test
    public void multiplicationBinaryOperator_OneNegativeNumbersTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        MultiplicationBinaryOperartorNode multNode = new MultiplicationBinaryOperartorNode(constantNodeOne,
                                                                                           constantNodeMinusTwo);
        Assert.assertEquals(-2, multNode.evaluate(), 0);
    }
}
