package HashMapss;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing_Mapping
{
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int i=0;i<10;i++)
        {
            hashMap.put(i,(int)(Math.random()*30));
        }
        //Types of Map in JAVA
        //1. HashMap.
        //2. HashTable.
        //3. TreeHashMap.
        //4. LinkedHashMap.

        //Traversing the HashMap
        Set<Map.Entry<Integer,Integer>> values = hashMap.entrySet();
        for(Map.Entry<Integer,Integer> e : values)
        {
            System.out.println(e.getKey()+ " "+e.getValue());
        }
        //Difference Between HashMap and HashTable
        //HashMap :
        //It is not thread safe and unsynchronized
        //It is fast
        //Works with single thread
        //Allows one null key

        //HashTable :
        //It is thread safe and is synchronized
        //It is slow
        //Works with multiple threads
        //Does not allow null key.

        //Linked HashMap has insertion order fixed

        //Tree HashMap stores the input in sorted fashion.

        //Map Working :
        //Map<String,Integer> marks = new HashMap<String,Integer>();
        //marks.put("Naveen",100);
        //marks.put("Tom",200);
        //marks.put("Lisa",300);
        //marks.put("Peter,400);
        //marks.put("Robby",600);

        //Each entry node of the map will contain
        //Node<K,V>
        //int hash
        //K key
        //V value
        //Node<K,V> next


        //put implementation in JAVA :
        //public V put(K key, V value){
        //int hash = hashCode(key) --> Here the hash code for the given input is calculated.
        //int index = hash * (n-1) --> n here denotes the hash map size.
        //}

        // If the hashCode of the two key are same that means they are needed to be inserted in the index which leads to collision.
        // So in case of collision we add the new map entry node in a link list pattern. Making Node<K,V> next point to collision block.

        //For the get operation
        //hashcode will be computed to get the index value. In case there are more than one node present for a given key it will traverse the list present on that index and
        //perform equalsTo operation node attribute key.

        //For the insertion such as marks.put(null,300)
        // Index is zero;

        //What if for every entry hashcode is getting generated same :
        // Disadvantage : Leads to increase in Time Complexity.
        // To address this issue, JAVA 8 hash elements use balanced tree instead f linked list after certain threshold is reached.
        // Which brings down time to O(logn)

        // Implementation :

    }
}
