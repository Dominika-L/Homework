package homeworks.lesson7;

public class HybridCar extends Car implements Tankable , Chargable {

    public HybridCar(String manufacturer, String model, String type) {
        super(manufacturer, model, type);
    }
}
