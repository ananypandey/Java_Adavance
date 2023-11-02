package Iterator_VenkatSubramaniam;

import java.util.ArrayList;
import java.util.List;

public class Mainss {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        for (Integer i : list)
        {
            System.out.println(i);
        }
        System.out.println("Finding First Odd Number");
        System.out.println(list.stream().filter(i->i%2!=0).findFirst().get());
        System.out.println("Printing first 2 odd numbers");
        // limit and takeWhile are the functional equivalent of break from the imperative style
        list.stream().filter(i->i%2==0).limit(2).forEach(System.out::println);
        System.out.println("----------------Converting older for loop code into Streams------------------");
        List<String> strings = new ArrayList<>();
        strings.add("Anany");
        strings.add("Amey");
        strings.add("Anay");
        strings.add("Arnav");
        strings.add("Akash");
        strings.add("Anshul");
        strings.add("Ashish");
        strings.add("Aditya");
        List<String> result1 = new ArrayList<>();
        for (String str : strings)
        {
            if(str.length()==5)
                result1.add(str.toUpperCase());
        }
        System.out.println("---------Resolving Above Issue Using Stream---------- ");        System.out.println(result1);

        List<String> result2 = new ArrayList<>();
        strings.stream().filter(names->names.length()==5).map(str->str.toUpperCase()).forEach(str -> result2.add(str));
        System.out.println(result2);
        //But there is a issue with above code
        //The functional pipeline is not pure
        //We are doing shared mutability
        //The result may be unpredictable if we
        //every change this code to run in parallel
        //by adding .parallel() or
        //by changing .stream to .parallelStream()
        System.out.println("As above code is not good way of writing we need to update it with using toList");

        //It is very important that we make the functional
        //pipeline pure. Avoid share mutable variables

        //What is pure function :
        //A pure function is idempotent, it returns the same result for the same input and does not have any side effects
        //1. It does not change any state that is visible outside
        //2. It does not depend on anything outside that may change

    }
}
