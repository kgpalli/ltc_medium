package LeetCode.med1_30;
/*
11. Container With Most Water
* Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2
* */

import sun.lwawt.macosx.CSystemTray;

public class ContainerWithMostWater {

    public static int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
       /* for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int min = Math.min(height[i],height[j]);
                max = Math.max(max,min * (j-i));
            }
        }*/

        int i=0;
        int j=height.length-1;

        while(i<j){
            int min = Math.min(height[i],height[j]);
            max = Math.max(max,min * (j-i));
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }

        }
        return max;



    }
    public static void main(String[]args){
        int[]height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
}
