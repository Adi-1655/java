package OOPs;
interface demo{
    default void display(){
        System.out.println("this is interface");
   }
}

class child implements demo{

}
public class multiple_inheritance {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
