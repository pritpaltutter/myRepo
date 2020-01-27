package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args)
            throws Exception
    {

        List<String> arr1
                = new ArrayList<String>();
        arr1.add("Geeks");
        arr1.add("For");
        arr1.add("Geeks");

        arr1
                .parallelStream()
                .forEach(
                        s -> {
                            System.out.print(s);
                        });

        System.out.println();
        arr1
                .stream()
                .forEach(
                        s -> {
                            System.out.print(s);
                        });
    }
}
