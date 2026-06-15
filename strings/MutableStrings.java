public class MutableStrings {
    public static void main(String[] args) {
        // String Buffer and String Builder both are mutable strings.
        // String Buffer is thread-safe, but String Builder is not. We can look into this later.
        // String Buffer will give you a buffer size of 16-bytes
        StringBuffer sb = new StringBuffer();
        System.out.println("String Buffer Default Capacity: "+sb.capacity()); 
        System.out.println("After Concatenation..."); 
        sb.append("praveen balaji java developer");
        System.out.println("String Buffer Capacity: "+sb.capacity()); 
    }
}
