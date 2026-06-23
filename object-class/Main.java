/* Object- Class
By the default every class will extends the Object class.
So, Object class would be the super class for all the classes.
*/

class Car {
    String name;
    String colour;
    int price;

   // Override the toString(), hashCode() & equals() method in the Object Class 
    @Override
    public String toString() {
        return "Car [name=" + name + ", colour=" + colour + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((colour == null) ? 0 : colour.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Car other = (Car) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (colour == null) {
            if (other.colour != null)
                return false;
        } else if (!colour.equals(other.colour))
            return false;
        if (price != other.price)
            return false;
        return true;
    }


}
public class Main {
    public static void main(String[] args){
        Car obj1 = new Car();
        obj1.name = "Swift";
        obj1.colour = "red";
        obj1.price = 2_00_000;
        Car obj2 = new Car();
        obj2.name = "Swift";
        obj2.colour = "red";
        obj2.price = 2_00_000;
        System.out.println(obj1.equals(obj2));
    }
    
}
