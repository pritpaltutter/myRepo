package collection.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.collections.CollectionUtils;

public class CollectionUtil {

    public static void main(String[] args) {


        List<Integer> lista  = new ArrayList<Integer>();
        lista.add(1);
        lista.add(11);
        lista.add(12);
        lista.add(13);

        System.out.println(CollectionUtils.isEmpty(lista));
        List<Integer> listaa  = new ArrayList<Integer>();
        System.out.println(CollectionUtils.isEmpty(listaa));


//        lista.add(new Emp(10));
//        lista.add(new Emp(1));
//        lista.add(new Emp(10));
//        lista.add(new Emp(2));
//        lista.add(new Emp(5));
//        lista.add(new Emp(10));
//        lista.add(new Emp(19));
//        lista.add(new Emp(18));
//        lista.add(new Emp(16));
//        lista.add(new Emp(12));
//        lista.add(new Emp(9));


        List<Integer> listb  = new ArrayList<Integer>();

        listb.add(1);
        listb.add(11);
        listb.add(12);
//        listb.add(new Emp(10));
//        listb.add(new Emp(11));
//        listb.add(new Emp(1));
//        listb.add(new Emp(23));
//        listb.add(new Emp(21));
//        listb.add(new Emp(52));
//        listb.add(new Emp(20));
//        listb.add(new Emp(69));






        List<Integer> unionList = (List<Integer>) CollectionUtils.union(lista,listb);
        List<Integer> intersectionList = (List<Integer>) CollectionUtils.union(lista,listb);

        List<Integer> disjunctionList = (List<Integer>) CollectionUtils.disjunction(lista,listb);


        printIntegerList(unionList);
        printIntegerList(intersectionList);
        printIntegerList(disjunctionList);

    }


    private static void printIntegerList(List<Integer> unionList) {
        Iterator<Integer> it = unionList.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ,");
        }
        System.out.println();
        System.out.println("Size: "+unionList.size());
    }


    private static void printList(List<Emp> unionList) {
        Iterator<Emp> it = unionList.iterator();
        while (it.hasNext()){
            System.out.print((it.next()).id+" ,");
        }
        System.out.println();
        System.out.println("Size: "+unionList.size());
    }
}
