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

    //leetcode 33 搜索旋转排序数组
    //example  45678 012

    /**
     * (1) nums[0]<=target<=nums[mid] (0,mid)不包含旋转  移动右端
     * (2) target<=nums[mid]<mid[0](0,mid)包含旋转   移动右端
     * (3) nums[mid]<mid[0]<=target (0,mid)包含旋转  移动右端
     * 其余情况均为移动左端
     * nums[0]<=target<=nums[mid]
     * target<=nums[mid]<nums[0]
     * nums[mid]<nums[0]<=target
     * 综上条件可得 nums[0]<=target 与 target<=nums[mid] 与 nums[mid]<nums[0] 三者满足其一为真或者全为真,需移动左端
     */
    public static int seachTwistOrderedArray(int[] nums, int target) {
        if (nums == null && nums.length == 0) return -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[0] <= target ^ target <= nums[mid] ^ nums[mid] < nums[0]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

