package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterWords {

    public static void main(String[] args) {
        List<String> stateNameList = Arrays.asList("Bangalore", "Jabalpur", "Bidar", "Bhopal","Bangalore","Bhopal","TataNagar");
        stateNameList.stream().filter(s ->
                s.startsWith("B")
        ).forEach(y -> System.out.println(y));

        System.out.println();

        stateNameList.stream().distinct().forEach(y-> System.out.print(y+","));

        List<String> filterList = stateNameList.stream().map(x->testfunc(x)).filter(x->x.startsWith("B")).collect(Collectors.toList());
        System.out.println();
        System.out.println("Filter list");
        Iterator it = filterList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
    public static String testfunc(String a){
        System.out.println("Inside test function");
        return a.toUpperCase();
    }
}
