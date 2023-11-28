package Generics;

import java.util.List;

public class LowerBoundWildCard {
    public static void addNumbers(List<? super Integer> list) {
        for (Object o : list) {

            System.out.println(o);
        }
    }
}
