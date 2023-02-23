package Methods;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Mono{

    public static void main(String[] args) {
        Map<String, String> map5 = new HashMap<>();
        Map<String, String> map2 = new TreeMap<>();

        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        Integer food = map.get("one");

        for (String key: map.keySet()){
            System.out.println(key + ",");
        }

    }



}
