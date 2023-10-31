package Functinonal_Interface;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Predicate_Functional_Interface
{
    public  static  void  main(String args [])
    {
//        Predicate<Integer> predicate = (t)->
//        {
//          if(t%2==0)
//              return true;
//          return false;
//        };
        Predicate<Integer> predicate = (t)-> t%2==0;
        System.out.println(predicate.test(4));
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
        arrayList.stream().filter(t->t%2==0).forEach(System.out::println);
    }
}
