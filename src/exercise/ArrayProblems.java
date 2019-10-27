package exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.*;

public class ArrayProblems {

    /**
     * leetcode 169. 求众数
     * 给定一个大小为 n 的数组，找到其中的众数,众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素
     * 数组非空，并且给定的数组总是存在众数
     */

    //answer i: hashmap
    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>(); //num:count
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            } else {
                counts.put(num, counts.get(num) + 1);
            }
        }
        Map.Entry<Integer, Integer> result = null;
        for (Map.Entry<Integer, Integer> entity : counts.entrySet()) {
            if (result == null || entity.getValue() > result.getValue()) {
                result = entity;
            }
        }
        return result.getKey();
    }

    //answer ii: 消除法
    public static int majorityElement_elimination(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            if (stack.isEmpty() || stack.peek() == num) {
                stack.push(num);
            } else {
                stack.pop();
            }
        }
        return stack.peek();
    }

    //349. 两个数组的交集
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int minLen = Math.min(nums1.length, nums2.length);
        int[] res = new int[minLen];
        for (int num : nums1) {
            set.add(num);
        }
        int k = 0;
        for (int num : nums2) {
            if (set.contains(num)) {
                res[k++] = num;
                set.remove(num);
            }
        }
        return Arrays.copyOf(res, k);
    }
}
