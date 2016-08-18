package main.java.trees.traversal.common;

/**
 * Created by rasn on 8/15/16.
 */
public class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int value){
        this.value = value;
    }

    public static TreeNode createTree1(){
        return getNewTree();
    }

    public static TreeNode createTree2(){
       return getNewTree();
    }

    public static TreeNode createTree3(){
        TreeNode root = getNewTree();
        root.left = null;
        return root;
    }

    private static TreeNode getNewTree(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        return root;
    }
}
