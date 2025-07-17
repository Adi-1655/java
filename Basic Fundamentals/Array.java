import java.util.Scanner;

public class Array {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int found = 0;
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int number[] = new int [10];
        System.out.println("Enter array elements");
        for(int i=0;i<size;i++){
             number[i] = sc.nextInt();
        }
        
        System.out.println("Enter element to be search");
        int n = sc.nextInt();
        for(int i=0;i<size;i++){
            if(number[i] == n){
                found = 1;
                System.out.println("Element present at index: "+i);
                break;
            }
        }

        if(found == 0){
        System.out.println("Element is not present");
        }
    }
}
