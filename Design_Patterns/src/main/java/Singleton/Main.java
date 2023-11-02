// Creational Design Pattern
package Singleton;

public class Main
{
    public static void main(String args [])
    {
        System.out.println("Hey there");
        TVSet tvSetMember1 = TVSet.getTVsetInstance();
        TVSet tvSetMember2 = TVSet.getTVsetInstance();
        System.out.println(tvSetMember1);
        System.out.println(tvSetMember2);
    }
}
