package collection.examples;

import java.util.Objects;

public class Emp {

    Integer id;

    Emp(Integer id){
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id.equals(emp.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
