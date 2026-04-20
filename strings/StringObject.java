public class StringObject {
    public static void main(String[] args){
        // 📌 Both go to Heap - new object created every time
        // Even though value is same, address is different
        String object1 = new String("pravin");
        String object2 = new String("pravin");

        System.out.println("======= OBJECT vs OBJECT =======");
        System.out.println("object1 == object2:      " + (object1 == object2));// false ❌ different heap objects
        System.out.println("object1.equals(object2): " + object1.equals(object2));// true ✅ same value
    }
}
