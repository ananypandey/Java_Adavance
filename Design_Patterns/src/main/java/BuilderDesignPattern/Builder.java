// Creational Design Pattern

package BuilderDesignPattern;

public class Builder
{
    public static void main(String args [])
    {
        String str = new Phone().setOs("Windows").setCamera(2).getPhone();
        System.out.println(str);
    }
}
