package FactoryDesignPattern;

public class Windows implements OperatingSystem
{

    @Override
    public void spec() {
        System.out.println("Inside Windows");
    }
}
