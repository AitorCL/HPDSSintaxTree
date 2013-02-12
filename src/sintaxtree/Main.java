
package sintaxtree;

import sintaxtree.Nodes.ConstantNode;
import sintaxtree.Nodes.Operators.binary.AddBinaryOperatorNode;
import sintaxtree.Nodes.Operators.binary.MultiplicationBinaryOperartorNode;


public class Main {


    public static void main(String[] args) {
        // TODO code application logic here
        SintaxTree sintaxTree = new SintaxTree();
        ConstantNode constantNodeUno = new ConstantNode(1);
        ConstantNode constantNodeDos = new ConstantNode(2);
        ConstantNode constantNodeTres = new ConstantNode(3);
        AddBinaryOperatorNode addNode = new AddBinaryOperatorNode();
        MultiplicationBinaryOperartorNode mulNode = new MultiplicationBinaryOperartorNode();
        
        
        mulNode.setLeftNode(constantNodeDos);
        mulNode.setRigthNode(constantNodeTres);
        addNode.setLeftNode(constantNodeUno);
        addNode.setRigthNode(mulNode);
        sintaxTree.setTreeRoot(addNode);
        double expresionResult;
        
        expresionResult = (!sintaxTree.isEmptySintaxTree()) ? sintaxTree.getTreeRoot().evaluate() : 0;       
        System.out.println(expresionResult);
    }
}
