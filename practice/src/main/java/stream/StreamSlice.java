package stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSlice {
    public static void main(String[] args) {
        Stream st = Stream.of(1,2,3,4,5);
       List lt = (List) st.limit(2).collect(Collectors.toList());
        System.out.println(lt);
    }
}
