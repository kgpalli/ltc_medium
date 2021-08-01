package LeetCode.med1_30;

import java.util.HashMap;

/**
 * Input: nums = [1,2,2,3,1]
 * Output: 2
 * Explanation:
 * The input array has a degree of 2 because both elements 1 and 2 appear twice.
 * Of the subarrays that have the same degree:
 * [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
 * The shortest length is 2. So return 2.
 *
 * Input: nums = {1,2,2,3,1,4,2}
 * Output: 6
 * Explanation:
 * The degree is 3 because the element 2 is repeated 3 times.
 * So [2,2,3,1,4,2] is the shortest subarray, therefore returning 6.
 *
 * */

public class DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer>num_count = new HashMap<>();
        HashMap<Integer,Integer>first_seen = new HashMap<>();
        int degree = 0;
        int min_length = 0;

        for(int i=0;i<nums.length;i++){
            first_seen.putIfAbsent(nums[i],i);
            num_count.put(nums[i], num_count.getOrDefault(nums[i],0)+1);
            if(num_count.get(nums[i])>degree){
                degree = num_count.get(nums[i]);
                min_length = i - first_seen.get(nums[i])+1;
            }else if(num_count.get(nums[i])==degree){
                min_length = Math.min(min_length, i-first_seen.get(nums[i])+1);
            }
        }
        return min_length;
    }

    public static void main (String[]args){

        int [] nums = {2,1};

        System.out.println(findShortestSubArray(nums));

    }
}
