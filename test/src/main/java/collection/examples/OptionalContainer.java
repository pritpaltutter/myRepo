package collection.examples;

import java.util.Optional;

public class OptionalContainer {

    public static void main(String[] args) {
        Optional<Integer> optional = Optional.of(new Integer(2));
        System.out.println(optional.filter(x->x == 2).map(Integer::byteValue).get());
    }
}
