package LeetCode.med1_30;

import java.util.Arrays;
import java.util.Stack;

/**
 * 1652. Defuse the Bomb
 * You have a bomb to defuse, and your time is running out!
 * Your informer will provide you with a circular array code of length of n and a key k.
 *
 * Input: code = [5,7,1,4], k = 3
 * Output: [12,10,16,13]
 * Explanation: Each number is replaced by the sum of the next 3 numbers.
 * The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.
 *
 * Input: code = [1,2,3,4], k = 0
 * Output: [0,0,0,0]
 * Explanation: When k is zero, the numbers are replaced by 0.
 *
 * Input: code = [2,4,9,3], k = -2
 * Output: [12,5,6,13]
 * Explanation: The decrypted code is [3+9, 2+3, 4+2, 9+4].
 * Notice that the numbers wrap around again. If k is negative, the sum is of the previous numbers.
 * */

public class DefuseTheBomb {

    public static int[] decrypt(int[] code, int k) {
        int[]arr = new int[code.length];
        if(k>0){
            int sumOfK = 0;
            for(int i=0;i<k;i++){
                sumOfK += code[i];
            }

            // WE  take total of k elements first, in second loop remove element element at current index and add value
            // element which is missing
            for(int j=0;j<code.length;j++){
                sumOfK -= code[j];
                System.out.println(j+k);
                sumOfK += code[(j+k)%code.length];
                arr[j] = sumOfK;
            }

        }
        return arr;
    }

    public static void main(String[]args){

        int[]code = {5,7,1,4};
        int k = 3;

        System.out.println(Arrays.toString(decrypt(code,k)));

    }
}
