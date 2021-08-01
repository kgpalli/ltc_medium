package LeetCode.med1_30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
/**
 * Example 1:
 *
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 *
 * Input: nums = [1,1]
 * Output: [2]
 * */

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer>missingNumbers = new ArrayList<Integer>();
        HashSet<Integer>set = new HashSet<>();
        for(int i: nums){
            set.add(i);
        }

        for(int i=1;i<=nums.length;i++){
            if(!set.contains(i)){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;

    }




    public static void main(String[]args){

        int[]nums = {4,3,2,7,8,2,3,1};

        System.out.println(findDisappearedNumbers(nums));

    }
}
