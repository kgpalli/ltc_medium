package LeetCode.med1_30;
/**
 * Example 1:
 *
 * Input: s = "abccccdd"
 * Output: 7
 * Explanation:
 * One longest palindrome that can be built is "dccaccd", whose length is 7.
 * Example 2:
 *
 * Input: s = "a"
 * Output: 1
 * Example 3:
 *
 * Input: s = "bb"
 * Output: 2
 *
 * */

public class LongestPalindrome {


    public static int longestPalindrome(String s) {
        int count=0;

    int[] char_count = new int[128];

    for(char c : s.toCharArray()){
        char_count[c]++;
    }

    for(int i : char_count){
        count += i / 2 * 2;

        if(count % 2 ==0 && i % 2 == 1){
            count += 1;
        }
    }

    return count;
    }

    public static void main(String[]args){
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));


    }
}
