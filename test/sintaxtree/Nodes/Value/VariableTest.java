
package sintaxtree.Nodes.Value;

import static org.junit.Assert.*;
import org.junit.Test;
import sintaxtree.Nodes.Values.Variable;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class VariableTest {
    @Test
    public void DoubleVariableTest() {
        Variable variable = new Variable(new DoubleType(1.0));
        assertEquals(DoubleType.class, variable.evaluate().getClass());
        assertEquals(1.0, (double) variable.evaluate().getValue(), 0.0);
    }
    @Test
    public void IntegerVariableTest() {
        Variable variable = new Variable(new IntegerType(1));
        assertEquals(IntegerType.class, variable.evaluate().getClass());
        assertEquals(1, (int) variable.evaluate().getValue(), 0.0);
    }    

}
