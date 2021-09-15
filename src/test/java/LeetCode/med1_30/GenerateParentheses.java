package LeetCode.med1_30;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. Generate Parentheses
 * Example 1:
 *
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 * Example 2:
 *
 * Input: n = 1
 * Output: ["()"]
 *
 * */

public class GenerateParentheses {

    public static List<String> generateParenthesis(int n) {
        List<String>out_put = new ArrayList<>();
      backTrack(out_put,"",0,0,n);
       
      return out_put;

    }

    public static void backTrack(List<String>out_put, String str, int open, int close, int max){

        if(str.length()== max * 2){
            out_put.add(str);
            System.out.println(str);
            return ;
        }

        if(open<max) backTrack(out_put, str + "(",open+1,close,max);
        if(close<open) backTrack(out_put, str + ")",open,close+1,max);



    }

    public static void main(String[]args){
        int n=3;

      System.out.println(generateParenthesis(n));
    }
}
