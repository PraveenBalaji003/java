class Mobile{
    static String brand;
}

class Sony{
    public void printBrand(){
        Mobile.brand = "Sony";
        System.out.println("Brand Name: "+ Mobile.brand);
    }
}

class X{
    public void printBrand(){
        System.out.println("Brand Name: "+ Mobile.brand);
    }
}

public class StaticVariables {
    public static void main(String[] args){
        //Static variables values will be shared across the objects
        Sony obj1 = new Sony();
        obj1.printBrand();
        X obj2 = new X();
        obj2.printBrand();
    }
}
