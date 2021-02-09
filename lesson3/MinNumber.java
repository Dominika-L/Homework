package homeworks.lesson3;


import java.util.Arrays;
import java.util.Collections;

public class MinNumber {
    public static void main(String[] args) {

        Integer[] ints = {1, 2, -3, 10, -5, 0};

        int min = Collections.min(Arrays.asList(ints));
        System.out.println("Minimum number is " + min);
    }
}
