package BinaryOperatorNodeTests;


import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.binary.MinusBinaryOperartorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class MinusBinaryOperartorNodeTest {
    
    @Test
    public void minusBinaryOperator_TwoPositiveNumbers_NegativeResultTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeTwo = new ConstantNode(2);
        MinusBinaryOperartorNode minusNode = new MinusBinaryOperartorNode(constantNodeOne,
                                                                          constantNodeTwo);
        Assert.assertEquals(-1, minusNode.evaluate(), 0);
    }
    @Test
    public void minusBinaryOperator_TwoPositiveNumbers_PositiveResultTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeTwo = new ConstantNode(2);
        MinusBinaryOperartorNode minusNode = new MinusBinaryOperartorNode(constantNodeTwo,
                                                                          constantNodeOne);
        Assert.assertEquals(1, minusNode.evaluate(), 0);
    }
    @Test
    public void minusBinaryOperator_TwoNegativeNumbers_PositiveResultTest() {
        ConstantNode constantNodeMinusOne = new ConstantNode(-1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        MinusBinaryOperartorNode minusNode = new MinusBinaryOperartorNode(constantNodeMinusOne,
                                                                          constantNodeMinusTwo);
        Assert.assertEquals(1, minusNode.evaluate(), 0);
    }
    @Test
    public void minusBinaryOperator_TwoNegativeNumbers_NegativeResultTest() {
        ConstantNode constantNodeMinusOne = new ConstantNode(-1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        MinusBinaryOperartorNode minusNode = new MinusBinaryOperartorNode(constantNodeMinusTwo,
                                                                          constantNodeMinusOne);
        Assert.assertEquals(-1, minusNode.evaluate(), 0);
    }
}
