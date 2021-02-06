package homeworks.lesson7;

public class Car {

    private String Manufacturer;
    private String Model;
    private String Type;

    @Override
    public String toString() {
        return
                Manufacturer + " " + Model + " is " + Type;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Car(String manufacturer, String model, String type) {
        Manufacturer = manufacturer;
        Model = model;
        Type = type;
    }
}
