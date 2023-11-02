package Singleton;

public class TVSet
{
    private static TVSet tvSetInstance = null;
    private void TVset()
    {
        System.out.println("Inside TV Instance");
    }
    public static TVSet getTVsetInstance()
    {
        if(tvSetInstance != null)
            return tvSetInstance;
        tvSetInstance = new TVSet();
        return tvSetInstance;
    }
}
