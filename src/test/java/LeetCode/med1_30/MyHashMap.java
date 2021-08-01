package LeetCode.med1_30;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    HashMap<Integer,Integer> map;

    /** Initialize your data structure here. */
    public MyHashMap() {
        map = new HashMap<>();
    }

    /** value will always be non-negative. */
    public void put(int key, int value) {
        map.put(key,value) ;

    }

    /** Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key */
    public int get(int key) {
        return map.get(key);

    }

    /** Removes the mapping of the specified value key if this map contains a mapping for the key */
    public void remove(int key) {
       map.remove(key);
    }



    public static void main(String[]args){

        MyHashMap newMap = new MyHashMap();
        newMap.put(1,10);
        newMap.put(2,20);
        newMap.put(3,30);


        for(Map.Entry<Integer,Integer> entry : newMap.map.entrySet()){
            System.out.println("Values after constructing a map");
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        System.out.println("Values added in Map " + newMap.toString());
        System.out.println("Value at index second : " + newMap.get(2));

        newMap.remove(3);


        for(Map.Entry<Integer,Integer> entry : newMap.map.entrySet()){
            System.out.println("after removing a  value from map");
            System.out.println(entry.getKey() + entry.getValue());
        }


    }
}
