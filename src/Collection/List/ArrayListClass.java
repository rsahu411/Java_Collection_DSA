package Collection.List;

import java.util.*;

public class ArrayListClass {

    public void arrayList()
    {
//        ArrayList al = new ArrayList();

        List<Object> al = new ArrayList<>();

        //1. add()
        al.add(20);
        al.add(32.78);
        al.add(45);
        al.add('R');
        al.add("Rishabh");
        al.add(true);

        //print()
        System.out.println(al);

        //2. size()
        System.out.println("Size of ArrayList : "+al.size());

        //3. remove()
        al.remove(2);
        System.out.println("ArrayList after removing a element: "+al);

        //4. add(index,object)
        al.add(3,"Java");
        System.out.println("ArrayList after adding element at particular position:"+ al);

        //5. retrieve a element
        System.out.println("Get a element at particular index: "+al.get(3));

        //6. change element
        al.set(3,"SpringBoot");
        System.out.println("Change existing value: "+al);

        //7. search - contains()
        System.out.println("Search element in list: "+al.contains('R'));
        System.out.println("Search element in list: "+al.contains("Java"));

        //8. isEmpty()
        System.out.println("Collection.Collection.List is Empty: "+al.isEmpty());

        //9. for()
        System.out.print("Reading elements using for loop: ");
        for(int i=0;i<al.size();i++)
            System.out.print(al.get(i)+" ");
        System.out.println();

        //10. for..Each
        System.out.print("Reading elements using for each loop: ");
        for(Object list : al)
            System.out.print(list+" ");
        System.out.println();

        // 11. Iterator
        System.out.print("Reading elements using iterator: ");
        Iterator<Object> iterator = al.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();


        //12. addAll()
        List al1 = new ArrayList<>();
        al1.add("X");
        al1.add("Y");
        al1.add("Z");
        al1.add("A");
        al1.add("B");
        al1.add("C");

        ArrayList<Object> al1_copy = new ArrayList<>();
        al1_copy.addAll(al1);
        al1_copy.add("G");
        al1_copy.add("B");
        System.out.println("addAll Method: "+al1_copy);

        //13. removeAll() - Difference
        al1_copy.removeAll(al1);
        System.out.println("After Removal: "+al1_copy);

        // retainAll()
        al1.retainAll(al1_copy);
        System.out.println("Intersection: "+al1);

        //14. Collections.sort()
        Collections.sort(al1);
        System.out.println("Sorted ArrayList: "+al1);

        //15. Collections.sort - reverseOrder
        Collections.sort(al1,Collections.reverseOrder());
        System.out.println("Sorted arrayList in reverse order: "+al1);

        //15. Collections.shuffle()
        Collections.shuffle(al1);
        System.out.println("Shuffle arrayList: "+al1);

        //16. Convert Array to ArrayList
        String[] arr = {"Dog","cat","Monkey"};
        for(String val : arr)
            System.out.println(val);
        List list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("Array to arrayList: "+list);


    }
}
