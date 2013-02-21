package BinaryOperatorNodeTests;


import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Values.ConstantNode;
import sintaxtree.Nodes.Operators.binary.AddBinaryOperatorNode;


public class AddBinaryOperatorNodeTest {
    @Test
    public void addBinaryOperator_TwoPositiveNumbersTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeTow = new ConstantNode(2);
        AddBinaryOperatorNode addNode = new AddBinaryOperatorNode(constantNodeOne,
                                                                  constantNodeTow);
        Assert.assertEquals(3, addNode.evaluate(), 0);
    }
    @Test
    public void addBinaryOperator_NegativeResultTest() {
        ConstantNode constantNodeOne = new ConstantNode(1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        AddBinaryOperatorNode addNode = new AddBinaryOperatorNode(constantNodeOne,
                                                                  constantNodeMinusTwo);
        Assert.assertEquals(-1, addNode.evaluate(), 0);
    }
    @Test
    public void addBinaryOperator_TwoNegativeNumbersTest() {
        ConstantNode constantNodeMinusOne = new ConstantNode(-1);
        ConstantNode constantNodeMinusTwo = new ConstantNode(-2);
        AddBinaryOperatorNode addNode = new AddBinaryOperatorNode(constantNodeMinusOne,
                                                                  constantNodeMinusTwo);
        Assert.assertEquals(-3, addNode.evaluate(), 0);
    }    

}
