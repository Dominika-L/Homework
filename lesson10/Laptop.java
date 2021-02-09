package homeworks.lesson10;

import java.util.Objects;

public class Laptop {

    String name;
    int displaySize;
    int weight;
    int RAMamount;
    HardDrive hardDrive;
    Processor processor;



    public Laptop(String name, int displaySize, int weight, int RAMamount, HardDrive hardDrive, Processor processor) {
        this.name = name;
        this.displaySize = displaySize;
        this.weight = weight;
        this.RAMamount = RAMamount;
        this.hardDrive = hardDrive;
        this.processor = processor;
    }

    public Laptop(HardDrive copyHardDrive, String name, Processor intel) {
    }

    public Laptop(Processor copyProcessor, String name){
    }

    public Laptop(HardDrive copyHardDrive, String name, Processor copyProcessor, String name1) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDisplaySize() {
        return displaySize;
    }

    public void setDisplaySize(int displaySize) {
        this.displaySize = displaySize;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRAMamount() {
        return RAMamount;
    }

    public void setRAMamount(int RAMamount) {
        this.RAMamount = RAMamount;
    }

    public HardDrive getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(HardDrive hardDrive) {
        this.hardDrive = hardDrive;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public static Laptop copy(Laptop another) {
        HardDrive copyHardDrive = new HardDrive(another.hardDrive.getName(), another.hardDrive.getType(), another.hardDrive.getCapacity());
        Processor copyProcessor = new Processor(another.processor.getName(), another.processor.getFrequency(),another.processor.getNumberOfCores());
        Laptop copy = new Laptop(copyHardDrive, another.name, copyProcessor, another.name);
        return copy;
   }

}