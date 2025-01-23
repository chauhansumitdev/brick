package Person;

public class Person {

    private String city;
    private String name;

    public Person(String name, String city){
        this.name = name;
        this.city = city;
    }

    public String get_name(){
        return name;
    }

    public void set_name(String name){
        this.name = name;
    }

    public void set_city(String city){
        this.city = city;
    }

    public String get_city(){
        return city;
    }
    
}