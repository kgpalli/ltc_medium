package LeetCode.med1_30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 4. Median of Two Sorted Arrays
 * Note : Median is middile number for ODD length array, average of 2 middile elements for EVEN length array
 *
 * Solution:
 * Take minimum size of two array. Possible number of partitions are from 0 to m in m size array.
 * Try every cut in binary search way. When you cut first array at i then you cut second array at (m + n + 1)/2 - i
 * Now try to find the i where a[i-1] <= b[j] and b[j-1] <= a[i]. So this i is partition around which lies the median.
 *
 * Time complexity is O(log(min(x,y))
 * Space complexity is O(1) q
 * Example 1:
 *
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 *
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * Example 3:
 *
 * Input: nums1 = [0,0], nums2 = [0,0]
 * Output: 0.00000
 * Example 4:
 *
 * Input: nums1 = [], nums2 = [1]
 * Output: 1.00000
 * Example 5:
 *
 * Input: nums1 = [2], nums2 = []
 * Output: 2.00000
 * */

public class FindMedianSortedArrays {

    public  double findMedianSortedArrays(int[] nums1, int[] nums2) {

       if(nums1.length>nums2.length){
           return findMedianSortedArrays(nums2,nums1);
       }
       int x = nums1.length;
       int y = nums2.length;

       int low=0;
       int high = x;
       while (low<=high){
           int partitionX=(low+high)/2;
           int partitionY = (x+y+1)/2-partitionX;

           //if partitionX is 0 it means nothing is there on left side. Use -INF for maxLeftX
           //if partitionX is length of input then there is nothing on right side. Use +INF for minRightX
           int maxLeftX = (partitionX==0)?Integer.MIN_VALUE : nums1[partitionX-1];
           int minRightX = (partitionX==x)?Integer.MAX_VALUE:nums1[partitionX];

           int maxLeftY = (partitionY==0)?Integer.MIN_VALUE : nums2[partitionY-1];
           int minRightY = (partitionY==y)?Integer.MAX_VALUE:nums2[partitionY];

           if(maxLeftX<minRightY && maxLeftY<minRightX){
               //We have partitioned array at correct place
               // Now get max of left elements and min of right elements to get the median in case of even length combined array size
               // or get max of left for odd length combined array size.

               if ((x + y) % 2 == 0) {
                   return ((double)Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY))/2;
               } else {
                   return (double)Math.max(maxLeftX, maxLeftY);
               }
           }else if (maxLeftX > minRightY) { //we are too far on right side for partitionX. Go on left side.
               high = partitionX - 1;
           } else { //we are too far on left side for partitionX. Go on right side.
               low = partitionX + 1;
           }

       }

        //Only we we can come here is if input arrays were not sorted. Throw in that scenario.
        throw new IllegalArgumentException();
    }

    public static void main(String[]args){
       int[] nums1 = {0,0};
       int[] nums2 = {0,0};

        FindMedianSortedArrays fms = new FindMedianSortedArrays();
        System.out.println(fms.findMedianSortedArrays(nums1,nums2));


    }

}
