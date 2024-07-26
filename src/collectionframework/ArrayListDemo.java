package collectionframework;


import java.util.ArrayList;

    public class ArrayListDemo {
        public static void main(String[] args) {
            ArrayList al = new ArrayList();
            // i). if we don't declare the size of arraylist it automatically takes 10 size.
            // Example 1
         /*

         al.add(0,10);
         al.add(1,30);
         al.add(2,20);  // ii). not follow sorted order
         al.add(3,40);
         al.add(4,50);
          System.out.println(al);

         */


             // iii). Arraylist can store hetrogeneous data types
            // example 2
       /*
        al.add(20);
        al.add("Aayush");
        al.add('b');
        al.add(12.43);
        System.out.println(al);
        */

            // iv). Arraylist can store duplicate values
            // example 3
            al.add(20);
            al.add(20);
            al.add(null);
            System.out.println(al);


        }

    }



