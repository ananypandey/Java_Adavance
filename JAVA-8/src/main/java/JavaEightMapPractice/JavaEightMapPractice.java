package JavaEightMapPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class JavaEightMapPractice {
    public static void main(String[] args) {
        System.out.println("Inside main");
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(22);
        list2.add(22);
        list2.add(23);
        list2.add(24);
        list2.add(25);
        list2.add(26);
        list2.add(27);
        list2.add(28);
        System.out.println("-------------------stream().reduce() for addition-------------------");
        Integer add = list1.stream().reduce(0,(a,b)->a+b);
        System.out.println(add);
        System.out.println("-------------------stream().reduce() for multiplication-------------------");
        Integer mul = list2.stream().reduce(1,(a,b)->a*b);
        System.out.println(mul);
        System.out.println("-------------------stream().map for multiplication-------------------");
        list1.stream().map(i->i*4).forEach(System.out::println);
        System.out.println("-------------------stream().map for string-------------------");
        List<String> stringList = new ArrayList<>();
        stringList.add("anay");
        stringList.add("amey");
        stringList.add("arnav");
        stringList.add("amogh");
        System.out.println(stringList.stream().map(String::toUpperCase).collect(Collectors.toList()));
        System.out.println("-------------------Flat Map in Stream-------------------");
        List<List<Integer>> combinationList = new ArrayList<>();
        combinationList.add(list1);
        combinationList.add(list2);
        System.out.println(combinationList.stream().flatMap(list -> list.stream()).distinct().collect(Collectors.toList()));
    }
}
