import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Values.ConstantNode;

public class constantNodeTest {
    
    @Test
    public void constantNodeTest() {
        ConstantNode constantNodeUno = new ConstantNode(1);
        Assert.assertEquals(1, constantNodeUno.getValue(), 0.00);
    }

}
