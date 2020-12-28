package GeeksForGeeks.org.coding.hashing;

import org.apache.commons.collections.bidimap.TreeBidiMap;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class RelativeSorting {

    public static void main(String[] args) {

        int[] arr1 = {2,5,6,7,3,1,2,3,9,8};
        int[] arr2 = {3,1,9,};

       new RelativeSorting().performRelativeSorting(arr1,arr2);
    }

    private void performRelativeSorting(int[] arr1, int[] arr2){
        Map<Integer, Integer> tempMap = new TreeMap();
        for (Integer ele:arr1) {
            Integer count = tempMap.get(ele);
            if(count == null){
                tempMap.put(ele,1);
            }else {
                count++;
                tempMap.put(ele, count);
            }
        }
        for (Integer ele:arr2) {
            Integer count = tempMap.get(ele);

            for (int i=0;i<count;i++) {
                System.out.print(ele + ",");
            }
            tempMap.put(ele,0);
        }
        for (Map.Entry<Integer,Integer> ele:tempMap.entrySet()) {
            if(ele.getValue() != 0){
                System.out.print(ele.getKey()+",");
            }
        }


    }

}
