package Streams_VenkatSubramaniam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mainss {
    public static void main(String[] args)
    {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println("Printing First Time");
        System.out.println(list.stream().filter(i->i%2==0).map(i->i*2).collect(Collectors.toList()));
        System.out.println("Printing Second Time");
        list.stream().forEach(i-> System.out.println(i));
    }
}
