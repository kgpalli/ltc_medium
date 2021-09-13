package LeetCode.med1_30;
/*
34. Find First and Last Position of Element in Sorted Array
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
* */

import org.testng.reporters.jq.INavigatorPanel;

import java.util.*;

public class IntSearchRange {

    public static int[] searchRange(int[] nums, int target) {
       /* int min = Integer.MAX_VALUE;
        int max=0;
        int[]arr = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i]) && nums[i]==target){
            min = Math.min(min,map.get(nums[i]));
                max = Math.max(max,i);
            }
            map.put(nums[i],i);
        }
         arr[0] = min== Integer.MAX_VALUE?-1:min;
         arr[1]=max==0?-1:max;


        return arr;*/
        // Online solution
        int[]result = new int[2];
        result[0] = findStartingIndex(nums,target);
        result[1]=  findEndingIndex(nums,target);

        return result;


    }
    public static int findStartingIndex(int[]nums,int target){
        int index=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid_point = start+(end-start)/2;
            if(nums[mid_point]>=target){
                end=mid_point-1;
            }else{
                start=mid_point+1;
            }
            if(nums[mid_point]==target)index=mid_point;


        }
        return index;
    }

    public static int findEndingIndex(int[]nums,int target){
        int index=-1;

        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid_point = start+(end-start)/2;


            if(nums[mid_point]<=target){
                start=mid_point+1;
            }else{
                end=mid_point-1;
            }
            if(nums[mid_point]==target) index=mid_point;

        }
        return index;

    }

    public static void main(String[]args){

  int[]nums = {1,2,3,3,4,5,6,7};
  int target=3;


      System.out.println(Arrays.toString(searchRange(nums,target)));


    }
}
