package Methods;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Binary {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(6,9,1,8);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
