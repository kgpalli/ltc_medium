package LeetCode.med1_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Example 2:
 *
 * Input: nums = []
 * Output: []
 * Example 3:
 *
 * Input: nums = [0]
 * Output: []
 *
 *
 * */

public class ThreeSum {

    public static List<List<Integer>>threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>output_arr = new ArrayList<>();

        for(int i=0;i<nums.length-2;i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int low = i+1;
                int high = nums.length - 1;
                int sum = -nums[i];

                while (low < high) {
                    if (nums[low]+nums[high] == sum){
                  output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                  while(low < high && nums[low] == nums[low+1])low++;
                  while(low < high && nums[high] == nums[high-1])high--;
                  low++;
                  high--;
                    }else if(nums[low]+nums[high]>sum){
                        high--;
                    }else{
                        low++;
                    }
                }

            }
        }

        return output_arr;

    }

    public static void main(String[]args){
        int[]nums = {-1,0,1,2,-1,-4};

        System.out.println(threeSum(nums));

    }
}
