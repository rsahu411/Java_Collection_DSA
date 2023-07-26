package Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {

    public void linkedHashSet()
    {
//        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet(100);// initial capacity:100, default: 16
//        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet(100,(float) 0.90); // Load factor or Fill ratio : 0.90, default: 0.75
        LinkedHashSet<Object> linkedHashSet = new LinkedHashSet<>();

        //1. add()
        linkedHashSet.add(100);
        linkedHashSet.add(30.5);
        linkedHashSet.add('A');
        linkedHashSet.add('A');
        linkedHashSet.add("Hello");
        linkedHashSet.add(true);
        linkedHashSet.add(null);

        System.out.println("LinkedHashSet is "+linkedHashSet);

        //2. remove an element
        linkedHashSet.remove('A');
        System.out.println("Element removed from LinkedHashSet: "+linkedHashSet);

        //3. search - contains
        System.out.println("Search element in LinkedHashSet: "+linkedHashSet.contains("Hello"));
        System.out.println("Search element in LinkedHashSet: "+linkedHashSet.contains("World"));

        //4. isEmpty()
        System.out.println("LinkedHashSet is empty: "+linkedHashSet.isEmpty());

        //5. for...Each
        System.out.println("Reading elements using for each loop: ");
        for(Object val:linkedHashSet)
            System.out.print(val+" ");
        System.out.println();

        //6. iterator
        System.out.println("Reading elements using for iterator: ");
        Iterator<Object> iterator = linkedHashSet.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();



        // 7. addAll()
        LinkedHashSet<Object> evenNum = new LinkedHashSet<Object>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        evenNum.add(8);

        System.out.println("Even LinkedHashSet: "+evenNum);

        LinkedHashSet<Object> number = new LinkedHashSet<>();
        number.addAll(evenNum);
        number.add(10);
        System.out.println("New LinkedHashSet: "+number);

        //8. removeAll()
        number.removeAll(evenNum);
        System.out.println("Removal of collection in LinkedHashSet: "+number);



        // Union, Intersection, difference
        LinkedHashSet<Object> set1 = new LinkedHashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("LinkedHashSet1: "+set1);

        LinkedHashSet<Object> set2 = new LinkedHashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("LinkedHashSet2: "+set2);

        //9. union - addAll()
        set1.addAll(set2);
        System.out.println("Union: "+set1);


        //10. containsAll()
        System.out.println("Set1 contains Set2 elements: "+set1.containsAll(set2));

        //11. intersection - retainAll();
        set1.retainAll(set2);
        System.out.println("Intersection: "+set1);

        //12. difference - removeAll()
        set1.removeAll(set2);
        System.out.println("Difference: "+set1);
    }
}
