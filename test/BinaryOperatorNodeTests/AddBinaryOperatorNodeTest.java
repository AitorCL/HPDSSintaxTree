package BinaryOperatorNodeTests;


import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.AddBinaryOperatorNode;


public class AddBinaryOperatorNodeTest {
    @Test
    public void addBinaryOperatorTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(1);
        AddBinaryOperatorNode addNode = new AddBinaryOperatorNode();
        addNode.setLeftNode(constantNodeUno);
        addNode.setRigthNode(constantNodeDos);
        Assert.assertEquals(2, addNode.evaluate(), 0);
    }
    

}
