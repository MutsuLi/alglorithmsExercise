package exercise;
//import javafx.util.Pair;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeProblems {

    //leetcode 104 二叉树的最大深度 非递归BFS 使用队列实现
    public static int maxDepthBFSNonrecursion(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>(); //使用队列
        if (root == null) return 0;
        queue.add(root);
        int depth = 0; //记录二叉树的深度
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();//当前深度的节点数;
            while (size > 0) {
                TreeNode curr = queue.poll();
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
                size--;
            }
        }
        return depth;
    }

    //leetcode 104 二叉树的最大深度 非递归DFS 使用栈实现
    public static int maxDepthDFSNonrecursion(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Stack<Pair<TreeNode, Integer>> stack = new Stack<>();
        stack.push(new Pair(root, 1));
        int depth = 0;
        while (!stack.isEmpty()) {
            Pair<TreeNode, Integer> node = stack.pop();
            TreeNode curr = node.getKey();
            int temp = node.getValue();
            depth = Math.max(temp, depth);
            if (curr.left != null) {
                stack.push(new Pair(curr.left, temp + 1));
            }
            if (curr.right != null) {
                stack.push(new Pair(curr.right, temp + 1));
            }
        }
        return depth;
    }

    //leetcode 111 二叉树的最小深度 非递归BFS 队列
    public static int minDepthBFSNonrecursion(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return 0;
        queue.add(root);
        int depth = 0; //记录二叉树的深度
        while (!queue.isEmpty()) {
            depth++;
            int size = queue.size();//当前深度的节点数;
            while (size > 0) {
                TreeNode curr = queue.poll();
                if (curr.left == null && curr.right == null) {
                    return depth;
                }
                if (curr.left != null) queue.add(curr.left);
                if (curr.right != null) queue.add(curr.right);
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

    //112. 二叉树的路径总和 非递归DFS
    public static boolean hasPathSumNonRecursion(TreeNode root, int sum) {
        if (root == null) return false;
        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> sumStack = new Stack<>();
        nodeStack.push(root);
        sumStack.push(sum - root.val);
        TreeNode node;
        int currSum;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            currSum = sumStack.pop();
            if (node.left == null && node.right == null && currSum == 0) {
                return true;
            }
            if (node.right != null) {
                nodeStack.push(node.right);
                sumStack.push(currSum - node.right.val);
            }
            if (node.left != null) {
                nodeStack.push(node.left);
                sumStack.push(currSum - node.left.val);
            }
        }
        return false;
    }

    //543. 二叉树的直径 两结点之间的路径长度
    public int diameterOfBinaryTree(TreeNode root) {

        return 0;
    }
}
