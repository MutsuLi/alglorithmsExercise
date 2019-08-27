package exercise;

public class BinarySearch {
    public static int insertSearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    //leetcode 34 在排序数组中查找元素的第一个和最后一个位置 --左边界
    public static int binarySearhLeftBound(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        if (right == 0) return -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        if (left == nums.length) return -1;
        return nums[left] == target ? left : -1;
    }

    //leetcode 34 在排序数组中查找元素的第一个和最后一个位置-右边界
    public static int binarySearhRightBound(int[] nums, int target) {
        int right = nums.length;
        int left = 0;
        if (right == 0) return -1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid;
            }
        }
        if (left == 0) return -1;
        return nums[left - 1] == target ? left - 1 : -1;
    }

    //leetcode 34 在排序数组中查找元素的第一个和最后一个位置
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = binarySearhLeftBound(nums, target);
        ans[1] = binarySearhRightBound(nums, target);
        return ans;
    }
}

