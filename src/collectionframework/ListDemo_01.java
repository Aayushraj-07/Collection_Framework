package collectionframework;

import java.util.*;
    public class ListDemo_01 {
        public static void main(String[] args) {

            // i). list add the element on the index based.
            // ii). It will print the element on the based given sequence.
/*
        // example 1
        List l = new ArrayList();
        l.add(10);
        l.add(1,20);
        l.add(30);
        l.add(30);  // iii). it can store  duplicate value
        l.add(null); // iv).  it can add multiple null value
        l.add(null);
        System.out.println(l);
        */

            // example 2
            // iterator : - iterate the element in forward direction
        /*
        List l = new ArrayList();
        l.add(10);
        l.add(1,20);
        l.add(30);
        l.add(30);
        l.add(null);
        l.add(null);

        Iterator itr = l.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

       */


            // example 3
            // using ListIterator :- iterate the element in forward or backward direction
            List l = new ArrayList();
            l.add(10);
            l.add(1,20);
            l.add(30);
            l.add(30);
            l.add(null);
            l.add(null);

            ListIterator litr = l.listIterator();
            while(litr.hasNext())
            {
                System.out.print(litr.next()+" ");
            }
            System.out.println();

            //  About SET
            // i). set is not index based data structure. it is not necessary that element  will print on the based of given sequence.

            Set s = new HashSet();
            s.add(100);
            s.add(200);
            s.add(300);
            s.add(500);
            s.add(200); // ii). does not allow duplicate element
            s.add(null);
            s.add(null); // iii). it will add only one null value
            // System.out.println(s);

            Iterator itr1 = s.iterator();
            while(itr1.hasNext())
            {
                System.out.print(itr1.next()+" ");
            }

        }
    }

