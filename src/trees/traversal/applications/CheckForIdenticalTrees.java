package trees.traversal.applications;

import trees.traversal.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by rasn on 8/16/16.
 */
public class CheckForIdenticalTrees {
    public static void main(String[] args) {
        TreeNode root1 = TreeNode.createTree1();
        TreeNode root2 = TreeNode.createTree2();
        TreeNode root3 = TreeNode.createTree3();

        System.out.println("areTreesIdenticalRecursive(root1, root2) = " + areTreesIdenticalRecursive(root1, root2));
        System.out.println("areTreesIdenticalIterative(root1, root2) = " + areTreesIdenticalIterative(root1, root2));
        System.out.println("areTreesIdenticalRecursive(root1, root3) = " + areTreesIdenticalRecursive(root1, root3));
        System.out.println("areTreesIdenticalIterative(root1, root3) = " + areTreesIdenticalIterative(root1, root3));
        
    }
    public static boolean areTreesIdenticalRecursive(TreeNode root1, TreeNode root2){
        if(root1 == null || root2 == null){
            return root1 == root2;
        }
        return root1.value == root2.value && areTreesIdenticalRecursive(root1.left, root2.left)
                && areTreesIdenticalRecursive(root1.right, root2.right);
    }

    public static boolean areTreesIdenticalIterative(TreeNode root1, TreeNode root2){
        if(root1 == null || root2 == null){
            return root1 == root2;
        }
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        Queue<TreeNode> queue2 = new ArrayDeque<>();

        queue1.add(root1);
        queue2.add(root2);
        while (!queue1.isEmpty() && !queue2.isEmpty()){
            TreeNode node1 = queue1.remove();
            TreeNode node2 = queue2.remove();

            if(node1.value != node2.value){
                return false;
            }

            if(node1.left != null && node2.left != null){
                queue1.add(node1.left);
                queue2.add(node2.left);
            } else if(node1.left == null && node2.left == null){
                continue;
            } else if(node1.left == null || node2.left == null){
                return false;
            }
        }
        return true;
    }
}
