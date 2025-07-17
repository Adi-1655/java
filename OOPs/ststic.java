package OOPs;
class demo{
    static int count=0;//static variable
    demo(){
        count++;
    }
    void display(){
        System.out.println(count);
    }

    static void show(){
        System.out.println("This is static keyword");
    }
}
public class ststic {
    public static void main(String args[]){
        demo obj = new demo();
        obj.display();
        demo obj1 = new demo();
        obj1.display();
        demo obj2 = new demo();
        obj2.display();
        demo.show();//static function call
    }
}
