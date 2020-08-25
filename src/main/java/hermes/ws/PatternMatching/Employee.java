package hermes.ws.PatternMatching;

public class Employee {

    private int id;
    private String name;

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
