package trees.traversal;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by rasn on 8/15/16.
 */
public class InOrderTraversal extends Traversal{
    @Override
    public void recursiveTraversal(TreeNode root) {
        if(root == null) return;
        recursiveTraversal(root.left);
        recursiveList.add(root.value);
        recursiveTraversal(root.right);
    }

    @Override
    public void iterativeTraversal(TreeNode root) {
        /*
        Create a stack. Push root.
        Keep traversing to left until null ( push all the elements u come across).
        Pop element and print.
        Go to it's right if it is present and Keep traversing to left until null ( push all the elements u come across).
        Repeat the above 2 steps until stack is not empty.
         */
        if(root == null) return;
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode node = root;

        while(node != null){
            stack.push(node);
            node = node.left;
        }

        while (!stack.isEmpty()){
            node = stack.pop();
            iterativeList.add(node.value);

            node = node.right;
            while(node != null){
                stack.push(node);
                node = node.left;
            }
        }
    }
}
