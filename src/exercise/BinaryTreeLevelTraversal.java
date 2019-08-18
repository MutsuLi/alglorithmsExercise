package exercise;
import java.util.*;
import exercise.TreeNode;

public class BinaryTreeLevelTraversal {
    static List<List<Integer>> levels = new ArrayList<List<Integer>>();

    public static void helper(TreeNode node, int level) {
        // start the current level
        if (levels.size() == level)
            levels.add(new ArrayList<Integer>());

        // fulfil the current level
        levels.get(level).add(node.val);

        // process child nodes for the next level
        if (node.left != null)
            helper(node.left, level + 1);
        if (node.right != null)
            helper(node.right, level + 1);
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return levels;
        helper(root, 0);
        return levels;
    }
    public static void main(String[] args) {
        String str = args[0];
        TreeNode root = TreeNode.mkTree(str);
        List<List<Integer>> result=levelOrder(root);
        System.out.println(result);
    }
}
