public class HomeInterface {
    private final Light light;
    final TV tv;
    private final AirConditioning airConditioning;

    public HomeInterface() {
        light = new Light();
        tv = new TV();
        airConditioning = new AirConditioning();
    }

    public void turnOnAll() {
        light.turnOn();
        tv.turnOn();
        airConditioning.turnOn();
    }

    public void turnOffAll() {
        light.turnOff();
        tv.turnOff();
        airConditioning.turnOff();
    }
}