package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringListToIntegerList {


    public static void main(String[] args) {
        List<String> lst = Arrays.asList("1","2","3");
        List<Integer> lstInt = lst.stream().map(x-> Integer.parseInt(x)).collect(Collectors.<Integer>toList());
        lstInt.stream().forEach(s-> System.out.print(s));
    }
}
