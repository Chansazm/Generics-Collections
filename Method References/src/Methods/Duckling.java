package Methods;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Duckling {
    String name;
    int id;

    public Duckling(String puddles) {
    }

    public static void makeSound(String sound){
        //LearnToSpeak learner = s -> System.out.println(s);
        LearnToSpeak learner = System.out::println;
        DuckHelper.teacher(sound,learner);

        Consumer<List<Integer>> methodRef = Collections::sort;
        Consumer<List<Integer>> lambda = x -> Collections.sort(x);

        var random = new Random();
        Supplier<Integer> methodRef1 = random::nextInt;
        Supplier<Integer> lambda2 = () -> random.nextInt();

        Predicate<String> methodRef3 = String::isEmpty;
        Predicate<String> lambda3 = s -> s.isEmpty();

    }
}
