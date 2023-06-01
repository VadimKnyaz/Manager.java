package Edu.javacourse;

import java.util.Objects;

public class MyClass {

    private Long id;
    private String name;

    public MyClass(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MyClass)) return false;
        MyClass myClass = (MyClass) o;
        return Objects.equals(id, myClass.id) && Objects.equals(name, myClass.name);
    }

    @Override
    public int hashCode() {
        System.out.println("Equals is called:" + this + ":");
        return id.intValue();
    }
    @Override
    public String toString(){
        return "MyClass{"+
                "id="+id+
                ",name'"+name+'\''+
                '}';

    }
}
