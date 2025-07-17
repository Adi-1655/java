import java.util.Scanner;
public class Commandline_args {
    public static void main(String args[]){
        
            for(int i=0;i<100;i++){
                if(i % 4 == 0){
                    System.out.println(args[i]);
                }
            }
    }
}
