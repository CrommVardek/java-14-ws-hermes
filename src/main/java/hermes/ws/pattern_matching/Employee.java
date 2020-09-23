package hermes.ws.pattern_matching;

public class Employee {

    private Long id;
    private String name;

    public Employee(Long id, String name){
        this.id = id;
        this.name = name;
    }

    //Before
    public boolean equalsBefore(Object o){
        if(o instanceof Employee){
            Employee e = (Employee) o;
            return this.id == e.id;
        }
        return false;
    }

    //New way of equal
    @Override
    public boolean equals(Object o){
        return o instanceof Employee e && this.id == e.id;
    }

}
