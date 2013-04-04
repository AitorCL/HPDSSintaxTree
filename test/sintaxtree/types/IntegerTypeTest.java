/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sintaxtree.types;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

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
