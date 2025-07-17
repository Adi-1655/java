import java.util.ArrayList;
import java.util.Collections;
class Array_List {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        //add elements
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        //get elements
        int element = list.get(1);
        System.out.println(element);

        //add element in between
        list.add(1,22);
        System.out.println(list);

        //set element
        list.set(1,5);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
        System.out.println();

        //sotring (ascending)
        Collections.sort(list);
        System.out.println(list);
    }
}
