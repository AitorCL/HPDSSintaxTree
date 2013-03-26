package sintaxtree.Nodes.Operators;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class MinusOperationTest {

    @Test
    public void testMinusIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new IntegerType(1)), Operator.minus);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(0, (int) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testMinusIntDouble() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new DoubleType(1.0)), Operator.minus);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testMinusDoubleInt() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new IntegerType(1)), Operator.minus);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testMinusDoubleDouble() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new DoubleType(1.0)), Operator.minus);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(0.0, (double) node.evaluate().getValue(), 0.0);
    }
}
