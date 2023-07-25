package List;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedLinkClass {

    public void linkedList()
    {
      //  List list = new LinkedList();
        LinkedList list = new LinkedList<>();

        //1. add()
        list.add(35);
        list.add(45.687);
        list.add('S');
        list.add("Sahu");
        list.add(true);
        list.add(null);

        System.out.println("Linked List is: "+list);

        //2. Size()
        System.out.println("Size of linked list is "+ list.size());

        //3. remove(index)
        list.remove(2);
        System.out.println("After removing element: "+list);

        //4. add(index,object)
        list.add(2,"Rishabh");
        System.out.println("Linked list after adding element at particular position: "+list);

        //5. retrieve of a element
        System.out.println("Retrieve of an element: "+list.get(2));

        //6. set an element
        list.set(4,"false");
        System.out.println("Change value of particular element: "+ list);

        //7. search - contains
        System.out.println("Search element in linked list: "+list.contains("Rishabh"));

        //8. isEmpty()
        System.out.println("Linked list is empty: "+list.isEmpty());

        //9. for loop
        System.out.println("Read element using for loop");
        for(int i=0;i<list.size();i++)
            System.out.print(list.get(i)+" ");
        System.out.println();

        //10 for Each loop
        System.out.println("Read element using for each loop");
        for(Object val : list)
            System.out.print(val+" ");
        System.out.println();

        //11. Iterator
        System.out.println("Read element using iterator");
        Iterator<Object> iterator = list.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();


        //12. addAll()
        LinkedList list1 = new LinkedList<>();
        list1.add("X");
        list1.add("Y");
        list1.add("Z");
        list1.add("A");
        list1.add("B");
        list1.add("C");

        System.out.println("List is "+list);

        LinkedList newList = new LinkedList<>();
        newList.addAll(list1);
        System.out.println("addAll method is "+newList);

        //13. removalAll
        newList.removeAll(list1);
        System.out.println("Removal all element "+newList);

        //14. Collections.sort()
        Collections.sort(list1);
        System.out.println("Sorted Linked list is "+list1);

        //15. Collections.reverseSort()
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println("Sorted in reverse order: "+list1);

        //16. Collections.shuffle()
        Collections.shuffle(list1);
        System.out.println("Shuffle linked list is "+list1);
    }
}
