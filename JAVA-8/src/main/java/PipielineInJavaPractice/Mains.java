package PipielineInJavaPractice;

import java.util.ArrayList;
import java.util.List;

public class Mains  {
    public static void main(String[] args) {
        System.out.println("Inside Main");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.stream().forEach(i-> System.out.println(i));
    }
}
