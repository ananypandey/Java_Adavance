package Functinonal_Interface;

import java.util.function.BiPredicate;

public class BiPredicateExample
{
    public static void main(String[] args) {
        System.out.println("Direct Lambda Implementation : ");
        BiPredicate<String,String> biPredicate = (str1,str2)->{
            return str1.equals(str2);
        };
        System.out.println(biPredicate.test("Anay","Anay"));
    }
}
