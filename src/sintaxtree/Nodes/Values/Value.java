package sintaxtree.Nodes.Values;

import sintaxtree.Nodes.Node;
import sintaxtree.evaluator.Type;

public abstract class Value extends Node{
    @Override
    public abstract Type evaluate();   
}
