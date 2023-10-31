package Functinonal_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Supplier_Functional_Interface
{
    public static  void  main(String args [])
    {
        Supplier<Integer> supplier = ()->{
          int i=0;
          return i;
        };


        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
        System.out.println(list.stream().findAny().orElseGet(()->"Not Found"));
    }
}
