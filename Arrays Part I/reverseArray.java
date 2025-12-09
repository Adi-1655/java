public class reverseArray {

    public static void reverseArray1(int num[]) {
        int start = 0, end = num.length -1;

        while(start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        } 
    }
    public static void main(String[] args) {
        int num[] = {4,5,9,7,6,3};
        reverseArray1(num);

        for(int i=0; i<num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
    }
}
