package exercise;

import java.util.*;

public class DynamicProgamming {
    //leetcode 53 最长序列和
    public static int maxSubArray(int[] nums) {
        int length = nums.length;
        int dp[] = new int[length];
        int maxValue = 0;
        // 边界
        dp[0] = nums[0];
        for (int i = 1; i < length; i++) {
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            maxValue = Math.max(dp[i], maxValue);
        }
        return maxValue;
//        int sum=0;
//        int ans=0;
//        for (int num:nums) {
//            if(sum>=0){
//                sum+=num;
//            }else{
//                sum=num;
//            }
//            ans=Math.max(ans,sum);
//        }
//        return ans;
    }

    //leetcode 53 最长序列和
    public static int climbStairs(int n) {
        if (n == 1) return 1;
        int dp[] = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

