package encapsulation;

public class Human {
    private String name;
    private int age;

    //this is the keyword which represents the current object
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
