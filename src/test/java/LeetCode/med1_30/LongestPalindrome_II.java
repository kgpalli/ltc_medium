package LeetCode.med1_30;
/**
 * 5. Longest Palindromic Substring
 * Example 1:
 *
 * Input: s = "babad"
 * Output: "bab"
 * Note: "aba" is also a valid answer.
 * Example 2:
 *
 * Input: s = "cbbd"
 * Output: "bb"
 * Example 3:
 *
 * Input: s = "a"
 * Output: "a"
 * Example 4:
 *
 * Input: s = "ac"
 * Output: "a"
 * */

public class LongestPalindrome_II {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start =0,end=0;
        for(int i=0;i<s.length();i++){
            int len1=expandFromCenter(s,i,i);
            int len2=expandFromCenter(s,i,i+1);

            int len = Math.max(len1,len2);
            if(len>end-start){
                start = i-(len-1)/2;
                end = i+len/2;
            }
        }

        return s.substring(start,end+1);

    }

    public int expandFromCenter(String s, int left, int right){
        if(s==null || left>right)return 0;
         int L = left;
         int R = right;
         while(L>=0 && R<s.length() && s.charAt(L)==s.charAt(R)){
             L--;
             R++;
         }

         return R-L-1;
    }


    public static void main(String[]args){
        String s ="ac";
        LongestPalindrome_II lp = new LongestPalindrome_II();
        System.out.println(lp.longestPalindrome(s));

    }

}
