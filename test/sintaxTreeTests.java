
import static java.lang.System.out;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sintaxtree.Nodes.Node;
import sintaxtree.Nodes.Operators.BinaryOperation;
import sintaxtree.Nodes.Operators.Operator;
import sintaxtree.Nodes.Values.Constant;
import sintaxtree.SintaxTree;
import sintaxtree.Type;
import sintaxtree.types.DoubleType;

public class sintaxTreeTests {

    @Test
    public void testTree() {
        out.print("Tree: 1 + 2 + 3 = ");
        SintaxTree tree = new SintaxTree();
        Node uno = new Constant(new DoubleType(1.0));
        Node dos = new Constant(new DoubleType(2.0));
        Node tres = new Constant(new DoubleType(3.0));
        Node multi = new BinaryOperation(dos, tres, Operator.add);
        Node sum = new BinaryOperation(uno, multi, Operator.add);
        out.println(sum.evaluate().getValue());
        assertEquals(6.0, (double) sum.evaluate().getValue(), 0.0);
    }
}