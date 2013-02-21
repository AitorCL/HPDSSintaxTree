package BinaryOperatorNodeTests;


import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.AddBinaryOperatorNode;


public class AddBinaryOperatorNodeTest {
    @Test
    public void addBinaryOperatorTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(2);
        AddBinaryOperatorNode addNode = new AddBinaryOperatorNode(constantNodeUno,
                                                                  constantNodeDos);
        Assert.assertEquals(3, addNode.evaluate(), 0);
    }
    

}
