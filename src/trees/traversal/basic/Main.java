package trees.traversal.basic;

import trees.traversal.common.Traversal;
import trees.traversal.common.TreeNode;

/**
 * Created by rasn on 8/16/16.
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = TreeNode.createTree1();

        printTraversal(new DFSPreOrderTraversal(), root);
        printTraversal(new DFSInOrderTraversal(), root);
        printTraversal(new DFSPostOrderTraversal(), root);
        printTraversal(new BFSTraversal(), root);
    }

    private static void printTraversal(Traversal traversal, TreeNode root){
        traversal.recursiveTraversal(root);
        traversal.iterativeTraversal(root);
        System.out.println(traversal.getClass().getName());
        System.out.println(traversal);
    }
}
