package exercise;

public class Palindrome {
    public static Boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return x == revertedNumber || x == revertedNumber / 10;
    }

    //最长回文子串
    public static String longestPalindrome(String str) {
        int length = str.length();
        if (length == 0) return "";
        int[][] dp = new int[length][length];

        int beginIndex = 0;
        int endIndex = 0;
        for (int i = 0; i < length; i++) {
            dp[i][i] = 1;
            if (i < length - 1 && str.charAt(i) == str.charAt(i + 1)) {
                dp[i][i + 1] = 1;
                beginIndex = i;
                endIndex = i + 1;
            }
        }
        for (int L = 3; L <= length; L++) {
            for (int i = 0; i + L - 1 < length; i++) {
                int j = i + L - 1;
                if (str.charAt(i) == str.charAt(j) && dp[i + 1][j - 1] == 1) {
                    dp[i][j] = 1;
                    beginIndex = i;
                    endIndex = j;
                }
            }
        }
        return str.substring(beginIndex, endIndex + 1);
    }

}
