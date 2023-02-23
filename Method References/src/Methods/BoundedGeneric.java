package Methods;

import java.util.*;

public class BoundedGeneric {
    public static void main(String[] args) {
        List<?> list = new ArrayList<String>();
        ArrayList<? extends Number> list2 = new ArrayList<Integer>();
        var numbers = new HashSet<Number>();
        numbers.add(Integer.valueOf(86));
        numbers.add(75);
        numbers.add(Integer.valueOf(86));
        numbers.add(null);
        numbers.add(309L);
        Iterator iter = numbers.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }

        Map<String, Double> map = new HashMap<>();
        //map.add("pi", 3.14159);
        map.put("pi", 3.14159);

    }

}
