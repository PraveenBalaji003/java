package encapsulation;


// Encapsulation: Hiding instance variables by declaring them private,
// and providing controlled access through public getter and setter methods.
// This prevents unauthorized direct access.
public class Encapsulation {
    public static void main(String[] args){
        Human obj = new Human();
        obj.setName("PraveenBalaji");
        obj.setAge(27);
        System.out.println("Name: "+obj.getName()+"\nAge: "+obj.getAge());
    }
}
