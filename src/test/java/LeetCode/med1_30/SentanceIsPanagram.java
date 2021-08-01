package LeetCode.med1_30;
/**
 * A pangram is a sentence where every letter of the English alphabet appears at least once.
 *
 * Given a string sentence containing only lowercase English letters,
 * return true if sentence is a pangram, or false otherwise.
 * Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
 * Output: true
 * Explanation: sentence contains at least one of every letter of the English alphabet.
 *
 * Input: sentence = "leetcode"
 * Output: false
 * */

public class SentanceIsPanagram {

    public static boolean checkIfPangram(String sentence) {
       String alphabet = "abcdefghijklmnopqrstuvwxyz";
        sentence = sentence.toLowerCase();
        boolean isPanagram=true;

        for(int i=0;i<alphabet.length();i++){
            char ch = alphabet.charAt(i);
            if (!sentence.contains(Character.toString(ch))) {
                isPanagram = false;
                break;
            }
        }
        return  isPanagram;

    }



    public static void main(String[]args){

        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));

    }

}
