package trees.traversal.basic;


import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by rasn on 8/15/16.
 */
public class DFSPreOrderTraversal extends Traversal{

    @Override
    public void recursiveTraversal(TreeNode root) {
        if( root == null ){
                return;
            }
        recursiveList.add(root.value);
        recursiveTraversal(root.left);
        recursiveTraversal(root.right);
    }

    @Override
    public void iterativeTraversal(TreeNode root) {
        /*
        Create a stack. Push root.
        while stack is not empty
            pop a node from stack,
            push it's right,
            push it's left.
         */
        if(root == null) {
            return;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            iterativeList.add(node.value);
            if(node.right != null) {
                stack.push(node.right);
            }
            if(node.left != null){
                stack.push(node.left);
            }
        }
    }
}
