package stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestStream {

    public static void main(String args[]){
        List<Integer> arrayList = Arrays.asList(1,2,3,4,5,6);
        List square = arrayList.stream().map(x->x*x).collect(Collectors.toList());
        Iterator it = square.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println();
        arrayList.stream().map(y->y*y).forEach(y-> System.out.print(y));

    }
}
