package sintaxtree.Nodes.Operators;

import Caculator.Calculator;
import Caculator.operations.CoreNumberCalculator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;
import sintaxtree.Type;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class Calculate {

    public static Type performUnaryCalculation(Calculator calculator, Type childNode, Operator unary) {
        try {
            if (calculator != null) {
                Method method = calculator.getClass().getMethod(unary.getName(), childNode.getValue().getClass());
                return searchType(method.invoke(calculator, childNode.getValue()));
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            return null;
        }
        return null;
    }

    public static Type performBinaryCalculation(Calculator calculator, Type left, Type right, Operator binary) {
        try {
            if (calculator != null) {
                Method method = calculator.getClass().getMethod(binary.getName(), left.getValue().getClass(), right.getValue().getClass());
                return searchType(method.invoke(calculator, left.getValue(), right.getValue()));
            }
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
            Logger.getLogger(BinaryOperation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            return null;
        }
        return null;
    }

    private static Type searchType(Object object) {
        if (object instanceof Double) {
            return new DoubleType((double) object);
        }
        if (object instanceof Integer) {
            return new IntegerType((int) object);
        }
        return null;
    }

    public static Calculator searchCalculator(Type childNode) {

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

    public static Calculator searchCalculator(Type left, Type right) {

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
}
