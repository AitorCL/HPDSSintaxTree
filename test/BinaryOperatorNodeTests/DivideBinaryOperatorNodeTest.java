package BinaryOperatorNodeTests;

import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.DivideBinaryOperatorNode;

public class DivideBinaryOperatorNodeTest {
    

    @Test
    public void divideBinaryOperatorTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(2);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode(constantNodeDos,
                                                                           constantNodeUno);
        Assert.assertEquals(2, divideNode.evaluate(), 0);
    }
    @Test
    public void divideBinaryOperator_DivideByZeroTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeCero = new ConstantNode(0);
        DivideBinaryOperatorNode divideNode = new DivideBinaryOperatorNode(constantNodeUno,
                                                                           constantNodeCero);
        try{
            double result = divideNode.evaluate();
            Assert.fail("Issue trying to force divition by zero exception");
        }catch(RuntimeException e){
            Assert.assertTrue(true);
        }
    }
}
