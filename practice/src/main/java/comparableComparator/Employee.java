package comparableComparator;

import java.util.Objects;

public class Employee implements Comparable<Employee>{

    int id;
    String name;
    String address;


    Employee( int id,
            String name,
            String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(name, employee.name) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, address);
    }

    @Override
    public int compareTo(Employee emp) {

        if (this.id == emp.id){
            return 0;
        }
        else if (this.id < emp.id)
        {
            return -1;
        }
        else{
            return 1;
        }

    }

    @Override
    public String toString() {
        return "Id : "+id+": Name : "+name;
    }
}
