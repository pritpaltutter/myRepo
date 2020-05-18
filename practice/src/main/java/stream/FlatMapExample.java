package stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapExample {

    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(1,2,34,45);
        List<Integer> lst2 = Arrays.asList(11,12,134,145);
        List<Integer> lst3 = Arrays.asList(21,32,434,545);

        List<List<Integer>> lst4 = Arrays.asList(lst,lst2,lst3);

        System.out.println(lst4);
String a = null;
char [] arr = a.toCharArray();int a1 = arr.length;


        lst4.stream().flatMap(list-> Stream.of(list.stream().reduce((x, y)->x+y))).forEach(System.out::print);
    }
}
