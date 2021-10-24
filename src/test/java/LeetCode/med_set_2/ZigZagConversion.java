package LeetCode.med_set_2;

/**
 *
 * 6. ZigZag Conversion
 * Example 1:
 *
 * Input: s = "PAYPALISHIRING", numRows = 3
 * Output: "PAHNAPLSIIGYIR"
 * Example 2:
 *
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 * P     I    N
 * A   L S  I G
 * Y A   H R
 * P     I
 * Example 3:
 *
 * Input: s = "A", numRows = 1
 * Output: "A"
 * */

import java.util.HashMap;
import java.util.Map;

public class ZigZagConversion {

    public static String convert(String s, int numRows) {
        Map<Integer,StringBuilder>map = new HashMap<>();
      StringBuilder sb = new StringBuilder();
      int pos=0;
      boolean dir=true;

      for(char ch : s.toCharArray()){
          if(pos==numRows) dir=false;
          if(pos==1)dir=true;
          if(dir){
              pos++;
          }else{
              pos--;
          }

          if(!map.containsKey(pos)){
              map.put(pos,new StringBuilder());

          }
          map.get(pos).append(ch);
      }

      for(int i: map.keySet()){
          sb.append(map.get(i));
      }
      return sb.toString();

    }


    public static void main(String[]args){

        String s = "PAYPALISHIRING";
        int rows=3;

        System.out.println(convert(s,rows));

    }
}
