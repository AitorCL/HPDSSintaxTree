package sintaxtree.Nodes.Value;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class ConstantTest {

    @Test
    public void DoubleConstantTest() {
        Constant constant = new Constant(new DoubleType(1.0));
        assertEquals(DoubleType.class, constant.evaluate().getClass());
        assertEquals(1.0, (double) constant.evaluate().getValue(), 0.0);
    }

    @Test
    public void IntegerConstantTest() {
        Constant constant = new Constant(new IntegerType(1));
        assertEquals(IntegerType.class, constant.evaluate().getClass());
        assertEquals(1, (int) constant.evaluate().getValue(), 0.0);
    }
}
