package sintaxtree.Nodes.Operators;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class DecreaseOperationTest {

    @Test
    public void testDecreaseInt() {
        Node node = new UnaryOperation(new Constant(new IntegerType(1)), Operator.decrease);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(0, (int) node.evaluate().getValue());
    }
    @Test
    public void testDecreaseNegativeInt() {
        Node node = new UnaryOperation(new Constant(new IntegerType(-1)), Operator.decrease);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(-2, (int) node.evaluate().getValue());
    }
    @Test
    public void testDecreaseDouble() {
        Node node = new UnaryOperation(new Constant(new DoubleType(1.0)), Operator.decrease);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.0);
    }
    @Test
    public void testDecreaseNegativeDouble() {
        Node node = new UnaryOperation(new Constant(new DoubleType(-1.0)), Operator.decrease);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(-2.0, (double) node.evaluate().getValue(), 0.0);
    }
}
