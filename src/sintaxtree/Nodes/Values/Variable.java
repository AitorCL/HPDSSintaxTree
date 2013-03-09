package sintaxtree.Nodes.Values;

import sintaxtree.Nodes.Node;
import sintaxtree.Type;

public class Variable extends Node {

    private Type value;

    public Variable(Type value) {
        this.value = value;
    }

    public void setValue(Type value) {
        this.value = value;
    }

    public Type getValue() {
        return value;
    }

    @Override
    public Type evaluate() {
        return this.value;
    }
}
