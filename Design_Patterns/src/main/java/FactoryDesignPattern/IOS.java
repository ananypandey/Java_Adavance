package FactoryDesignPattern;

public class IOS implements OperatingSystem
{
    @Override
    public void spec() {
        System.out.println("Inside OperatingSystem");
    }
}
