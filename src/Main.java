import com.sun.source.tree.BinaryTree;
import exercise.*;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String expression1 = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        double cal1 = Expression.calculate(expression1);
        System.out.println(cal1);
        System.out.println("-------");
        String expression2 = "( 12 + ( ( 8 / 4 ) * ( 9 - 5 ) ) )";
        double cal2 = Expression.calculate(expression2);
        System.out.println(cal2);
        String test = "[{()()}]";
        System.out.println(Parentheses.isValid(test));
        System.out.println("-------");
//        String test2 = "(2+((3+4)*(5*6)))";
//        System.out.println((InfixtoPostfix.postFix(test2)));
        String[] test3 = {"3", "10"};
        Josephus.main(test3);
        Boolean result = Palindrome.isPalindrome(1221);
        System.out.println(result);
        String[] test102 = {"[3,9,20,null,null,15,7]"};
        BinaryTreeLevelTraversal.main(test102);
        // leetcode 2
        int[] leetcode2_1 = {2, 3, 4};
        int[] leetcode2_2 = {5, 6, 4};
        ListNode leetcode2_3 = ListNode.arrayToListNode(leetcode2_1);
        ListNode leetcode2_4 = ListNode.arrayToListNode(leetcode2_2);
        TwoNumbers leetcode2_5 = new TwoNumbers();
        System.out.println(leetcode2_5.addTwoNumbers(leetcode2_3, leetcode2_4));
        //leetcode 21
        int[] leetcode21_1 = {1, 2, 3};
        int[] leetcode21_2 = {1, 3, 4};
        ListNode leetcode21_3 = ListNode.arrayToListNode(leetcode21_1);
        ListNode leetcode21_4 = ListNode.arrayToListNode(leetcode21_2);
        OrderedList leetcode21_5 = new OrderedList();
        System.out.println(leetcode21_5.mergeTwoLists(leetcode21_3, leetcode21_4));
        //leetcode88
        int[] leetcode88_1 = {1, 2, 3, 0, 0, 0};
        int[] leetcode88_2 = {2, 5, 6};
        OrderedArray.mergeArray(leetcode88_1, 3, leetcode88_2, 3);
        System.out.println(Arrays.toString(leetcode88_1));
        System.out.println(subStr.IndexOf("hello", "hello", 0));
        PermuteUnique.main(test102);
        //leetcode35
        int[] leetcode_25={1,2,7,10};
        System.out.println(BinarySearch.insertSearch(leetcode_25,11));
        //leetcode35
        String leetcode_5 = "ccc";
        System.out.println(Palindrome.longestPalindrome((leetcode_5)));
        //leetcode53 DynamicProgamming
        int[] leetcode_53 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(DynamicProgamming.maxSubArray((leetcode_53)));
        //leetcode67
        String test67_1 = "1011";
        String test67_2 = "011";
        System.out.println(TwoNumbers.addBinary(test67_1, test67_2));

        //leetcode34
        int[] test34_1 = {2, 2};
        int test34_2 = 3;
        System.out.println(Arrays.toString((BinarySearch.searchRange(test34_1, test34_2))));

        //leetcode 104
        String test104 = "[3,9,20,null,null,15,7]";
        TreeNode root104 = TreeNode.mkTree(test104);
        System.out.println("leetcode 104 BFS:" + BinaryTreeProblems.maxDepthBFSNonrecursion(root104));
        System.out.println("leetcode 104 DFS:" + BinaryTreeProblems.maxDepthDFSNonrecursion(root104));

        //leetcode 17
        letterCombinations test17 = new letterCombinations();
        System.out.println(test17.letterCombination(""));

        //leetcode 136
        int[] test136 = {2, 2, 1};
        System.out.println(singleNumber.singleNumberXOR((test136)));

        //leetcode 111
        String test111 = "[1,2]";
        TreeNode root111 = TreeNode.mkTree(test111);
        System.out.println(BinaryTreeProblems.minDepthBFSNonrecursion(root111));

        //leetcode33
        int[] test34_nums = {4, 5, 6, 7, 0, 1, 2};
        int test34_target = 0;
        System.out.println("leetcode33: " + BinarySearch.seachTwistOrderedArray(test34_nums, test34_target));

        //leetcode19
        int[] test19_nums = {1, 2};
        ListNode leetcode19_list = ListNode.arrayToListNode(test19_nums);
        System.out.println("leetcode19: " + LinklistProblems.removeNthFromEnd(leetcode19_list, 1));

        //leetcode 112
        String test112 = "[5,4,8,11,null,13,4,7,2,null,null,null,1]";
        TreeNode root112 = TreeNode.mkTree(test112);
        System.out.println("leetcode112: " + BinaryTreeProblems.hasPathSumNonRecursion(root112, 22));


        //leetcode 249
        int[] test249_nums1 = {1, 2, 2, 1};
        int[] test249_nums2 = {2, 2};
        System.out.println("leetcode249: " + Arrays.toString(ArrayProblems.intersection(test249_nums1, test249_nums2)));


    }


//    public static void printTransposedMatrix(int[][] matrix) {
//        for (int i = 0; i < matrix[0].length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                System.out.printf("%4d", matrix[j][i]);
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        int[][] a = { { 100, 200, 300 }, { 400, 500, 600 } };
//        printTransposedMatrix(a);
//    }
//    public static void main(String[] args) {
//////        int[] a = {10, 4, 7, 1, 11};
//////        int len = a.length;
//////        int result = rank(7, a);
//////        System.out.println(a);
//////        char test=(char)('a'+4);
//////        System.out.println(test);
//////        System.out.println("Hello World!");
//////    }
//////
//////    public static int rank(int key, int[] a) {
//////        return binaryRank(key, a, 0, a.length - 1);
//////    }
//////
//////    public static int binaryRank(int key, int[] a, int low, int high) {
//////        if (low > high) return -1;
//////        int mid = (low + high) / 2;
//////        if (key < a[mid]) return binaryRank(key, a, low, mid + 1);
//////        else if (key > a[mid]) return binaryRank(key, a, mid + 1, high);
//////        else return mid;
//////    }

    /*
     *  number to binary string
     * */
//    public static String int2BinaryString(int number){
//        if(number==0) return "0";
//        int bufLen=32;
//        int index=bufLen;
//        char []result=new char[bufLen];
//        for (int i=0;i<index;i--){
//            if(number!=0){
//                result[--index]=(char)('0'+(number&1));
//            }
//            number=number>>>1;
//        }
//        return new String(result, index, bufLen - index);
//    }
//    public static void main(String[] args) {
//        int value =-1024;
//        System.out.println("value:"+ value + "; result for toBinaryString>>>\r\n\t" + int2BinaryString(value));
//    }

//    public static int rank(int key, int[] a) {
//        int low=0;
//        int high=a.length-1;
//        while(low<=high){
//            int mid=low+(high-low)/2;
//            if(a[mid]==key){
//                while(mid>=0&&a[mid]==key){
//                    mid--;
//                }
//                return ++mid;
//            }else if(a[mid]<key){
//                low=mid+1;
//            }else if(a[mid]>key){
//                high=mid-1;
//            }
//        }
//        return -1;
//    }
//
//    public static int count(int key, int[] a) {
//        int num=1;
//        int pos=rank(key,a);
//        while(a[pos]==a[++pos]){
//            num++;
//        }
//        return num;
//    }
//
//    public static void main(String[] args) {
//        int[] a=new int[]{84,48,68,10,18,98,12,23,54,57,33,16,77,11,29,11,29,77,77};
//        Arrays.sort(a);
//        System.out.println(rank(29,a));
//        System.out.println(count(29,a));
//    }
}

