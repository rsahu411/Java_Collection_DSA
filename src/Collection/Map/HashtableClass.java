package Collection.Map;

import java.util.*;

public class HashtableClass {

    public void hashTable()
    {
//        Hashtable hashtable = new Hashtable<>();// default capacity - 11, LoadFactor - 0.75
//        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>(20,(float)0.8);
        Hashtable<Integer,String> hashtable = new Hashtable<Integer,String>();

        //1. put()
        hashtable.put(101,"Rishabh Kumar");
        hashtable.put(102,"Rishi");
        hashtable.put(103,"Arpit");
        hashtable.put(104,"Bhaalu");
        hashtable.put(105,"Vivek");
//        hashtable.put(null,"Shivam");// NullPointerException - null key and value not allowed
//        hashtable.put(106,null);   // NullPointerException

        System.out.println("Hashtable: "+hashtable);

        //2. get(key)
        System.out.println("Retrieve value by key: "+ hashtable.get(102));


        //3. remove(key)
        System.out.println("Remove value by key: "+hashtable.remove(104));


        //4. containsKey()
        System.out.println("Key is exist: "+hashtable.containsKey(102));
        System.out.println("Key is exist: "+hashtable.containsKey(110));

        //5. containsValue()
        System.out.println("Value is exist: "+hashtable.containsValue("Vivek"));
        System.out.println("Value is exist: "+hashtable.containsValue("Shubham"));


        //6. size()
        System.out.println("Size: "+hashtable.size());

        //7. isEmpty()
        System.out.println("Hashtable is empty: "+hashtable.isEmpty());

        //8. keySet() - return set of keys
        System.out.println("Set of Keys: "+hashtable.keySet());

        //9. keySet() - using forEach
        System.out.println("Reading keys using for Each loop: ");
        for(Object key: hashtable.keySet())
            System.out.print(key+" ");
        System.out.println();

        //10. keySet() - using iterator
        Set<Integer> keySet = hashtable.keySet();
        Iterator<Integer> iterator = keySet.iterator();
        System.out.println("Reading key using iterator:");
        while(iterator.hasNext())
            System.out.print(iterator.next()+" ");
        System.out.println();


        //11. values() - return collection of values
        System.out.println("Collection of values: "+hashtable.values());

        //12. values() - using forEach
        System.out.println("Reading values using for Each loop: ");
        for (String value : hashtable.values())
            System.out.print(value+" ");
        System.out.println();

        //13. values() - using iterator
        System.out.println("Reading key using for iterator: ");
        Collection<String> valueSet = hashtable.values();
        Iterator<String> itr = valueSet.iterator();
        while (itr.hasNext())
            System.out.print(itr.next()+" ");
        System.out.println();


        //14. get combination of key and values using forEach loop
        System.out.println("Keys and values are: ");
        for(Object key : hashtable.keySet())
            System.out.println(key+"    "+hashtable.get(key));
        System.out.println();


        //15. entrySet() - return combination of key and values;
        System.out.println("EntrySet of Hashtable: "+hashtable.entrySet());


        //16. entrySet() - using forEach loop - return set of each pair
        System.out.println("Reading Entry using for Each loop: ");
        for(Map.Entry<Integer,String> entry: hashtable.entrySet())
            System.out.println(entry.getKey()+"    "+entry.getValue());


        //17. entrySet() - using iterator
        Set<Map.Entry<Integer,String>> entrySet = hashtable.entrySet();
        Iterator<Map.Entry<Integer,String>> entryIterator = entrySet.iterator();

        System.out.println("Reading Entry using for Each iterator: ");
        while(entryIterator.hasNext())
        {
            Map.Entry<Integer,String> entry = entryIterator.next();
            System.out.println(entry.getKey()+"    "+entry.getValue());
        }
    }

}
