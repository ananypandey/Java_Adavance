package BuilderDesignPattern;

public class Phone
{
    private String os;
    private String processor;
    private double screenSize;
    private int battery;
    private int camera;

    public Phone setOs(String os) {
        this.os = os;
        return this;
    }

    public Phone setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public  Phone setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public Phone setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone setCamera(int camera) {
        this.camera = camera;
        return this;
    }

    public String getPhone()
    {
        return "Os : "+this.os + " Camera : "+this.camera;
    }


}
