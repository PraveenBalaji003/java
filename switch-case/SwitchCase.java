public class SwitchCase{
    public static void main(String[] args){
        int day = 1;
        // Switch case checks the value of 'day' and matches it with a case
        // Syntax: switch(variable) { case value: statement; break; }
        switch(day){
            case 1:
                System.out.println("Monday");
                break;// break stops execution — without this, it will
                     // fall through and execute ALL remaining cases
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("Wednesday");
                break;   
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break; 
            case 7:
                System.out.println("Sunday");
                break;  
        }
    }
}