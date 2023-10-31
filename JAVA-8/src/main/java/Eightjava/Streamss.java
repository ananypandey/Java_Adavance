package Eightjava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Streamss
{
    static ArrayList<Integer> arr = new ArrayList<Integer>();
    void add(int num)
    {
        arr.add(num);
    }
    public static void main(String args [])
    {
        // Create an ArrayList of integers
        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(1);
        number1.add(2);
        number1.add(3);
        number1.add(4);
        number1.add(5);
        number1.add(6);
        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(1);
        number2.add(2);
        number2.add(3);
        number2.add(4);
        number2.add(5);
        number2.add(6);
        ArrayList<Integer> number3 = new ArrayList<>();
        number3.add(1);
        number3.add(2);
        number3.add(3);
        number3.add(4);
        number3.add(5);
        number3.add(6);
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        arr.add(number1);
        arr.add(number2);
        arr.add(number3);

        number1.forEach(num->
                {

                }
        );




//        number1.stream().forEach(integer -> {
//            System.out.println(integer);
//        });
//        for(int i=0;i<arr.size();i++)
//        {
//            for(int j=0;j<arr.size();j++)
//            {
//                System.out.println(arr.get(i).get(j));
//            }
//        }

        System.out.println("Printing Streams");

//        arr.stream().forEach(i->{
//            i.stream().forEach(j->{
//                System.out.println(j);
//            });
//        });
        //arr.stream().forEach(i-> i.stream().forEach(System.out::println));

        // Use the Stream API to filter and print even numbers
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(num -> num % 2 == 0)
//                        .collect(Collectors.toList());
//
//        evenNumbers.forEach(System.out::println);
    }
}
