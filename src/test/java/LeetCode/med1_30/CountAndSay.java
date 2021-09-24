package LeetCode.med1_30;

/**
 * 38. Count and Say
 * Example 1:
 *
 * Input: n = 1
 * Output: "1"
 * Explanation: This is the base case.
 * Example 2:
 *
 * Input: n = 4
 * Output: "1211"
 * Explanation:
 * countAndSay(1) = "1"
 * countAndSay(2) = say "1" = one 1 = "11"
 * countAndSay(3) = say "11" = two 1's = "21"
 * countAndSay(4) = say "21" = one 2 + one 1 = "12" + "11" = "1211"
 *
 * */

public class CountAndSay {

    public static String countAndSay(int n) {

        String val="1";


        for(int i=0;i<n-1;i++){
            char c = val.charAt(0);
            StringBuilder sb = new StringBuilder();
            int count=1;

            for(int j=1;j<val.length();j++){

                if(c != val.charAt(j)){
                    sb.append(count);
                    sb.append(c);
                    count=0;
                    c = val.charAt(j);

                }
                count++;
            }
            sb.append(count);
            sb.append(c);

            System.out.println(sb.toString());
            val = sb.toString();
        }

      return val;
    }


    public static void main(String[]args){
        int num = 7;

    System.out.println("Final value is : " + countAndSay(num));
    }
}
