package LeetCode.med1_30;

import org.omg.CORBA.INTERNAL;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Example 1:
 *
 * Input: s = "leetcode"
 * Output: 0
 * Example 2:
 *
 * Input: s = "loveleetcode"
 * Output: 2
 * Example 3:
 *
 * Input: s = "aabb"
 * Output: -1
 *
 *
 * */

public class FirstUniqChar {

    public static int firstUniqChar(String s) {

       /* Map<Character,Integer>map = new LinkedHashMap<>();

        for(int i=0;i<s.length();i++){
           if(map.containsKey(s.charAt(i))){
               map.put(s.charAt(i),map.get(s.charAt(i))+1);}
               else{
                   map.put(s.charAt(i),1);
               }
           }

        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            int charCount=entry.getValue();
            if(charCount==1){
                char ch=entry.getKey();
                return s.indexOf(ch);
            }
        }
        return -1;*/


        Map<Character,Integer>map = new HashMap<>();
         int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int i=0;i<n;i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[]args){

        String s = "leetcode";

        System.out.println(firstUniqChar(s));

    }
}
