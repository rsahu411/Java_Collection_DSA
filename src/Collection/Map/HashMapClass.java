package Collection.Map;

import java.util.*;

public class HashMapClass {

    public void map()
    {

//        HashMap hashMap = new HashMap<>(); // default capacity - 16, loadFactor - 0.75
//        HashMap<Integer,String> hashMap = new HashMap<>(20,(float)0.80);
        HashMap<Integer,String> hashMap = new HashMap<>();

        //1. put() - add values
        hashMap.put(101,"Rishabh");
        hashMap.put(102,"Arpit");
        hashMap.put(103,"Rishi");
        hashMap.put(104,"Vivek");
        hashMap.put(105,"Shivam");
        hashMap.put(106,"Vaibhav");

        System.out.println("Map is "+hashMap);
        hashMap.put(101,"Rishabh Kumar");
        System.out.println("Updated map is "+hashMap);

        //2. get(key)
        System.out.println("Retrieve value by key: "+hashMap.get(103));

        //3. remove(key)
        System.out.println("Remove data by key: "+hashMap.remove(106));

        //4. containsKey()
        System.out.println("Key is exist: "+hashMap.containsKey(102));
        System.out.println("Key is exist: "+hashMap.containsKey(110));

        //5. containsValue()
        System.out.println("Value is exist: "+hashMap.containsValue("Vivek"));
        System.out.println("Value is exist: "+hashMap.containsValue("Shubham"));

        //6. size()
        System.out.println("Size: "+hashMap.size());

        //7. isEmpty()
        System.out.println("HashMap is empty: "+hashMap.isEmpty());

        //8. keySet() - return set of keys
        System.out.println("Set of Keys: "+hashMap.keySet());

        //9. keySet() - using forEach
        System.out.println("Reading keys using for Each loop: ");
        for(Object key: hashMap.keySet())
            System.out.print(key+" ");
        System.out.println();

        //10. keySet() - using iterator
        Set<Integer> keySet = hashMap.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        System.out.println("Reading key using iterator:");
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();


        //11. values() - return collection of values
        System.out.println("Collection of values: "+hashMap.values());

        //12. values() - using forEach
        System.out.println("Reading values using for Each loop: ");
        for (String value : hashMap.values())
            System.out.print(value+" ");
        System.out.println();

        //13. values() - using iterator
        System.out.println("Reading key using for iterator: ");
        Collection<String> valueSet = hashMap.values();
        Iterator<String> itr = valueSet.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();


        //14. get combination of key and values using forEach loop
        System.out.println("Keys and values are: ");
        for(Object key : hashMap.keySet())
            System.out.println(key+"    "+hashMap.get(key));
        System.out.println();


        //15. entrySet() - return combination of key and values;
        System.out.println("EntrySet of HashMap: "+hashMap.entrySet());


        //16. entrySet() - using forEach loop - return set of each pair
        System.out.println("Reading Entry using for Each loop: ");
        for(Map.Entry<Integer,String> entry: hashMap.entrySet())
            System.out.println(entry.getKey()+"    "+entry.getValue());


        //17. entrySet() - using iterator
        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Integer,String>> entryIterator = entrySet.iterator();

        System.out.println("Reading Entry using for Each iterator: ");
        while(entryIterator.hasNext())
        {
            Map.Entry<Integer,String> entry = entryIterator.next();
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
    }
}
