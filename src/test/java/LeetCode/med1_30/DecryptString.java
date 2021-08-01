package LeetCode.med1_30;
/**
 *Input: s = "10#11#12"
 * Output: "jkab"
 * Explanation: "j" -> "10#" , "k" -> "11#" , "a" -> "1" , "b" -> "2".
 *
 * Input: s = "12345678910#11#12#13#14#15#16#17#18#19#20#21#22#23#24#25#26#"
 * Output: "abcdefghijklmnopqrstuvwxyz"
 * */

public class DecryptString {

    public static String freqAlphabets(String s) {

         char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l',
         'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
         char[] input = s.toCharArray();
         StringBuilder sb = new StringBuilder(input.length);

        int i=0;
        while (i<input.length){
            if(i< input.length-2 && input[i+2]=='#'){
                int digitTwo = Character.getNumericValue(input[i]) * 10;
                int digitOne = Character.getNumericValue(input[i+1]);
                int comb_num = digitOne+digitTwo;

                char letter = alpha[comb_num-1];
                sb.append(letter);
                i = i+3;
            }else{
                int comb_num = Character.getNumericValue(input[i]);
                char letter = alpha[comb_num-1];
                sb.append(letter);
                i++;
            }

        }
        return sb.toString();

    }

    public static void main(String[]args){
        String s = "10#11#12";

        System.out.println(freqAlphabets(s));

    }


}
