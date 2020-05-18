package Anagram;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerRankAnagram {



    public static List<Integer> getMinimumDifference(List<String> a, List<String>b){



        List<Integer> countList = new ArrayList<>();

        String str1 = null;
        String str2 = null;
        for(int i = 0; i<a.size(); i++){
           str1 = a.get(i);
           str2 = b.get(i);

           int count = 0;
            int char_count[] = new int[26];
            for (int j = 0; j < str1.length(); j++) {
                char_count[str1.charAt(j) - 'a']++;
            }
            for (int j = 0; j < str2.length(); j++) {
                if (char_count[str2.charAt(j) - 'a']-- <= 0)
                    count++;
            }
            System.out.println(count);
            countList.add(count);
        }
        return countList;
    }
    public static void main(String[] args) {
       List<String> a = Arrays.asList("hhpddlnnsjfoyxpci","xulkowreuowzxgnhmiqekxhz","dnqaurlp");
        List<String>b = Arrays.asList("ioigvjqzfbpllssuj","istdocbnyozmnqthhpievvlj","lofnrtmh");

        //List<String> a = Arrays.asList("xulkowreuowzxgnhmiqekxhz");
        //List<String>b = Arrays.asList("istdocbnyozmnqthhpievvlj");
        System.out.println( getMinimumDifference(a,b));
    }
}
