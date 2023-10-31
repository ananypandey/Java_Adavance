package Functional_Interface_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ConsumerXPredicateXSupplier
{
    public static void main(String[] args) {
        System.out.println("-------------------------Working On Consumer Functional Interface-----------------------");
        // Remember : Here in Consumer<T>, T defines the type of input which is getting consumed or being consumed.
        Consumer<Integer> consumer = (i)->{
            System.out.println("I am at ith index : "+ i);
        };
        consumer.accept(1);
        System.out.println("-------------------------Working On Predicate Functional Interface----------------------");
        //Remember : Here in Predicate<T>, T defines the type of input which is being pass onto the Predicate function.
        Predicate<String> predicate = (str)->
        {
            return str.equals("Anay");
        };
        System.out.println(predicate.test("Anay"));
        System.out.println("-------------------------Working On Supplier Functional Interface----------------------");
        // Remember : Supplier<T> Here T means type of result which you are expecting from the compiler.
        Supplier<Integer> supplier = ()->{
            Integer z =44;
            return z;
        };
        System.out.println(supplier.get());
        System.out.println("-------------------------Real Time Working On Consumer Functional Interface----------------------");
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.stream().forEach((i)-> System.out.println(i));
        System.out.println("-------------------------Real Time Working On Predicate Functional Interface----------------------");
        arrayList.stream().filter(i->i%2==0?true:false).forEach(System.out::println);
        System.out.println("-------------------------Real Time Working On Supplier Functional Interface----------------------");
        System.out.println(arrayList.stream().findAny().orElseGet(()->{
            return 0;
        }));
    }
}
