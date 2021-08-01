package LeetCode.med1_30;
/**
 * Input: arr = [1,2,4,4,4,4], m = 1, k = 3
 * Output: true
 * Explanation: The pattern (4) of length 1 is repeated 4 consecutive times.
 * Notice that pattern can be repeated k or more times but not less.
 *Input: arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
 * Output: true
 * Explanation: The pattern (1,2) of length 2 is repeated 2 consecutive times.
 * Another valid pattern (2,1) is also repeated 2 times.
 *Input: arr = [1,2,3,1,2], m = 2, k = 2
 * Output: false
 * Explanation: Notice that the pattern (1,2) exists twice but not consecutively, so it doesn't count.
 *
 * Input: arr = [2,2,2,2], m = 2, k = 3
 * Output: false
 * Explanation: The only pattern of length 2 is (2,2) however it's repeated only twice.
 * Notice that we do not count overlapping repetitions.
 *
 * */

public class ContainsPattern {
    public static boolean containsPattern(int[] arr, int m, int k) {
    int count=0;
    for(int i=0;i+m<arr.length;i++){
        count = arr[i] == arr[i+m]? count+1:0;
        if(count==(k-1)*m){
            return true;
        }
    }

        return false;
    }

    public static void main(String[]args){
        int[]arr = {1,2,4,4,4,4};
        int m=1;
        int k=3;

        System.out.println(containsPattern(arr,m,k));

    }



}
