package comparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMgr {
    public static List<Employee> empList = new ArrayList<Employee>();
    public static void main(String[] args) {


        empList.add(new Employee(1,"Suresh","Zomanji"));
        empList.add(new Employee(2,"duresh","Zomanji"));
        empList.add(new Employee(13,"euresh","Zomanji"));
        empList.add(new Employee(16,"ruresh","Zomanji"));
        empList.add(new Employee(23,"turesh","Zomanji"));
        empList.add(new Employee(11,"yuresh","Zomanji"));
        empList.add(new Employee(10,"huresh","Zomanji"));
        empList.add(new Employee(18,"furesh","Zomanji"));

        Collections.sort(empList);
        for (Employee emp:
             empList) {
            System.out.println(emp);
        }


    }
}
