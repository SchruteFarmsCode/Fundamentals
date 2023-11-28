package Generics;

import java.util.List;

public class Generic {
    public static void drawShapes(List<? extends Shape> list) {
        for (Shape shape : list) {
            shape.draw();
        }

    }
}
