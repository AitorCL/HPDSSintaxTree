package sintaxtree.Nodes.Operators;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class DivisionOperationTest {

    @Test
    public void testDivisionIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new IntegerType(1)), Operator.division);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1, (int) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testDivisionIntDouble() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new DoubleType(1.0)), Operator.division);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testDivisionDoubleInt() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new IntegerType(1)), Operator.division);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testDivisionDoubleDouble() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new DoubleType(1.0)), Operator.division);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.0);
    }
}
