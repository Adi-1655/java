import java.util.*;
public class bit_manipulation {
    public static void main(String args[]){
        // Get bit
        int n = 5;
        int pos = 2;
        int bitMask = 1 << pos;
        
        if((bitMask & n) == 0){
            System.out.println("Bit was zero");
        }
        else{
            System.out.println("Bit was one");
        }

        // Set bit
        // int n = 5;
         int posi = 1;
         int bitmask = 1 << posi;
        int newNumber = bitmask | n;
        System.out.println(newNumber);

        //Clear bit
        // taking get bit values
        int notbitMask = ~(bitMask);
        int newno = notbitMask & n;
        System.out.println(newno);
        
    }

}
