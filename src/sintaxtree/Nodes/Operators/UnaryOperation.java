package sintaxtree.Nodes.Operators;

import Caculator.Calculator;
import Caculator.operations.CoreNumberCalculator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import sintaxtree.Nodes.Node;
import sintaxtree.Type;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class UnaryOperation extends Operation {

    private final Node nextNode;
    private final Operator unaryOperator;

    public UnaryOperation(Node nextNode, Operator unaryOperator) {
        this.nextNode = nextNode;
        this.unaryOperator = unaryOperator;
    }

    public Node getNextNode() {
        return nextNode;
    }

    @Override
    public Type evaluate() {
        return calculate(searchCalculator(getNextNode().evaluate()),getNextNode().evaluate());
    }

    private Calculator searchCalculator(Type childNode ) {

        if (childNode == null) {
            return null;
        }
        if ((childNode.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if (childNode.getValue() instanceof Integer) {
            return new CoreNumberCalculator();
        }
        return null;

    }

    private Type calculate(Calculator calculator, Type childNode) {
        try {
            if (calculator == null) {
                return null;
            }
            Method method = calculator.getClass().getMethod(unaryOperator.getName(), childNode.getValue().getClass());
            return searchType(method.invoke(calculator, childNode.getValue()));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            return null;
        }
        return null;
    }

    private Type searchType(Object object) {
        if (object instanceof Double) {
            return new DoubleType((double) object);
        }
        if (object instanceof Integer) {
            return new IntegerType((int) object);
        }
        return null;

    }
    //TODO .. move those mocked method where they belong.
    public Object increase() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Object decrease() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
