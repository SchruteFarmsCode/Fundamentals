package Generics;

public class GenericMethod {
    //The following example ilustates how we can print an array  of diffrent types  using one generics method
    public static <E> void printArray(E[] inputArray) {
        for (E element : inputArray) {
            System.out.println("%s" + element );
        }
        System.out.println();
    }

    public static <E> void printArray2(E[] elementy) {
        for (E element : elementy) {
            System.out.println(element);

        }
        System.out.println();
    }
}
