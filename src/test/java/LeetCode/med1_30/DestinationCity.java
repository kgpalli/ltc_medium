package LeetCode.med1_30;
/**
 * Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
 * Output: "Sao Paulo"
 * Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city.
 * Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".
 *
 * Input: paths = [["B","C"],["D","B"],["C","A"]]
 * Output: "A"
 * Explanation: All possible trips are:
 * "D" -> "B" -> "C" -> "A".
 * "B" -> "C" -> "A".
 * "C" -> "A".
 * "A".
 * Clearly the destination city is "A".
 * */
import java.util.*;

public class DestinationCity {

    public static String destCity(List<List<String>> paths) {
        Set<String> set = new HashSet<>();

         for(List<String>p : paths)set.add(p.get(1));
         for(List<String>p:paths) {
             System.out.println("Value to remove " + p.get(0));
             set.remove(p.get(0));
         }

         return set.iterator().next();
    }


    public static void main(String[]args){
        List<List<String>> paths = new ArrayList<>();
        paths.add(Arrays.asList("London", "New York"));
        paths.add(Arrays.asList("New York","Lima"));
        paths.add(Arrays.asList("Lima","Sao Paulo"));
        System.out.println(destCity(paths));

    }
}
