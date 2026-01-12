import java.util.ArrayList;
import java.util.List;
public class LernArrayList {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(65);  // add function is used to insert element in arraylist
        list.add(75);
        list.add(60);
        System.out.println(list);

        //ADD
        list.add(2,55);
        System.out.println(list);

        List <Integer> Newlist = new ArrayList<>();
        Newlist.add(123);
        Newlist.add(100);
        list.addAll(Newlist); // addAll function is used to add or insert new arraylist in present array (append the array)
        System.out.println(list);

        //GET
        System.out.println(list.get(3)); // get the element from the list by using the index

        //SET
        list.set(3, 69); // update the element in the list
        System.out.println(list);

        //remove
        list.remove(3); // remove the element of given index

        list.remove(Integer.valueOf(69)); // remove the specific given element from the list

        list.clear();  // remove the all elements from the list

        //Contains
        System.out.println(list.contains(123)); // contains check the given element is present or not
        System.out.println(list);
    }
}
