package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenIntegers {

    public static void main(String[] args) {
        List<String> lst = Arrays.asList("1","3","2","5","6","7","9","10");
        lst.stream().map(x->Integer.parseInt(x)).filter(x-> x%2 ==0).
                collect(Collectors.toList()).stream().forEach(x-> System.out.print(x));
    }
}
