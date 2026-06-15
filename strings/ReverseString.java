public class ReverseString {

    public String reverse(String str){
        String reversed = "";
        for(int i=str.length()-1;i>=0;i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
    public static void main(String[] args){
        String str = "INOHD";
        System.out.println("Original String: " + str);
        ReverseString obj = new ReverseString();
        String reversedStr = obj.reverse(str);
        System.out.println("Reversed String: " + reversedStr);
    }   
    
}
