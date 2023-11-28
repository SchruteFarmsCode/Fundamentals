package Generics;

public class Box<T> {
    private T t;

    public Box(T t) {
        this.t = t;
    }

    public Box() {

    }

    public T getT() {
        return t;
    }

}
