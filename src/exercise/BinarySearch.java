package exercise;

public class BinarySearch {
    public static int insertSearch(int [] nums,int target){
        int left=0;
        int right=nums.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return left;
    }
}
