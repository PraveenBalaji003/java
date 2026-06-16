class Anonymous{
    public void print(){
        System.out.println("Print...");
    }
}

public class Main {
    public static void main(String[] args){
        //Anonymous Object
        //Anonymous object does not have the reference(reference variable in stack). So, we can't re-use it
        new Anonymous().print();
    }
}
