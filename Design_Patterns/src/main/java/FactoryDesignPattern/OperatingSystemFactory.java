package FactoryDesignPattern;

public class OperatingSystemFactory
{
    public static OperatingSystem getInstance(String str)
    {
        if(str=="Andriod")
        {
            return new Andriod();
        }
        else if(str=="Windows")
        {
            return new Windows();
        }
        else
        {
            return new IOS();
        }
    }
}
