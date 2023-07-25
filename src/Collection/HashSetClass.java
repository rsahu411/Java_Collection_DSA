package Collection;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetClass {

    public void hashSet()
    {
//        HashSet hashSet = new HashSet(100);// initial capacity:100, default: 16
//        HashSet hashSet = new HashSet(100,(float) 0.90); // Load factor or Fill ratio : 0.90, default: 0.75
        HashSet<Object> hashSet = new HashSet<>();

        //1. add()
        hashSet.add(100);
        hashSet.add(30.5);
        hashSet.add('A');
        hashSet.add('A');
        hashSet.add("Hello");
        hashSet.add(true);
        hashSet.add(null);

        System.out.println("HashSet is "+hashSet);

        //2. remove an element
        hashSet.remove('A');
        System.out.println("Element removed from HashSet: "+hashSet);

        //3. search - contains
        System.out.println("Search element in HashSet: "+hashSet.contains("Hello"));
        System.out.println("Search element in HashSet: "+hashSet.contains("World"));

        //4. isEmpty()
        System.out.println("HashSet is empty: "+hashSet.isEmpty());

        //5. for...Each
        System.out.println("Reading elements using for each loop: ");
        for(Object val:hashSet)
            System.out.print(val+" ");
        System.out.println();

        //6. iterator
        System.out.println("Reading elements using for iterator: ");
        Iterator<Object> iterator = hashSet.iterator();
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();



        // 7. addAll()
        HashSet evenNum = new HashSet<>();
        evenNum.add(2);
        evenNum.add(4);
        evenNum.add(6);
        evenNum.add(8);

        System.out.println("Even HashSet: "+evenNum);

        HashSet number = new HashSet();
        number.addAll(evenNum);
        number.add(10);
        System.out.println("New HashSet: "+number);

        //8. removeAll()
        number.removeAll(evenNum);
        System.out.println("Removal of collection in HashSet: "+number);



        // Union, Intersection, difference
        HashSet set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        System.out.println("HashSet1: "+set1);

        HashSet set2 = new HashSet();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        System.out.println("HashSet2: "+set2);

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

