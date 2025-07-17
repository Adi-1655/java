package OOPs;

class Student{
    String name;
    int age;
    Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    
}

public class Paraconst {
    public static void main(String args[]){
        Student s = new Student("Adi", 20);
        s.printInfo();
    }
}
