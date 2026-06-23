public class Main {
    public static void main(String[] args){
        //Wrapper Class For- r every primitive-type we have the wrapper class
        //i.e.,Integer, Double, Character, Boolean, etc..
        int num1 = 1;
        //Boxing - Taking a value primitive type and storing in wrapper class object
        Integer num2 = num1; //Auto Boxing
        System.out.println("Auto Boxing:"+num2);
        Double num3 = 9.0;
        double num4 = num3.doubleValue(); //Un-Boxing
        System.out.println("Un-Boxing:"+num4);
        double num5 = num3;//Auto Un-Boxing
          System.out.println("Auto UnBoxing:"+num5);
        String value = "12";
        int result = Integer.parseInt(value)*12;//covert string to integer
        System.out.println("Result:"+result);
    }
    
}
