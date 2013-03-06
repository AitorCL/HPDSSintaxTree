package sintaxtree.Nodes.Value;

import sintaxtree.evaluator.Type;

public class DoubleNode extends Value{

    private Type doubleValue;

    public DoubleNode(Type doubleValue) {
        this.doubleValue = doubleValue;
    }
    
    @Override
    public Type evaluate() {
        return doubleValue;
    }
    
}
