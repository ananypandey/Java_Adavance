package Functinonal_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample implements BiConsumer<String,Integer>
{
    public static void main(String[] args) {
        System.out.println("---------------------- Making Function And Calling It -------------------");
        BiConsumerExample biConsumerExample = new BiConsumerExample();
        biConsumerExample.accept("Anay",1);
        System.out.println("----------------------- Making Lambda Function Call -----------------------");
        BiConsumer<String,Integer> biConsumer2 = new BiConsumer<String, Integer>() {
            @Override
            public void accept(String s, Integer integer) {
                System.out.println(s+ " " + integer);
            }
        };
        biConsumer2.accept("Amey",2);
        System.out.println("----------------------- Making It Fully Lambda -----------------------------");
        BiConsumer<String,Integer> biConsumer3 = (s,integer) ->{
            System.out.println(s+ " "+ integer);
        };
        biConsumer3.accept("Disha",3);
        System.out.println("------------------------Real Time Implementation----------------------------");
        Map<String,Integer> map = new HashMap<>();
        map.put("Anany",1);
        map.put("Disha",2);
        map.put("Amey",3);
        map.forEach(biConsumer3);
        System.out.println("--------------------Real Time Implementation Using Lambda------------------------");
        map.forEach((k,v)->{
            System.out.println(k+ " "+ v);
        });
    }

    @Override
    public void accept(String s, Integer integer) {
        System.out.println("Input 1 : "+s+" : Input 2 : "+integer);
    }
}
