public class AirConditioning implements HomeService {
    @Override
    public void turnOn() {
        System.out.println("Air conditioning turned on.");
    }

    @Override
    public void turnOff() {
        System.out.println("Air conditioning turned off.");
    }
}