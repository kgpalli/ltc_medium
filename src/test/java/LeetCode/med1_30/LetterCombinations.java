package LeetCode.med1_30;

import java.util.*;
/*
17. Letter Combinations of a Phone Number
Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = ""
Output: []
Example 3:

Input: digits = "2"
Output: ["a","b","c"]
 */

public class LetterCombinations {

    public static List<String> letterCombinations(String digits) {
       LinkedList<String> combination = new LinkedList<>();
       if(digits.isEmpty())return combination;


        String[]mapping = {"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        combination.add("");
        for(int i=0;i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));

            // peek at the first element of the list
            // removes 1st element, "a" and add rest characters from second index, then proceed with another character
            while(combination.peek().length()==i){
                String t = combination.remove();
                for(char s : mapping[x].toCharArray()){
              combination.add(t+s);
                }
            }
        }

        return combination;
    }

    public static void main(String[]args){
        String digit="23";
    System.out.println(letterCombinations(digit));

    }
}
