package OOPs;
class Pen{
    String color;
    String type; // balltype, gel

    public void write()
    {
        System.out.println("Writing something");
    }
}

public class class_object {
    public static void main(String args[]){
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel"; 

        pen1.write();
    }
}