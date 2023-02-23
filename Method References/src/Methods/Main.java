package Methods;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DuckHelper duckT = new DuckHelper();


        Collection<String> list = new ArrayList<>();

        System.out.println(list.add("Sparrow"));

        Collection<String> set = new HashSet<>();
        System.out.println(set.add("Sparrow"));
        System.out.println(set.add("Sparrow"));

        Collection<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add("Hawk");
        birds.add("Hawk");

        for (String bird: birds){
            //birds.remove(bird);d
        }
        Collection<String> birds1 = new HashSet<>();
        Collection<String> cats = Arrays.asList("Riley","Stan");
        cats.forEach(System.out::println);
        cats.forEach(c-> System.out.println(c));

        for (String cat : cats) {

        }

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            String string = iter.next();
            System.out.println(string);
        }

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        boolean b1 = set2.add(6);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(8);
        queue.offer(10);







    }


}
