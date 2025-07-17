import java.util.*;
public class Update_bit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitMask = 1<<pos;
        
        if(oper == 1)
        {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

        else
        {
            int newbitMask = ~(bitMask);
            int newNumber = newbitMask & n;
            System.out.println(newNumber);
        }
    }
}
