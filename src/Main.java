import exercise.Expression;
import exercise.InfixtoPostfix;
import exercise.Josephus;
import exercise.Parentheses;

public class Main {

    public static void main(String[] args) {
        String expression1 = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        double cal1 = Expression.calculate(expression1);
        System.out.println(cal1);
        System.out.println("-------");
        String expression2 = "( 12 + ( ( 8 / 4 ) * ( 9 - 5 ) ) )";
        double cal2 = Expression.calculate(expression2);
        System.out.println(cal2);
        String test = "[{()[()}]";
        System.out.println(Parentheses.isBalanced(test));
        System.out.println("-------");
        String test2 = "(2+((3+4)*(5*6)))";
        System.out.println((InfixtoPostfix.postFix(test2)));
        String[] test3 = {"3", "10"};
        Josephus.main(test3);
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

