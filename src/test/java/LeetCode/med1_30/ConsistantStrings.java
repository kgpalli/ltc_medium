package LeetCode.med1_30;

import java.util.HashSet;
import java.util.Set;

/**
 * 1684. Count the Number of Consistent Strings
 * Input: allowed = "ab", words = ["ad","bd","aaab","baa","badab"]
 * Output: 2
 * Explanation: Strings "aaab" and "baa" are consistent since they only contain characters 'a' and 'b'.
 * Input: allowed = "abc", words = ["a","b","c","ab","ac","bc","abc"]
 * Output: 7
 * Explanation: All strings are consistent.
 * */


public class ConsistantStrings {

    public static int countConsistentStrings(String allowed, String[] words) {

        int count =0;
       Set<Character> set = new HashSet<>();
       char[]ch = allowed.toCharArray();
       for(char c : ch){
           set.add(c);
       }
        for (String word : words) {
            for (int j = 0; j < word.length(); j++)
                if (!set.contains(word.charAt(j))) {
                    count++;
                    break;
                }
        }
        count = words.length - count;
        return count;

    }
    public static void main (String[]args){

        String allowed = "cad";
        String[]words = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println(countConsistentStrings(allowed,words));

        
    }

}
