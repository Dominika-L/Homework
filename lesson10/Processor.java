package homeworks.lesson10;

public class Processor {

    String name;
    int frequency;
    int numberOfCores;

    Processor intel = new Processor("Intel", 4, 6);

    public Processor(String name, int frequency, int numberOfCores) {
        this.name = name;
        this.frequency = frequency;
        this.numberOfCores = numberOfCores;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public void setNumberOfCores(int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }
}
