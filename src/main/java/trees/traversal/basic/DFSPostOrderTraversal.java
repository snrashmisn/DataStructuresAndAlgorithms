package main.java.trees.traversal.basic;

import main.java.trees.traversal.common.TreeNode;
import main.java.trees.traversal.common.Traversal;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by rasn on 8/15/16.
 */
public class DFSPostOrderTraversal extends Traversal {
    @Override
    public void recursiveTraversal(TreeNode root) {
        if(root == null) return;
        recursiveTraversal(root.left);
        recursiveTraversal(root.right);
        recursiveList.add(root.value);
    }

    @Override
    public void iterativeTraversal(TreeNode root) {
        /*
        Create two stacks - stackTemp and stackPerm.
        Push root to stackTemp.
        while stackTemp is not empty,
            pop element from stackTemp an push to stackPerm.
            push left and right child of that element to stackTemp.
         */
        if( root == null) return;
        Deque<TreeNode> stackTemp = new ArrayDeque<>();
        Deque<TreeNode> stackPermanent = new ArrayDeque<>();

        stackTemp.push(root);
        while (!stackTemp.isEmpty()){
            TreeNode node = stackTemp.pop();
            stackPermanent.push(node);
            if(node.left != null){
                stackTemp.push(node.left);
            }
            if(node.right != null){
                stackTemp.push(node.right);
            }
        }

        while(!stackPermanent.isEmpty()){
            iterativeList.add(stackPermanent.pop().value);
        }
    }
}
