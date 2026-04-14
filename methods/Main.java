public class Main {

    // .replaceAll("\\s+", "")	Removes all whitespace
    //  .replaceAll("\\d", "")	Removes all digits
    public String formatString(String str){
        return str.replaceAll("\\s+", "");
    }

    // .toLowerCase() - Change all the characters to Lower Case
    // .toUpperCase() - Change all the characters to Upper Case
    public String convertToLowerCase(String str){
        return str.toLowerCase();
    }

    public static void main(String[] args){
        Main obj = new Main();
        String result = obj.formatString("Hello World");
        System.out.println(obj.convertToLowerCase(result));
    }
}
