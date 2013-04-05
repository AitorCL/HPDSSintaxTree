package sintaxtree.Nodes.Operators;

import Caculator.Calculator;
import sintaxtree.Nodes.Node;
import sintaxtree.Type;

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
        Calculator calculator = Calculate.searchCalculator(left, right);
        return Calculate.performCalculation(calculator, left, right,operator);
    }   
}
