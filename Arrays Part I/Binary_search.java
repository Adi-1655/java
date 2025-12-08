public class Binary_search {

    public static int binarySearch(int num[], int key) {
        int start = 0;
        int end = num.length -1;

        while(start <= end) {
            int mid = (start + end) / 2;
            if(num[mid] == key) {
                return mid;
            }
            if(num[mid] < key) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int num[] = {2,9,12,17,45,98};
        int key = 984;

        System.out.println("The in dex of key in array is: " + binarySearch(num, key));
    }
}
