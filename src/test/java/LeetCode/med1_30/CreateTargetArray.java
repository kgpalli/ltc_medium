package LeetCode.med1_30;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateTargetArray {

    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>target = new ArrayList<>();
          int[]targetArray = new int[nums.length];
          for(int i=0;i<nums.length;i++){
              target.add(index[i],nums[i]);
          }
            int c =0;
          for( Integer i : target){
              targetArray[c] = i;
              c++;
          }
          return targetArray;
    }

    public static void main(String[]args){
        int[]nums = {0,1,2,3,4};
        int[]index = {0,1,2,2,1};

        System.out.println(Arrays.toString(createTargetArray(nums,index)));



    }
}
