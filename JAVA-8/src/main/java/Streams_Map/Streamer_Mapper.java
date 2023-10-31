package Streams_Map;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Streamer_Mapper
{
    public static void main(String args [])
    {
        System.out.println("Hey there I am inside main : /");
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int sum1 = list.stream().mapToInt(i->i).sum();
        System.out.println("Sum is : "+sum1);

        Integer reduceSum = list.stream().reduce(0,(a,b)->a+b);
        System.out.println("Reduce Sum : "+reduceSum);

        Optional<Integer> reduceSumWithMethodRefernce = list.stream().reduce(Integer::sum);
        System.out.println(reduceSumWithMethodRefernce.get());

        Integer mulResult = list.stream().reduce(1,(a,b)->a*b);
        System.out.println("Multiplication Result : "+mulResult);

        List<String> words = new ArrayList<>();
        words.add("Anany");
        words.add("Amey");
        words.add("Anay");
        words.add("Arnav");
        String ans=words.stream().reduce((word1,word2)->word1.length()>word2.length()?word1:word2).get();
        System.out.println(ans);
    }
}
