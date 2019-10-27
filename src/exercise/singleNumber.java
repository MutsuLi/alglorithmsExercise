package exercise;

import java.util.*;

public class singleNumber {

    //leetcode 136. 只出现一次的数字
    /*
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     */
    //1.hash表
    public static int singleNumberHash(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : nums) {
            Integer count = map.get(i);
            count = (count == null) ? 1 : ++count;
            map.put(i, count);
        }
        for (Integer i : map.keySet()) {
            Integer count = map.get(i);
            if (count == 1) {
                return i;
            }
        }
        return -1;
    }

    //2.异或
    /*
     * (1).一个数和 0 做 XOR 运算等于本身：a⊕0 = a
     * (2).一个数和其本身做 XOR 运算等于 0：a⊕a = 0
     * (3).XOR 运算满足交换律和结合律：a⊕b⊕a = (a⊕a)⊕b = 0⊕b = b
     * */

    public static int singleNumberXOR(int[] nums) {
        int ans = 0;
        for (int num : nums) {
            ans ^= num;
        }
        return ans;
    }

}
