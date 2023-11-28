package Generics;

import java.util.ArrayList;

public class UpperBoundWildcard {

    public static Double add(ArrayList<? extends Number> num) {
        double sum = 0.0;
        for (Number number : num) {
            sum = sum + number.doubleValue();
        }
        return sum;
    }
}
