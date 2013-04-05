
package sintaxtree.types;

import static org.junit.Assert.*;
import org.junit.Test;

public class IntegerTypeTest {

    @Test
    public void IntegerTypetZero() {
        IntegerType integerType = new IntegerType(0);
        assertEquals(IntegerType.class, integerType.getClass());
        assertEquals(0, (double) integerType.getValue(), 0.0);
    }

    @Test
    public void IntegerTypetNumber() {
        IntegerType integerType = new IntegerType(1);
        assertEquals(IntegerType.class, integerType.getClass());
        assertEquals(1, (double) integerType.getValue(), 0.0);
    }
}
