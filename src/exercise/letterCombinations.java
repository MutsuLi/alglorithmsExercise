package exercise;

import java.util.ArrayList;
import java.util.List;

public class letterCombinations {

    //leetcode 17 电话号码的字母组合 DFS
    String[] letterMap = new String[]{
            " ",    //0
            "",     //1
            "abc",  //2
            "def",  //3
            "ghi",  //4
            "jkl",  //5
            "mno",  //6
            "pqrs", //7
            "tuv",  //8
            "wxyz"  //9
    };
    public List<String> res;

    public List<String> letterCombination(String digits) {
        res = new ArrayList<>();
        if (digits.equals("")) {
            return res;
        }
        backtrack(digits, 0, "");
        return res;
    }

    public void backtrack(String digits, int index, String combination) {
        if (index == digits.length()) {
            res.add(combination);
        } else {
            Character current = digits.charAt(index);
            String letters = letterMap[current - '0'];
            for (int i = 0; i < letters.length(); i++) {
                backtrack(digits, index + 1, combination + letters.charAt(i));
            }
        }
    }
}
