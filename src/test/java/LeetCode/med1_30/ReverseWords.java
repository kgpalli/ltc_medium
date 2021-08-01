package LeetCode.med1_30;

/**
 * 151. Reverse Words in a String
 * Example 1:
 *
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * Example 2:
 *
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * Example 3:
 *
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 * Example 4:
 *
 * Input: s = "  Bob    Loves  Alice   "
 * Output: "Alice Loves Bob"
 * Example 5:
 *
 * Input: s = "Alice does not even like bob"
 * Output: "bob like even not does Alice"
 * */

public class ReverseWords {

    public static String reverseWords(String s) {
        String[]array = s.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i=array.length-1;i>=0;i--){
            if(!array[i].equals(""))
            sb.append(array[i]).append(" ");
        }

        return sb.toString().trim();

    }


    public static void main(String[]args){
        String str = "a good   example";

        System.out.println(reverseWords(str));

    }
}
