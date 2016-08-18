package main.java.trees.traversal.common;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by rasn on 8/15/16.
 */
public abstract class Traversal {
    public List<Integer> recursiveList = new LinkedList<>();
    public List<Integer> iterativeList = new LinkedList<>();

    public abstract void recursiveTraversal(TreeNode root);
    public abstract void iterativeTraversal(TreeNode root);

    @Override
    public String toString() {
        return "recursiveList = " + recursiveList + "\niterativeList = " + iterativeList;
    }
}
