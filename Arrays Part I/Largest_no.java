public class Largest_no {
    // Largest element in array
    public static int getLargest(int num[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++) {
            if(largest < num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }

    //Smallest element in array
    public static int getSmallest(int num[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<num.length; i++) {
            if(smallest > num[i]) {
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]) {
        int num[] = {2,6,5,7,9,3,1};
        System.out.println("The largest element in array is: " + getLargest(num));

        System.out.println("The largest element in array is: " + getSmallest(num));
    }
}
