package sintaxtree.Nodes.Operators;

import Caculator.Calculator;
import Caculator.operations.CoreNumberCalculator;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import sintaxtree.Type;
import sintaxtree.types.DoubleType;
import sintaxtree.types.IntegerType;

public class Calculate {

    public static Type performCalculation(Calculator calculator, Type childNode, Operator unary) {
        try {
            if (calculator != null) {
                Method method = getMethod(calculator, unary, childNode);
                return doMethod(method, calculator, childNode);
            }
        } catch (IllegalAccessException | IllegalArgumentException |
                InvocationTargetException | NoSuchMethodException ex) {
            return null;
        }
        return null;
    }

    public static Type performCalculation(Calculator calculator, Type left, Type right, Operator binary) {
        try {
            if (calculator != null) {
                Method method = getMethod(calculator, binary, left, right);
                return doMethod(method, calculator, left, right);
            }
        } catch (IllegalAccessException | IllegalArgumentException |
                InvocationTargetException | NoSuchMethodException ex) {
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
        if (isNumberCalculator(childNode)) {
            return new CoreNumberCalculator();
        }
        return null;
    }

    public static Calculator searchCalculator(Type left, Type right) {
        if (left == null || right == null) {
            return null;
        }
        if (isNumberCalculator(left, right)) {
            return new CoreNumberCalculator();
        }
        return null;
    }

    private static Method getMethod(Calculator calculator, Operator binary, Type left, Type right) throws NoSuchMethodException, SecurityException {
        return calculator.getClass().getMethod(binary.getName(), left.getValue().getClass(), right.getValue().getClass());
    }

    private static Method getMethod(Calculator calculator, Operator unary, Type childNode) throws NoSuchMethodException, SecurityException {
        Method method = calculator.getClass().getMethod(unary.getName(), childNode.getValue().getClass());
        return method;
    }

    private static Type doMethod(Method method, Calculator calculator, Type left, Type right) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        return searchType(method.invoke(calculator, left.getValue(), right.getValue()));
    }

    private static Type doMethod(Method method, Calculator calculator, Type childNode) throws InvocationTargetException, IllegalArgumentException, IllegalAccessException {
        return searchType(method.invoke(calculator, childNode.getValue()));
    }

    private static boolean isDoubleDoubleOperation(Type left, Type right) {
        return (left.getValue() instanceof Double) && (right.getValue() instanceof Double);
    }

    private static boolean isDoubleIntegerOperation(Type left, Type right) {
        return (left.getValue() instanceof Double) && (right.getValue() instanceof Integer);
    }

    private static boolean isIntegerIntegerOperation(Type left, Type right) {
        return (left.getValue() instanceof Integer) && (right.getValue() instanceof Integer);
    }

    private static boolean isIntegerDoubleOperation(Type left, Type right) {
        return (left.getValue() instanceof Integer) && (right.getValue() instanceof Double);
    }

    private static boolean isNumberCalculator(Type left, Type right) {
        if (isDoubleDoubleOperation(left, right)  ||
            isDoubleIntegerOperation(left, right) ||
            isIntegerIntegerOperation(left, right)||
            isIntegerDoubleOperation(left, right)) {
            return true;
        }
        return false;
    }

    private static boolean isNumberCalculator(Type childNode) {
        if (childNode.getValue() instanceof Double) {
            return true;
        }
        if (childNode.getValue() instanceof Integer) {
            return true;
        }
        return false;
    }
}
