package trees.traversal.basic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rasn on 8/15/16.
 */
public abstract class Traversal {
    List<Integer> recursiveList = new LinkedList<>();
    List<Integer> iterativeList = new LinkedList<>();

    public abstract void recursiveTraversal(TreeNode root);
    public abstract void iterativeTraversal(TreeNode root);

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);


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

    @Override
    public String toString() {
        return "recursiveList = " + recursiveList + "\niterativeList = " + iterativeList;
    }
}
