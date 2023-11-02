// Creational Design Pattern
package FactoryDesignPattern;

public class Main
{
    public static void main(String args [])
    {
        System.out.println("hey there : )");
        OperatingSystem operatingSystem = OperatingSystemFactory.getInstance("Andriod");
        operatingSystem.spec();
    }
}
