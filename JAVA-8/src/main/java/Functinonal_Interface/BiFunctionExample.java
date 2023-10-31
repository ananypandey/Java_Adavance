package Functinonal_Interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BiFunctionExample implements BiFunction<List<Integer>,List<Integer>,List<Integer>>
{
    @Override
    public List<Integer> apply(List<Integer> list1, List<Integer> list2) {
        return Stream.of(list1,list2)
                .flatMap(List :: stream).distinct().collect(Collectors.toList());
    }

    public static void main(String args [])
    {
        System.out.println("Inside Main");
        BiFunctionExample biFunctionExample = new BiFunctionExample();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = Stream.of(1,2,3,4,5,645,7,8,9).collect(Collectors.toList());
        list2=Stream.of(6,7,8,9,111,2324,657,87987,43).collect(Collectors.toList());
        System.out.println("Traditional Approach : "+biFunctionExample.apply(list1,list2));
        System.out.println("---------------------------------Defining Bi Function Inside Main----------------------------------");
        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction = new BiFunction<List<Integer>, List<Integer>, List<Integer>>() {
            @Override
            public List<Integer> apply(List<Integer> l1, List<Integer> l2)
            {
                return Stream.of(l1,l2).flatMap(List :: stream).distinct().collect(Collectors.toList());
            }
        };
        System.out.println("Annonymous Implementation : "+biFunction.apply(list1,list2));
        System.out.println();
        System.out.println("-------------------Time For Full Lambda------------------");
        BiFunction<List<Integer>,List<Integer>,List<Integer>> biFunction2 = (l1,l2)->{
                return Stream.of(l1,l2).flatMap(List :: stream).distinct().collect(Collectors.toList());
        };
        System.out.println(biFunction2.apply(list1,list2));
        System.out.println("------------------------------- Real Time Use Of Bi Functional Interface ----------------------------");
        Map<String,Integer> map = new HashMap<>();
        map.put("Anany",20000);
        map.put("Amey",25000);
        map.put("Akash",30000);
        map.put("Arnav",40000);
        BiFunction<String,Integer,Integer> increaseSalaryBifunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String key, Integer value) {
                return value+1000;
            }
        };
       // map.replaceAll(increaseSalaryBifunction);
        map.replaceAll((key,value)->value+2500);
        System.out.println(map);
        System.out.println("----------------Mostly List Which You Will Receive Will Not Be In Sorted Order----------------");
        // To get list in sorted order you need to perform Functional sorting.
        Function<List<Integer>,List<Integer>> sortedList = lists ->
                lists.stream().sorted().collect(Collectors.toList());
        System.out.println(biFunction2.andThen(sortedList).apply(list1,list2));
    }
}
