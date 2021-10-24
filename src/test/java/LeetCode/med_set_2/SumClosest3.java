package LeetCode.med_set_2;

import java.util.Arrays;
import java.util.Map;

/**
 * Example 1:
 * 16. 3Sum Closest
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * Example 2:
 *
 * Input: nums = [0,0,0], target = 1
 * Output: 0
 * */

public class SumClosest3 {
    public static int threeSumClosest(int[] nums, int target) {
       int result = nums[0]+nums[1]+nums[nums.length-1];
        Arrays.sort(nums);

       for(int i=0;i<nums.length-2;i++){
           int a_pointer = i+1;
           int b_pointer = nums.length-1;

           while (a_pointer<b_pointer){
               int currentSum = nums[i]+nums[a_pointer]+nums[b_pointer];

               if(currentSum>target){
                   b_pointer -= 1;
               }else{
                   a_pointer += 1;
               }

               if(Math.abs(currentSum-target)<Math.abs(result-target))
                   result = currentSum;

           }
       }

        return result;

    }


    public static void main (String[]args){


        int[]nums = {-1,2,1,-4};
        int target = 1;

        System.out.println(threeSumClosest(nums,target));

    }

}
