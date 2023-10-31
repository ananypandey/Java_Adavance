package Eightjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OPTIONAL_JAVA
{
    public static void main(String args []) throws Exception {
        Optional<String> opstr = Optional.empty();
        opstr.ifPresent(value-> System.out.println("It is present"));
        String str = opstr.orElse("It is not present");
        System.out.println(str);

        // ArrayList With Optional :
        List<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);


        Optional<List<Integer>> oparr = Optional.of(arr);
        oparr.isPresent();
        oparr.orElseGet(()->
            Arrays.asList(1,2,3,4)
        );

        // Consumer Predicate and Supplier (Functional Interface)

        // The Filter Method : The filter method will return Optional variable;
        // For example :
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        //list.stream().filter(c->c==9).findFirst().orElseThrow(Exception::new);

        // isPresent in Optional
        Optional<List> optional_list = Optional.of(list);
        System.out.println("Hi");
        System.out.println(optional_list.get().contains(2));

        Optional<Integer> opt = Optional.of(1);
        if(opt.isPresent())
        {
            System.out.println("Given interger is present");
        }
        Optional<String> optString = Optional.of("Hi");
        if (optString.isPresent())
        {
            System.out.println("Given String is Present");
        }
        optString = Optional.of("");
        if (optString.isPresent())
        {
            System.out.println("Given String is Present");
        }
//        optString = Optional.of(null);
//        if (optString.isPresent())
//        {
//            System.out.println("Given string is present 2");
//        }
        optString = Optional.ofNullable(null);
        if (optString.isPresent())
        {
            System.out.println("Given String is null");
        }

        // Either then using isPresent we can also use ifPresent.
        // ifPresent() -> If present executes lambda(a Consumer) on the value, otherwise does nothing.
        System.out.println("Resolving Optional.ifPresent(Some Lambda action)");
        optString = Optional.of("Anay");
        optString.ifPresent(i->{
            System.out.println(i);
        });
        //Optional.map() is still remaining : /
    }
}
