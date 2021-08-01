package LeetCode.med1_30;

/**
 * Example 1:
 *
 * Input: s = "IDID"
 * Output: [0,4,1,3,2]
 * Example 2:
 *
 * Input: s = "III"
 * Output: [0,1,2,3]
 * Example 3:
 *
 * Input: s = "DDI"
 * Output: [3,2,0,1]
 * */

import java.util.Arrays;

public class DIStringMatch {

    public static int[] diStringMatch(String S) {

        int N = S.length();
        int lo = 0, hi = N;
        int[] ans = new int[N + 1];
        for (int i = 0; i < N; ++i) {
            if (S.charAt(i) == 'I'){
                ans[i] = lo++;
            System.out.println("--->" + ans[i]);}
            else{
                ans[i] = hi--;
            System.out.println("<---" + ans[i]);}
        }

        ans[N] = lo;
        return ans;

    }

    public static void main(String[]args){

        String s = "IDID";
        System.out.println(Arrays.toString(diStringMatch(s)));

    }

}
