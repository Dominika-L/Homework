package homeworks.lesson11;

import java.util.Objects;

public class Beer {

    String name;
    String type;
    int alcoholAmount;
    double volume;

    public Beer(String name, String type, int alcoholAmount, double volume) {
        this.name = name;
        this.type = type;
        this.alcoholAmount = alcoholAmount;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAlcoholAmount() {
        return alcoholAmount;
    }

    public void setAlcoholAmount(int alcoholAmount) {
        this.alcoholAmount = alcoholAmount;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Beer beer = (Beer) o;
        return alcoholAmount == beer.alcoholAmount &&
                volume == beer.volume &&
                Objects.equals(name, beer.name) &&
                Objects.equals(type, beer.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, alcoholAmount, volume);
    }

    @Override
    public String toString() {
        return "Beer{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", alcoholAmount=" + alcoholAmount +
                ", volume=" + volume +
                '}';
    }

}
