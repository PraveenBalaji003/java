package constructor;

public class Calculator {
    int a;
    int b;
    // default constructor
    // Whether we declare the constuctor explicitly or not, for every time during object creation default constructor will be called
    public Calculator(){

    }
    // parameterized constructor
    public Calculator(int a, int b){
        this.a = a;
        this.b = b;
    }
    public int addTwoNumbers(){
        return a+b;
    }
}
