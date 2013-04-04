
import org.junit.Assert;
import org.junit.Test;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.Type;
import sintaxtree.types.IntegerType;

public class constantNodeTest {

    @Test
    public void ConstantTest() {
        Type integer = new IntegerType(1);
        Constant constant = new Constant(integer);
        Assert.assertEquals(IntegerType.class, constant.getValue().getClass());
        Assert.assertEquals(1, (int) constant.evaluate().getValue(), 0.001);
    }
    //TODO more test.
}