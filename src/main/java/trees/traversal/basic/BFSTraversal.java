package main.java.trees.traversal.basic;

import main.java.trees.traversal.common.TreeNode;
import main.java.trees.traversal.common.Traversal;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by rasn on 8/16/16.
 */
public class BFSTraversal extends Traversal {
    @Override
    public void recursiveTraversal(TreeNode root) {
        System.out.println("Breadth First Search Traversal Algorithm is an Iterative Algorithm");
    }

    @Override
    public void iterativeTraversal(TreeNode root) {
        if(root == null) return;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node = queue.remove();
            iterativeList.add(node.value);
            if(node.left != null){
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }

    }
}
