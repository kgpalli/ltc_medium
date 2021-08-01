package LeetCode.med1_30;

/**
 * We define the usage of capitals in a word to be right when one of the following cases holds:
 *
 * All letters in this word are capitals, like "USA".
 * All letters in this word are not capitals, like "leetcode".
 * Only the first letter in this word is capital, like "Google".
 * Input: word = "USA"     Output: true
 * Input: word = "FlaG"   Output: false
 *
 * */

public class DetectCapitol {

    public  static boolean detectCapitalUse(String word) {
        int len = word.length();
        boolean firstChar = Character.isUpperCase(word.charAt(0));
        int upper_case_count=0;
        int lower_case_count=0;

        for(int i=0;i<word.length();i++){
           if(Character.isLowerCase(word.charAt(i))) {
               lower_case_count++;
           }else{
               upper_case_count++;
           }
        }

        if(firstChar && lower_case_count==len-1){
          return  true;
        }
        return upper_case_count==len || lower_case_count==len;
    }



    public static void main(String[]args){

        String s = "FlaG";

        System.out.println(detectCapitalUse(s));

    }
}
