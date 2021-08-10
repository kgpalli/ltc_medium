package LeetCode.med1_30;
/**
 * Example 1:
 *
 * Input: dividend = 10, divisor = 3
 * Output: 3
 * Explanation: 10/3 = truncate(3.33333..) = 3.
 * Example 2:
 *
 * Input: dividend = 7, divisor = -3
 * Output: -2
 * Explanation: 7/-3 = truncate(-2.33333..) = -2.
 * Example 3:
 *
 * Input: dividend = 0, divisor = 1
 * Output: 0
 * Example 4:
 *
 * Input: dividend = 1, divisor = 1
 * Output: 1
 * */

public class DivideTwoIntegers {

    public static int divide(int dividend, int divisor) {
       if(dividend==Integer.MIN_VALUE && divisor == -1){
           return Integer.MAX_VALUE;
       }
       boolean is_negative = (dividend>0 && divisor<0) || (dividend<0 && divisor>0);

       int shift = 31;
       long a = Math.abs((long)dividend);
       long b = Math.abs((long)dividend);

       int res=0;

       while(a>=b){
           while(a<b << shift){
               shift--;
           }
           a -= b << shift;
           res += 1<<shift;
       }

       return is_negative ? -res : res;
    }
    public static void main(String[]args){
        int dividend =-2147483648;
        int divisor = -1;

        System.out.println(divide(dividend,divisor));
    }

}
