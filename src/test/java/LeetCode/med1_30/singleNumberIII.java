package LeetCode.med1_30;

import java.util.*;

/**
 * 260. Single Number III
 * Example 1:
 *
 * Input: nums = [1,2,1,3,2,5]
 * Output: [3,5]
 * Explanation:  [5, 3] is also a valid answer.
 * Example 2:
 *
 * Input: nums = [-1,0]
 * Output: [-1,0]
 * Example 3:
 *
 * Input: nums = [0,1]
 * Output: [1,0]
 *
 *
 * */

public class singleNumberIII {
    public static int[] singleNumber(int[] nums) {
        int[]single_number = new int[2];
      HashMap<Integer,Integer>map = new HashMap<>();
      int j=0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
            if(entry.getValue()==1){
                single_number[j]=entry.getKey();
                j++;
            }

        }
        return single_number;

    }


    public static void main(String[]args){

        int[]nums = {1,2,1,3,2,5};
      System.out.println(Arrays.toString(singleNumber(nums)));

    }

}
