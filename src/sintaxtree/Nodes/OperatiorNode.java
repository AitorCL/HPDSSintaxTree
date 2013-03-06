
package sintaxtree.Nodes;

import sintaxtree.evaluator.Type;


public abstract class OperatiorNode extends Node{
    @Override
    public abstract Type evaluate();
}
