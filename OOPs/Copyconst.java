package OOPs;
class Student{
    String name;
    int age;

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(){

    }
}
public class Copyconst {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.age = 20;
        Student s2 = new Student(s1);
        s2.printInfo();

    }
}
