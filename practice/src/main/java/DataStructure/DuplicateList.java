package DataStructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/*
Remove duplicate elements from the list
 */
public class DuplicateList {

    private static List<Employee> employeeList;
    static {
        employeeList = new ArrayList<>();

        employeeList.add( new Employee(1,"Rohit"));

        employeeList.add( new Employee(2,"Kohal"));

        employeeList.add( new Employee(3,"Mohal"));

        employeeList.add( new Employee(4,"Karomal"));

        employeeList.add( new Employee(5,"Jpomal"));

        employeeList.add( new Employee(6,"gomal"));

        employeeList.add( new Employee(1,"Rohit"));

    }
    public static void main(String[] args) {

        printList(employeeList.iterator());

        List distinctEmployeeList = employeeList.stream().distinct().collect(Collectors.toList());

        printList(distinctEmployeeList.iterator());

    }

    private static void printList(Iterator it) {
        System.out.println();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

}
