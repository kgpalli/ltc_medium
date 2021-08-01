package LeetCode.med1_30;

/**
 * Example 1:
 *
 * Input: s = "abab"
 * Output: true
 * Explanation: It is the substring "ab" twice.
 * Example 2:
 *
 * Input: s = "aba"
 * Output: false
 * Example 3:
 *
 * Input: s = "abcabcabcabc"
 * Output: true
 * Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
 * */

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

    int len = s.length();
    for(int i=len/2;i>=1;i--){
        if(len%i==0){
            int num_repeats = len/i;

            String substring = s.substring(0,i);
            StringBuilder sb = new StringBuilder();
            for(int j=0;j<num_repeats;j++){
                sb.append(substring);


            }
            if(sb.toString().equals(s)){return true;}
        }
    }

        return false;
    }



    public static void main(String[]args){
        String s = "abcabcabcabc";

        System.out.println(repeatedSubstringPattern(s));


    }
}
