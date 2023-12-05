package SecondMaximumUsingStreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Mains
{
    public static void main(String[] args) {
        int[] numbers = {5,9,11,2,8,21,1};
        int num=Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(num);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(9);
        arrayList.add(11);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(21);
        arrayList.add(1);
        //In Java the 'stream.boxed' method is used to convert the elements of a primitive stream (like
        // IntStream, LongStream or DoubleStream) to their corresponding wrapper objects(such as 'Integer
        // , Long or Double). This is necessary when you want to work with primitive streams in the context
        // of the stream API, which often deals with streams of objects.
        System.out.println(Arrays.stream(numbers).boxed());
        System.out.println("Inside Main");
    }
}
