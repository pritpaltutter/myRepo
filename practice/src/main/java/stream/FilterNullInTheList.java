package stream;

import org.apache.commons.lang3.StringUtils;

import java.util.*;

public class FilterNullInTheList {

    public static void main(String[] args) {
        List<String> lst = Arrays.asList("Delhi","Mumbai",null,"Jabalpur","Agra","Bangalore","Kerla","Hyderabad");

        Optional.ofNullable(lst).orElseGet(Collections::emptyList).stream().
                filter(x-> StringUtils.isNotEmpty(x)).forEach(x-> System.out.println(x));



    }
}
