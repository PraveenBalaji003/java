package entity;

public class Person {
    // default
    String name;// accessible only for the same package
    // public - accessible for same package and other packages also
    public int age;
    // protected - accessible within same-package. If comes to other package only accessible for sub class. 
    protected String gender;
    //private - only accessible within the same class
    private double income;

}
