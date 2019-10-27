package exercise;

import java.util.*;

public class BinaryTreeTraversal {

    //leetcode 94. 二叉树的中序遍历
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorderTraversalHelper(root, res);
        return res;
    }

    public void inorderTraversalHelper(TreeNode root, List<Integer> res) {
        if (root != null) {
            if (root.left != null) {
                inorderTraversalHelper(root.left, res);
            }
            res.add(root.val);
            if (root.right != null) {
                inorderTraversalHelper(root.right, res);
            }
        }
    }

    //144. 二叉树的前序遍历 递归算法
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversalHelper(root, res);
        return res;
    }

    public void preorderTraversalHelper(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.val);
            if (root.left != null) {
                preorderTraversalHelper(root.left, res);
            }
            if (root.right != null) {
                preorderTraversalHelper(root.right, res);
            }
        }
    }

    //144. 二叉树的前序遍历 非递归算法
    public List<Integer> preorderTraversalNonrecursion(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            res.add(root.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return res;
    }
}
