package Functinonal_Interface;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Consumer_Functional_Interface
{
    public static void main(String args [])
    {
       Consumer<Integer> consumer = (t)->{
           System.out.println("Consuming : "+t);
       };
        consumer.accept(20);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        arrayList.add(8);
        arrayList.add(9);
        arrayList.stream().forEach((t)->{
            System.out.println(t%2);
        });








    }

}
