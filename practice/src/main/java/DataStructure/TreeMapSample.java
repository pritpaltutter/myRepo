package DataStructure;

import java.util.TreeMap;

public class TreeMapSample {


    public static void main(String[] args) {
        TreeMap<Double,String> treeMap= new TreeMap<Double,String>();
        treeMap.put(1.1,"Sameer");
        treeMap.put(1.5,"Sameer");
        Double key = treeMap.ceilingKey((double) 1.2);
        System.out.println(key);
    }
}
