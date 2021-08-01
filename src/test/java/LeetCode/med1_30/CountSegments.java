package LeetCode.med1_30;
/**
 * Example 1:
 *
 * Input: s = "Hello, my name is John"
 * Output: 5
 * Explanation: The five segments are ["Hello,", "my", "name", "is", "John"]
 * Example 2:
 *
 * Input: s = "Hello"
 * Output: 1
 * Example 3:
 *
 * Input: s = "love live! mu'sic forever"
 * Output: 4
 * */
public class CountSegments {

    public  static int countSegments(String s) {
        int count=0;
        int i=0;
        while(i<s.length()){

            if((i==0 || s.charAt(i-1) == ' ' )&& s.charAt(i) != ' '){
                count++;
            }
            i++;
        }

        return count;
    }


    public static void main(String[]args){
        String s = "Hello, my name is John";
        System.out.println(countSegments(s));

    }
}
