package  collectionframework;

import java.util.Iterator;
import java.util.LinkedList;

public class Linked_List_04 {


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

        //methods
        //sizeOf()
        System.out.println("Size of LInked List :"+ls.size());
        //indexOf
        System.out.println(ls.indexOf("aayush"));
        System.out.println();
        //iterator
        Iterator itr =  ls.iterator();

        while(itr.hasNext()) {
            System.out.print(itr.next()+", ");
        }
        System.out.println();

        //addAll
        LinkedList ls2  = new LinkedList();
        ls2.add(23.432);
        ls2.add("jaan");

        ls.addAll(ls2);
        System.out.println(ls);

        //remove
        System.out.println(ls.remove(3));
        System.out.println(ls.removeAll(ls2));
        System.out.println(ls);






    }
}

