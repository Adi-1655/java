
import java.util.Scanner;

public class function1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st no.");
        double x = sc.nextDouble();
        System.out.println("Enter 2nd no.");
        double y = sc.nextDouble();
        System.out.println("Enter 3rd no.");
        double z = sc.nextDouble();

        System.out.println("the avg of three no. are " + avg(x, y, z));
        sc.close();
    }

    public static double avg(double x,double y, double z) {
        return (x + y + z) / 3;
    }
}