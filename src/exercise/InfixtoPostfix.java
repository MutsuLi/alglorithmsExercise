package exercise;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

public class InfixtoPostfix {
    public static String postFix(String str){
        String postFixStr="";
        Stack<Character> stack=new Stack<Character>();
       for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if(s=='+'||s=='-'||s=='*'||s=='/') stack.push(s);
            else if(s=='(')  postFixStr+="";
            else if(s==')') postFixStr+=stack.pop();
            else postFixStr+=s;
        }
       return postFixStr;
    }

    public static void main(String[] args) {
        String test="( 2 + ( ( 3 + 4 ) * ( 5 * 6 ) ) )";
        StdOut.println(postFix(test));
    }
}
