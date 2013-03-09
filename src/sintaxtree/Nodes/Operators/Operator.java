package sintaxtree.Nodes.Operators;

public class Operator {

    private final String name;
    private final char operator;
    private final OperatorType OperatorType;

    public Operator(String name, char operator, OperatorType OperatorType) {
        this.name = name;
        this.operator = operator;
        this.OperatorType = OperatorType;
    }

    public String getName() {
        return name;
    }

    public char getOperator() {
        return operator;
    }

    public OperatorType getOperatorType() {
        return OperatorType;
    }
    
}
