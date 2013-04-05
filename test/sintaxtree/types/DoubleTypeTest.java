
package sintaxtree.types;

import static org.junit.Assert.*;
import org.junit.Test;

public class DoubleTypeTest {

    @Test
    public void DoubleTestZero() {
        DoubleType doubleType = new DoubleType(0.0);
        assertEquals(DoubleType.class, doubleType.getClass());
        assertEquals(0.0, (double) doubleType.getValue(), 0.0);
    }

    @Test
    public void DoubleTestNumber() {
        DoubleType doubleType = new DoubleType(1.0);
        assertEquals(DoubleType.class, doubleType.getClass());
        assertEquals(1.0, (double) doubleType.getValue(), 0.0);
    }
}
