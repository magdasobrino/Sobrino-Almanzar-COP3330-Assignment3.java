package ex46;
import java.util.Comparator;
import java.util.*;

public class text implements Comparator {
    public int compare(Object o1, Object o2) {


        Map<String, Integer> map1 = (Map<String, Integer>) o1;
        int counter1 = (int) map1.values().toArray()[0];

        Map<String, Integer> map2 = (Map<String, Integer>) o2;
        int counter2 = (int) map2.values().toArray()[0];

        return counter2 - counter1;
    }
}


