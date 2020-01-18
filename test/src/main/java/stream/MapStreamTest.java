package stream;

import java.util.*;
import java.util.stream.Collectors;

public class MapStreamTest {

    public static void main(String[] args) {
        Map<String,String> testMap = new HashMap<String,String>();
        testMap.put("1","ABC");
        testMap.put("2","XYZ");
        testMap.put("3","BCD");
        testMap.put("4","WUV");
        Set<Map.Entry<String, String>> entrySet = testMap.entrySet();
        List<String> tempList = entrySet.stream().map(y->y.getValue()).collect(Collectors.toList());

         Iterator it = tempList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        Optional opt = testMap.entrySet().stream().filter(y->y.getValue().equals("ABC")).map(Map.Entry::getKey).findFirst();
        System.out.println(opt.get());
    }
}
