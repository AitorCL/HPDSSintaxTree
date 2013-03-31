package sintaxtree.Nodes.UnaryOperators;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.mockito.Mockito.*;
import sintaxtree.Nodes.Operators.UnaryOperation;

public class UnaryOperatorTest {

    @Test
    public void testIncrease() {
        UnaryOperation mockedNode = mock(UnaryOperation.class);
        when(mockedNode.increase()).thenReturn("2");
        assertEquals("2", mockedNode.increase());
    }

    @Test
    public void testDecrease() {
        UnaryOperation mockedNode = mock(UnaryOperation.class);
        when(mockedNode.decrease()).thenReturn("1");
        assertEquals("1", mockedNode.decrease());
    }
}
