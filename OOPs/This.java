package OOPs;
class Student{
    String name;
    int roll_no;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.roll_no);
        System.out.println(this.age);
    }

}
public class This {
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Aditya";
        s1.roll_no = 2303099;
        s1.age = 20;

        Student s2 = new Student();
        s2.name = "AND";
        s2.roll_no = 152;
        s2.age = 05;
        s1.printInfo();
        s2.printInfo();
    }
}