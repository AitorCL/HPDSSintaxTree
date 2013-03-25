package sintaxtree.Nodes.Operators;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class BinaryOperationTest {

    @Test
    public void testAddDoubleDouble() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new DoubleType(1.0)), Operator.add);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(2.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testAddDoubleInt() {
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new IntegerType(1)), Operator.add);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(2.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testAddIntDouble() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new DoubleType(1.0)), Operator.add);
        assertEquals(DoubleType.class, node.evaluate().getClass());
        assertEquals(2.0, (double) node.evaluate().getValue(), 0.0);
    }

    @Test
    public void testAddIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
                new Constant(new IntegerType(1)), Operator.add);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(2, (int) node.evaluate().getValue(), 0.0);
    }
    
        @Test
    public void testMinusIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
       new Constant(new IntegerType(1)), Operator.minus);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(0, (int) node.evaluate().getValue(), 0.0);
    }
                @Test
    public void testMultIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
       new Constant(new IntegerType(1)), Operator.mult);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1, (int) node.evaluate().getValue(), 0.0);
    }
                        @Test
    public void testDivisionIntInt() {
        Node node = new BinaryOperation(new Constant(new IntegerType(1)),
       new Constant(new IntegerType(1)), Operator.division);
        assertEquals(IntegerType.class, node.evaluate().getClass());
        assertEquals(1, (int) node.evaluate().getValue(), 0.0);
    }
}
