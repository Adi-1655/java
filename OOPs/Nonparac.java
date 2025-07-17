package OOPs;

class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        System.out.println("Constructor called");
    }

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class Nonparac{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 20;
        s1.printInfo();
    }
}
