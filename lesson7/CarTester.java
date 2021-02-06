package homeworks.lesson7;

import java.util.ArrayList;

public class CarTester extends Car {
    public CarTester(String manufacturer, String model, String type) {
        super(manufacturer, model, type);
    }

    public static void main(String[] args) {

        FuelCar fiat = new FuelCar("Fiat", "Punto", "fuel car");
        FuelCar skoda = new FuelCar("Skoda", "Octavia", "fuel car");
        ElectricCar tesla = new ElectricCar("Tesla", "Model 3", "electric car");
        ElectricCar nissan = new ElectricCar("Nissan", "Leaf", "electric car");
        HybridCar toyota = new HybridCar("Toyota", "Auris", "hybrid car");
        HybridCar lexus = new HybridCar("Lexus", "CT", "hybrid car");

        ArrayList<Object> cars = new ArrayList<>();

        cars.add(fiat);
        cars.add(skoda);
        cars.add(tesla);
        cars.add(nissan);
        cars.add(toyota);
        cars.add(lexus);

        for (Object o : cars){
            boolean isTankable = o instanceof Tankable;

            if (isTankable == true){
                System.out.println(o + " and it's tankable");
            }else{
                System.out.println(o + "and it's chargable");
            }
        }



    }
}
