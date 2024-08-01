package collectionframework;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List_03 {
    public static void main(String[] args) {
        LinkedList ls = new LinkedList();

        //1. LinkedList are index based Data Structure.
        ls.add(10);

        //2. LinkedList can store hetrogeneous element or different data types.
        ls.add(1,"aayush");
        ls.add("ravi");
        ls.add('b');
        ls.add(12.546);

        //3. LinkedLIst can store duplicate elements
        ls.add(5,"aayush");
        ls.add(10);

        //4. LinkedLIst can store multiple null values.
        ls.add(null);
        ls.add(null);

        //5. it follows the insertion order
        //6. it does not follows the sorting order.
        ls.add(5);
        //7. it is non-synchronized collection.
        System.out.println(ls);

        System.out.println();

        // ArrayList
        ArrayList al = new ArrayList();
        al.add("dipu");
        al.add(123);
        al.add(null);

        //System.out.println(al);

        LinkedList ls2  = new LinkedList(al);
        ls2.add(23.432);
        ls2.add("jaan");
        System.out.println(ls2);
    }
}
