package sintaxtree.Nodes.Operators;

import Caculator.Calculator;
import Caculator.operations.CoreNumberCalculator;
import Caculator.operations.numberCalculator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import sintaxtree.Nodes.Node;
import sintaxtree.Type;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class BinaryOperation extends Operation {

    private final Node leftNode, rigthNode;
    private final Operator operator;

    public BinaryOperation(Node leftNode, Node rigthNode, Operator operator) {
        this.leftNode = leftNode;
        this.rigthNode = rigthNode;
        this.operator = operator;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRigthNode() {
        return rigthNode;
    }

    @Override
    public Type evaluate() {
        Type left = getLeftNode().evaluate();
        Type right = getRigthNode().evaluate();
        return calculate(searchCalculator(left, right), left, right);
    }

    private Calculator searchCalculator(Type left, Type right) {

        if (left == null || right == null) {
            return null;
        }
        if ((left.getValue() instanceof Double) && (right.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        if ((left.getValue() instanceof Double) && (right.getValue() instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        if ((left.getValue() instanceof Integer) && (right.getValue() instanceof Integer)) {
            return new CoreNumberCalculator();
        }
        if ((left.getValue() instanceof Integer) && (right.getValue() instanceof Double)) {
            return new CoreNumberCalculator();
        }
        return null;

    }

    private Type calculate(Calculator calculator, Type left, Type right) {
        try {
            if (calculator == null) {
                return null;
            }
            Method method = calculator.getClass().getMethod(operator.getName(), left.getValue().getClass(), right.getValue().getClass());
            return searchType(method.invoke(calculator, left.getValue(), right.getValue()));
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
}
