package sintaxtree.Nodes.Operators;

public class Operator {

    public static final Operator add = new Operator("add", "+", OperatorType.BINARY);
    public static final Operator minus = new Operator("minus", "-", OperatorType.BINARY);
    public static final Operator mult = new Operator("mult", "*", OperatorType.BINARY);
    public static final Operator division = new Operator("division", "/", OperatorType.BINARY);
    public static final Operator increase = new Operator("increase", "++", OperatorType.UNARY);
    public static final Operator decrease = new Operator("decrease", "--", OperatorType.UNARY);
    private final String name;
    private final String operator;
    private final OperatorType operatorType;

    public Operator(String name, String operator, OperatorType operatortype) {
        this.name = name;
        this.operator = operator;
        this.operatorType = operatortype;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return operator;
    }

    public OperatorType getOperatorType() {
        return operatorType;
    }
}
