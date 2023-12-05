package JAVA_Collection;

public class Java_Collectionss {
    public static void main(String[] args) {

        //Class to Class -> Extend KeyWord
        //Interface to interface -> Extend KeyWord
        //Class to Interface -> Implements KeyWord
        //[] -> Interface
        //() -> class;



        //        Interface -->                                         [Collection]------------------------------------
        //                                                              /    |                                          |
        //                                                             /     |                                          |
        //                                                            /      |                                          |
        // Interface-->                                           [Set]   [List]                                        [Queue]
        // class   -->           (HashSet) (LinkedHashSet) [SortedSet]  (ArrayList)(Vector)(LinkedList)               (LinkedList)(PriorityQueue)
        //                                                  (TreeSet)



        // Map is all together a different collection
        // Hashtable(Class) implements Map
        // LinkedHashMap(Class) implements Map
        // HashMap(Class) implements Map
        // SortedMap(Interface) extends Map(Interface)
        // Treemap(Class) implements SortedMap(Interface)

        //There is one class called Object
        // Arrays(Class) extends Object(Class)
        // Collections(Class) extends Object(class)


//        All above data structure are together called collection :
//        Some common methods are :
//        1. add
//        2. addAll
//        3. remove
//        4. removeAll
//        5. size()
//        6. clear()
//        7. contains()
//        8. containsAll()
//        9. retain()
//        10. reatinAll()

//-----------------------------List Interface------------------------------------------------\\
        // ArrayList : Dynamic resizing -50% of original size
        // Allows elements to be accessed randomly
        // Non Synchronized

        // maintains the insertion and deletions order. Easier to delete and insert element at a particular index
        // Non Synchronized
        // does not support accessing elements randomly
        //Can use ListIterator ot iterate LinkedList elements.

        //Vector : It is synchronized
        //Maintains the insertion order
        //Its thread safe
        //Vector increases its size by doubling the array size
        //It's a legacy class


        //--------------------------Set Interface-----------------------------------------------\\
        //Set Interface is implemented by HashSet(class) LinkedHashSet(class)
        //Set Interface is extended by SortedSet(interface) which is further implemented by TreeSet(Class)

        //HashSet : It implicitly implements a hashtable;
        //Contains Only unique elements
        //Only one element can be added.
        //Its unordered as set

        //Linked HashSet : Ordered version of HashSet which maintains a doubly linked list across all elements.
        //It preserves the insertion order

        //Sorted Set : All elements of a Sorted Set must implement the comparable interface.
        //It's a set sorted in ascending order.

        // uses a tree for storage(Self-balancing binary search tree like red black tree)'
        //Objects in a treeset are stored in a sorted and ascending order.


        //-------------------------Why Map dosen't extend the collection Interface---------------------\\
        //The map interface in JAVA follows a key/value pair structure whereas the collection interface is a collection
        //objects which are sorted in structured manner with a specified access mechanism.
        //The main reson map dosen't extend the collection interface is that the add(E e) method of the collection  interface
        //dosen't support the key-value pair like map interface put(K,V) method.
    }
}
