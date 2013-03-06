
package sintaxtree.Nodes.Value;

import sintaxtree.evaluator.Type;

public class IntegerNode extends Value{

    private Type integerValue;

    public IntegerNode(Type integerValue) {
        this.integerValue = integerValue;
    }
    
    @Override
    public Type evaluate() {
        return integerValue;
    }
    
}
