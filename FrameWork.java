

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import java.util.ArrayDeque;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

//import java.using.Iterator;
class FrameWork

{
    public static void main(String args[])
    {
        /*ArrayList <Integer> arrL = new ArrayList <Integer> ();
        arrL.add(8);
        arrL.add(78);
        arrL.add(90);

        //Display the elements
        System.out.print(arrL);

        //add another elements
        arrL.add(56);
        System.out.println();

        
        //Display the elements again
        System.out.print(arrL);

        //addall()

        ArrayList <Integer> arrL1 = new ArrayList <Integer > ();
        arrL1.add(67);
        arrL1.add(78);

        arrL.addAll(arrL1);
        //arrL1.addAll(arrL); avoid
        
        //Display the elements  next arrL
        System.out.println();
        System.out.print(arrL);
                System.out.println();
        System.out.print(arrL1);
          System.out.println();
 

      //size()
      System.out.println("Size of arrL :" + arrL.size());
      System.out.println("Size of arrL1 : " + arrL1.size());

      //get ()
      System.out.println("Get element at index 1:  " + arrL.get(1));
      System.out.println("Get Element at index 2:   " + arrL.get(2));


    // set()

    arrL.set(1, 567);
    //Display list
    System.out.println();
    System.out.print(arrL);

    //remove()
    arrL.remove(2);
    System.out.println();
    System.out.print(arrL);

    //remove particular Elements
    arrL.remove(Integer.valueOf(567));
    System.out.println();
    System.out.print(arrL); 

    arrL.remove(Integer.valueOf(8));
    System.out.println();
    System.out.print(arrL);
    System.out.println();

    System.out.println("Size is : " + arrL.size());
    //arrL.clear();

    System.out.println(arrL);*/

    //Iterate using loop (for)

    /*for(int i=0;i<arrL.size();i++)
    {
       // System.out.println();
        System.out.print(arrL.get(i) + " ");
    }*/

    //using for-each loop
  /*  for(Integer ele : arrL)
    {
        System.out.print(ele + " ");
    }*/


    //using iterator 
   /* Iterator <Integer> i = arrL.iterator();
    while(i.hasNext())
    {
        System.out.println();
        System.out.print(i.next());
    }*/



    //Linked list
   /* LinkedList < Integer> l1 = new LinkedList<Integer> ();
    l1.add(12);
    l1.add(45);
    l1.add(78);
    l1.add(90);
    l1.add(12);

    //Display elements
    System.out.print(l1);
    //add another elements
    l1.add(23);
    l1.add(67);

    //Again display elements
    System.out.println();
    System.out.print(l1);

    LinkedList <Integer> l2 = new LinkedList<Integer>();
    l2.add(00);
    l2.add(01);
    l2.add(03);

    System.out.println();
    System.out.print(l2);

    //addAll()
    l1.addAll(l2);
    System.out.println();
    System.out.print(l1);

    //get()
    System.out.println();
    System.out.print(l1.get(2));
    System.out.println();
    System.out.print(l2.get(1));

    //set()
    l1.set(1,56);
    System.out.println();
    System.out.print(l1);

    //set ()
    l2.set(2,670);
    System.out.println();
    System.out.print(l2);

    //remove
    l1.remove(2);
    System.out.println();
    System.out.print(l1);

    //remove - with valueOf
    l1.remove(Integer.valueOf(56));
    System.out.println();
    System.out.print(l1);
    System.out.println();

    //size
    System.out.println( "Size of l1 is :" + l1.size());
    System.out.println("Size of l2 is : " +l2.size());

    //clear
    System.out.println("Clear () :" + l1.clear());
    System.out.println("Clear () :" + l2.clear());

    */


    //Stack

   /* Stack <Integer> s = new Stack <Integer> ();
    s.push(12);
    s.push(24);
    s.push(36);

    System.out.print(s);

    //add new Elements

    s.push(48);
    s.push(60);

    System.out.println();
    System.out.print(s);

    //remove - pop()
    s.pop();
    System.out.println();
    System.out.print(s);

    //remove -pop()
    s.pop();
    System.out.println();
    System.out.print(s);

    //peek
   
    System.out.println();
    System.out.print(s.peek());


    //push
    s.push(72);
    System.out.println();
    System.out.print(s);

    //pop
    s.pop();
    System.out.println();
    System.out.print(s);*/




    // Queue -->Linked List

    //offer, poll, remove//

    /*Queue <Integer> q = new LinkedList <Integer> ();
    q.offer(12);
    q.offer(24);
    q.offer(36);

    //Display elements:
    System.out.println();
    System.out.print(q);


    //poll
    q.poll();
    System.out.println();
    System.out.print(q);

    //offer
    q.offer(48);
    q.offer(60);

    System.out.println();
    System.out.print(q);


    //poll
    q.poll();
    System.out.println();
    System.out.print(q);

    //remove
    q.remove();
    System.out.println();
    System.out.println(q);

    //add another elements
    q.offer(72);
    q.offer(80);

    System.out.println();
    System.out.print(q);

    //poll
    System.out.println();
    System.out.print(q);*/


    //Priority Queue

    /*PriorityQueue <Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder()); //Min Heap

    pq.offer(12);
    pq.offer(24);

    System.out.println(pq);

    //add
    pq.offer(36);
    pq.offer(48);
    System.out.println();
    System.out.print(pq);

    //remove
    pq.poll();
    System.out.println();
    System.out.println(pq);

    pq.peek();
    System.out.println();
    System.out.print(pq.peek());*/

    /*PriorityQueue <Integer> pq = new PriorityQueue <Integer > ();
    pq.offer(12);
    pq.offer(23);
    pq.offer(89);
    pq.offer(78);
     //display using for-each loop
    for(Integer i : pq)
    {
      System.out.print(i + " ");
    }
    System.out.println();
    //poll
    pq.poll();
    System.out.println("Poll");
    System.out.print(pq);
    //remove
    System.out.println("Remove");
    pq.remove();
    System.out.print(pq);

    System.out.println();
    System.out.print(pq.remove(89)); //it return true after removal of a element otherwise false
    System.out.println();
    System.out.print(pq);

    System.out.println();
    System.out.print(pq.remove(56)); //here o/p is false bcz 56 is not present in queue.

   System.out.println();
   System.out.print(pq.contains(78));  //also work here */










    //ArrayDeque

    /*ArrayDeque <Integer> adq = new ArrayDeque <Integer> ();
    //add first
    adq.offerFirst(12);
    adq.offerFirst(23);
    System.out.print(adq);
    //add last
    adq.offer(45);
    System.out.println();
    System.out.print(adq);


    //remoe first
    adq.removeFirst();
    System.out.println();
    System.out.print(adq);

    //remove last

    adq.removeLast();
    System.out.println();
    System.out.print(adq);

    //peek

    System.out.println();
    System.out.print(adq.peek());
    System.out.println();

    // again add
    adq.offerFirst(456);
    for(Integer i : adq)
    {
        System.out.print(i + " ");


    }

    adq.offerLast(7856);
    System.out.println();
    System.out.print(adq);


   //again remove
   adq.pollFirst();
   System.out.println();
   System.out.print(adq);

   adq.pollLast();
   System.out.println();
   System.out.print(adq);

   adq.offerFirst(4567);
   adq.offerFirst(45123);
   adq.offerFirst(8975);

   System.out.println();
   System.out.print(adq.contains(8975));
   System.out.println();
   System.out.print(adq.contains(7890));

   System.out.println();
   System.out.print(adq.remove(8975));


   System.out.println();
   System.out.print(adq.size());*/



 
 
 



    //Set HashSet

   /* Set <Integer> hash = new HashSet<Integer>();
    hash.add(12);
    hash.add(34);
    System.out.print(hash); //order can be change depends on compiler 
   
    //again add
    hash.add(89);
    hash.add(12);
    System.out.println();
    System.out.print(hash); // duplicates element is allowed
    System.out.println();
    //remove
    hash.remove(12); // here for removal value is required 
    for(Integer i : hash)
    {
        System.out.print(hash);
    }

    System.out.println();
    System.out.print(hash.contains(89));

    System.out.println();
    System.out.print(hash.contains(45));
    System.out.println();

    System.out.println("Size :");
    System.out.print(hash.size());*/


    //LinkedHashSet

   /* LinkedHashSet <Integer > linked = new LinkedHashSet<Integer>();
    linked.add(56);
    linked.add(45);
    System.out.println();
    System.out.print(linked); //no change in order 

    //remove

    linked.remove(45);
    System.out.println();
    System.out.print(linked);


   // linked.remove(); // value is required 
 
    //again add
    linked.add(78);
    linked.add(12);
    System.out.println();

    for(Integer i : linked)
    {
        System.out.print(i + " ");
    }

    System.out.println();
    System.out.print(linked.contains(56));


    
    System.out.println();
    System.out.print(linked.contains(65));

    System.out.println();
    System.out.print(linked.size());
    System.out.println();


    linked.add(67);
    linked.add(100);

    System.out.println("Size : " + linked.size());*/



    //TreeSet

    /*TreeSet <String> ree = new TreeSet<String>();
    ree.add("Nidhi ");
    ree.add("Singh");
    ree.add("CS");

    System.out.print(ree);

   /* ree.add("aab");
    ree.add("aaab");*/

   /* System.out.println();
    System.out.print(ree);*/


    //remove
    /*ree.remove("Nidhi");
    System.out.println();
    System.out.print(ree);*/
    

   /*TreeSet <Integer> ree = new TreeSet<Integer>();
   ree.add(89);
   ree.add(67);
   ree.add(12);
   System.out.println();
   System.out.print(ree);

   System.out.println();
   System.out.print("Size :" + ree.size());*/


   








    





     









    

    











    }


}