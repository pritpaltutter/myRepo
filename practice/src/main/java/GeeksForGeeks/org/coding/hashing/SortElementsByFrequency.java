package GeeksForGeeks.org.coding.hashing;

import java.util.*;

public class SortElementsByFrequency {

    public static void main(String[] args) {
        SortElementsByFrequency obj = new SortElementsByFrequency();
        int arr[] = {1, 2, 3, 4, 1, 3, 1, 2, 1, 1, 6, 8, 9, 3, 2, 1};
        obj.sortByFrequency(arr);

    }

    private void sortByFrequency(int[] arr) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (Integer ele : arr) {
            Integer count = frequencyMap.get(ele);
            if (count != null) {
                count++;
                frequencyMap.put(ele, count);
            } else {
                frequencyMap.put(ele, 1);
            }
        }
        // Map is ready

        Map<Integer, List<Integer>> sortedFrequencyMap = new TreeMap<>(Collections.reverseOrder());

        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {


            List<Integer> tempList = sortedFrequencyMap.get(entry.getValue());
            if (tempList == null) {
                tempList = new ArrayList();
            }
            tempList.add(entry.getKey());

            sortedFrequencyMap.put(entry.getValue(), tempList);

        }


        // Sort all the lists
        for (Map.Entry<Integer, List<Integer>> entry : sortedFrequencyMap.entrySet()) {
            Collections.sort(entry.getValue());
        }

        //Print the list

        for (Map.Entry<Integer, List<Integer>> entry : sortedFrequencyMap.entrySet()) {
            for (int j = 0; j < entry.getValue().size(); j++) {
                for (int i = 0; i < entry.getKey(); i++) {
                    System.out.print(entry.getValue().get(j) + ",");

                }
            }
        }
    }
}
