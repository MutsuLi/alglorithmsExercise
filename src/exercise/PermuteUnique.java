package exercise;
import java.util.*;
import java.util.Stack;

public class PermuteUnique {
    private List<List<Integer>> res = new ArrayList<>();
    private boolean[] used;

    public void findPermuteUnique(int[] nums, int depth, Stack<Integer> stack) {
        if (depth == nums.length) {
            res.add(new ArrayList<>(stack));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                stack.add(nums[i]);
                findPermuteUnique(nums, depth + 1, stack);
                stack.pop();
                used[i] = false;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        int length = nums.length;
        if (length == 0) {
            return res;
        }
        Arrays.sort(nums);
        used = new boolean[length];
        findPermuteUnique(nums, 0, new Stack<>());
        return res;
    }
    public static void main(String[] args) {
        int[] nums = {3, 3, 0, 3};
        PermuteUnique solution = new PermuteUnique();
        List<List<Integer>> permuteUnique = solution.permuteUnique(nums);
        System.out.println(permuteUnique);
    }
}
