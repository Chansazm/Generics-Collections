package Methods;

import java.util.HashMap;

public class MyComparator extends Comparator<S> {
    public int compare(String a, String b){
        return b.toLowerCase().compareTo(a.toLowerCase());
    }

    public static void main(String[] args) {
        var map = new HashMap<Integer, Integer>(10);
        for (int i = 0; i < 10; i++) {
            map.put(i, i*i);


        }
        System.out.println(map.get(4));
    }
}
