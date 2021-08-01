package LeetCode.med1_30;
/**
 * 152. Maximum Product Subarray
 * Example 1:
 *
 * Input: nums = [2,3,-2,4]
 * Output: 6
 * Explanation: [2,3] has the largest product 6.
 * Example 2:
 *
 * Input: nums = [-2,0,-1]
 * Output: 0
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 *
 * */
public class MaxProduct {

    public static int maxProduct(int[] nums) {

        int length = nums.length;
        if(length==0)return 0;

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for(int i=1;i<length;i++){
            int temp_max = Math.max(nums[i] * max, Math.max(nums[i]*min,nums[i]));
             min = Math.min(nums[i] * max, Math.min(nums[i]*min,nums[i]));
            max = temp_max;
             result = Math.max(result,max);
        }
        return result;

    }
    public static void main(String[]args){

        int []nums = {2,3,-2,4};

        System.out.println(maxProduct(nums));


    }

}
