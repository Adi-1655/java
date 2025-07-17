import java.util.Scanner;

public class Ternary_operator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();

        String A = (age > 18) ? "Eligible" : "Not Elegible";
        System.out.println(A);
    }
}
