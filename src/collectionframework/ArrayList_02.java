package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

    public class ArrayList_02 {
        public static void main(String[] args) {
            ArrayList al = new ArrayList();
            al.add(10);
            al.add(30);
            al.add(20);
            // 1). index based value
            al.add(3,80);

            // 2). hetrogeneous value
            al.add("aayush");
            al.add('h');
            al.add(17.45);

            // 3). duplicate value
            al.add("aayush");
            al.add(10);

            // 4). it can store any number of null value \
            al.add(null);
            al.add(null);
            al.add(null);

            // 5). follows insertion order
            // 6). it is non synchronized
            System.out.println(al);
            System.out.println();

            //methods
            //1. contains()   -- true or false
            System.out.println(al.contains("aayush"));
            //2. size(), trimToSize
            System.out.println("Size of ArrayList : "+al.size());
            //3. indexOf()
            System.out.println("index of given Element where at first it meets to the compiler:"+al.indexOf("aayush"));
            //4. iterator()
            Iterator itr1 = al.iterator();
            System.out.println("Using Iterator :");
            while(itr1.hasNext()) {
                System.out.print(itr1.next()+","+" ");
            }

            // addAll() :- we need to create one more arraylist to use this method
            System.out.println("Element of another object :");

            ArrayList al2 = new ArrayList();
            al2.add("Raj");
            al2.add('v');
            al2.add(123);
            System.out.println(al2);

            al.addAll(al2);
            System.out.println(al);

            //6. remove()
            System.out.println("Using remove method...");
            al.remove(7);
            System.out.println(al);
            al.remove(null);
            System.out.println(al);
            //7. removeAll
            al.removeAll(al2);
            System.out.println(al);


        }
    }


