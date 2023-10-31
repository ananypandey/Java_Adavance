package Optional_Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Optional_Full_Practice
{
    public static void main(String[] args) {
        System.out.println("Inside Main");
        Optional<Integer> integer = Optional.of(1);
        Integer value = 4;
        System.out.println(integer.isPresent());
        integer.ifPresent(values-> System.out.println(integer.get()));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        Optional<List<Integer>> optionalList=Optional.of(list);
        optionalList.stream().forEach(i->i.forEach(x-> System.out.println("Value :"+x)));
        System.out.println("------------------Trying .forEach(Consumer Interface) for list----------------");
        list.forEach(i-> System.out.println(i));
    }
}
