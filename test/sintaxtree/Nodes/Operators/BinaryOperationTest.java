package sintaxtree.Nodes.Operators;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.Type;
import sintaxtree.types.DoubleType;


public class BinaryOperationTest {
    
    @Test
    public void testAddDoubleDouble(){
        Node node = new BinaryOperation(new Constant(new DoubleType(1.0)),
                new Constant(new DoubleType(1.0)), Operator.add);
        assertEquals(DoubleType.class,node.evaluate().getClass());
        assertEquals(2.0,(double)node.evaluate().getValue(), 0.0);
    }

}
