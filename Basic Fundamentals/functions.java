import java.util.*;



public class functions {

    public static int mul(int a, int b){
    int x = a * b;
return x;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = mul(a,b);

        System.out.println("Multiplication of two no.s: "+x);
    }
}
