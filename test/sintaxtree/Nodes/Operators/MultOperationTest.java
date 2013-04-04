package sintaxtree.Nodes.Operators;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class MultOperationTest {

    @Test
    public void testMultIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new IntegerType(1)), Operator.mult);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1, (int) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testMultIntDouble() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new DoubleType(1.0)), Operator.mult);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testMultDoubleInt() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new IntegerType(1)), Operator.mult);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testMultDoubleDouble() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new DoubleType(1.0)), Operator.mult);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(1.0, (double) node.evaluate().getValue(), 0.0);
    }
}
