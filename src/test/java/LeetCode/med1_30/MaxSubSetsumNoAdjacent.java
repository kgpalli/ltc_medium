package LeetCode.med1_30;
/**
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * */

public class MaxSubSetsumNoAdjacent {

    public static int subSetSumNoAdjacent(int[]arr){
        // Dynamic programming => approach 1
       /* int excl = 0;
        int incl = arr[0];
        for (int i = 1; i < arr.length; i++) {
            int temp = incl;
            incl = Math.max(excl + arr[i], incl);
            excl = temp;
        }
        return incl;*/

        // Dynamic programming => approach 2

        // dp[1] = 105,
        // dp[2] = 120 + 75 OR 105 = 195,
        //dp[3] = 75 + 105 OR 195 ? 195
        //dp[4] = 90 + 195 OR 195 ? 195
        //dp[5] = 135 + 195 OR 195 ? 330

        int[]dp = new int[arr.length];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0],arr[1]);
        for(int i=2; i<arr.length;i++){
            dp[i] = Math.max(arr[i] + dp[i-2],dp[i-1]);
        }

        return dp[arr.length-1];
    }

    public static void main(String[]args){

        int [] arr = {75, 105, 120, 75, 90, 135};
        System.out.println(subSetSumNoAdjacent(arr));



    }
}
