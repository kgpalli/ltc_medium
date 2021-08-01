package LeetCode.med1_30;

import java.util.HashSet;
import java.util.Set;

/**
 * 3. Longest Substring Without Repeating Characters
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 * */

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int a_pointer=0;
        int b_pointer = 0;
        int max=0;

        while(b_pointer<s.length())
        {
            char ch = s.charAt(b_pointer);
            if(!set.contains(ch)){
                set.add(ch);
                b_pointer++;
                max = Math.max(set.size(),max);

            }else{
                set.remove(s.charAt(a_pointer));
                a_pointer++;
            }
        }
        System.out.println(max);
        return max;

    }


    public static void main(String[]args){
        String s = "abcabcbb";

        lengthOfLongestSubstring(s);

    }
}
