package DataStructure;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;

    Employee(){

    }
    Employee(int Id, String name){
        this.id  = Id;
        this.name = name;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.id+" : "+this.name;
    }


    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    @Override
    public boolean equals(Object obj) {

        Employee emp = (Employee)  obj;

        if (emp.id == this.id){
            return true;
        }else{
            return false;
        }
    }
}
