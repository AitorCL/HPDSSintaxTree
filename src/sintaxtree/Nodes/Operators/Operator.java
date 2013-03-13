package sintaxtree.Nodes.Operators;

public class Operator {

    public static final Operator add = new Operator("add", '+', OperatorType.BINARY);
    
    
    private final String name;
    private final char operator;
    private final OperatorType operatorType;  
    
    public Operator(String name, char operator, OperatorType operatortype) {
        this.name = name;
        this.operator = operator;
        this.operatorType = operatortype;
    }

    public String getName() {
        return name;
    }

    public String getOperator() {
        return Character.toString(operator);
    }

    public OperatorType getOperatorType() {
        return operatorType;
    }
    
}
