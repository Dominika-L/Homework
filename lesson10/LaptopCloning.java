package homeworks.lesson10;

import java.util.logging.Level;

public class LaptopCloning {

    public static void main(String[] args) {
        HardDrive hdd = new HardDrive("HDD", "magnetyczny", 4 );
        Processor intel = new Processor("Intel", 4, 6);
        Laptop lenovo = new Laptop(hdd, "Lenovo", intel);

        Laptop lenovoClone = Laptop.copy(lenovo);



    }
}
