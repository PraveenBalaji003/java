class Student {
 String name;
 int age;
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name="Praveen";
        s1.age=26; 
        Student s2 = new Student();
        s2.name="Prabha";
        s2.age=25; 
        Student s3 = new Student();
        s3.name="Santhosh";
        s3.age=26;
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s2;
        for(Student student:students){
            System.out.println("Name: "+student.name+"\nAge: "+student.age);
            System.out.println();
        }
    }    
}
