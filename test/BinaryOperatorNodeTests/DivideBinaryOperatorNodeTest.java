package BinaryOperatorNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Operators.binary.DivideBinaryOperatorNode;
import sintaxtree.Nodes.Values.ConstantNode;

public class DivideBinaryOperatorNodeTest {
    

    @Test
    public void divideBinaryOperator_TwoPositiveNumbersTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeTwo = new ConstantNode(2);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode(constantNodeTwo,
                                                                           constantNodeOne);
        Assert.assertEquals(2, divideNode.evaluate(), 0);
    }
    @Test
    public void divideBinaryOperator_TwoNegativeNumbersTest() {
        ConstantNode constantNodeMinusOne = new ConstantNode(-1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode(constantNodeMinusTwo,
                                                                           constantNodeMinusOne);
        Assert.assertEquals(2, divideNode.evaluate(), 0);
    }
    @Test
    public void divideBinaryOperator_NegativeDivisorNumbersTest() {
        ConstantNode constantNodeMinusOne = new ConstantNode(-1);
        ConstantNode constantNodeTwo = new ConstantNode(-2);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode(constantNodeTwo,
                                                                           constantNodeMinusOne);
        Assert.assertEquals(2, divideNode.evaluate(), 0);
    }
    @Test
    public void divideBinaryOperator_DivideByZeroTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeZero = new ConstantNode(0);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode(constantNodeOne,
                                                                           constantNodeZero);
        try{
            double result = divideNode.evaluate();
            Assert.fail("Issue trying to force divition by zero exception");
        }catch(RuntimeException e){
            Assert.assertTrue(true);
        }
    }
}
