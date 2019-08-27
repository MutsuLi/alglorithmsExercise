package exercise;
//import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeProblems {

    //leetcode 104 二叉树的最大深度 非递归BFS
    public static int maxDepthBFSNonrecursion(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return 0;
        }
        queue.add(root);
        int depth = 0;

        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();
            while (size > 0) {
                TreeNode current = queue.poll();
                if (current.left != null) queue.add(current.left);
                if (current.right != null) queue.add(current.right);
                size--;
            }
        }
        return depth;
    }

    //leetcode 104 二叉树的最大深度 递归DFS
    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left_height = maxDepth(root.left);
        int right_height = maxDepth(root.right);
        return Math.max(left_height, right_height) + 1;
    }
}
