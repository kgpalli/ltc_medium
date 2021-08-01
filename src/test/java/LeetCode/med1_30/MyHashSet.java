package LeetCode.med1_30;

import java.util.HashSet;

public class MyHashSet {

    /** Initialize your data structure here. */
    HashSet<Integer>set;
    public MyHashSet() {
        this.set = new HashSet<>();
    }

    public void add(int key) {
      this.set.add(key);
    }

    public void remove(int key) {
       this.set.remove(key);
    }

    /** Returns true if this set contains the specified element */
    public boolean contains(int key) {
     return set.contains(key);
    }

    public static void main(String[]args){
        MyHashSet newSet = new MyHashSet();
        newSet.add(100);
        newSet.add(400);
        newSet.add(600);
        newSet.add(800);

        System.out.println(newSet.set);

        System.out.println(newSet.contains(400));
        System.out.println(newSet.contains(800));

        newSet.remove(400);

        System.out.println(newSet.contains(400));

        System.out.println();

        System.out.println(newSet.set);

    }
}
