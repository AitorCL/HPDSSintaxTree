package sintaxtree.Nodes.Operators;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class IncreaseOperationTest {

    @Test
    public void testIncreaseInt() {
        Node node = new UnaryOperation(new Constant(new IntegerType(1)), Operator.increase);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(2, (int) node.evaluate().getValue());
    }

    @Test
    public void testIncreaseDouble() {
        Node node = new UnaryOperation(new Constant(new DoubleType(1.0)), Operator.increase);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(2.0, (double) node.evaluate().getValue(), 0.0);
    }
       @Test
    public void testIncreaseNegativeDouble() {
        Node node = new UnaryOperation(new Constant(new DoubleType(-1.0)), Operator.increase);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.0);
    }
    @Test
    public void testIncreaseNegativeInt() {
        Node node = new UnaryOperation(new Constant(new IntegerType(-1)), Operator.increase);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(0, (int) node.evaluate().getValue());
    }
}