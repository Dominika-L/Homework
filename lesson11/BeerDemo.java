package homeworks.lesson11;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class BeerDemo {
    public static void main(String[] args) {

        Beer tyskie = new Beer("Tyskie", "Lager", 5, 0.7);
        Beer okocim = new Beer("Okocim", "Porter", 8, 0.7);
        Beer fortuna = new Beer("Fortuna", "Pszeniczne", 4, 0.5);
        Beer sommersby = new Beer("Sommersby", "Owocowe", 4, 0.8);

        List<Beer> beers = new LinkedList<>();
        beers.add(tyskie);
        beers.add(okocim);
        beers.add(fortuna);
        beers.add(sommersby);

        for (Beer beer :beers){
            System.out.println(beers.toString());
        }

        if (tyskie.equals(okocim)){
            System.out.println("true");
        }else {
            System.out.println("to inne piwa");
        }

        if (fortuna.equals(sommersby)){
            System.out.println("true");
            Collections.sort(beers, Comparator.comparing(Beer::getName));
        }else {
            System.out.println("to inne piwa");
            Collections.sort(beers, Comparator.comparing(Beer::getName));
        }


    }
}

