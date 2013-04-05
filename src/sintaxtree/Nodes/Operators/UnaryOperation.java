package sintaxtree.Nodes.Operators;

import Caculator.Calculator;
import sintaxtree.Nodes.Node;
import sintaxtree.Type;

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
        Calculator calculator = Calculate.searchCalculator(getNextNode().evaluate());
        return Calculate.performCalculation(calculator, getNextNode().evaluate(),unaryOperator);
    }

     //TODO .. move those mocked method where they belong.
    public Object increase() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    public Object decrease() {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
