public class IfElse{
    public static void main(String[] args){
        int x = 10;
        int y = 20;
        int z = 30;
        
        System.out.println("Print Largest Number");

       // ConditionMeaning
       // x > y && x > z - x is largest only if it beats both y and z
       // y > z if x isn't largest - y is largest only if it beats z
       //elseif neither above is true - z must be the largest
       
       if(x>y && x>z){
            System.out.println(x);
        }else if(y>z){
            System.out.println(y);
        }else{
            System.out.println(z);
        }
    }
}