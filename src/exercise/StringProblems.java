package exercise;

public class StringProblems {

    //344. 反转字符串 使用 O(1) 的额外空间
    public void reverseString(char[] s) {
        for (int i = 0, j = s.length - 1; i <= j; i++, j--) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
        }
    }
}
