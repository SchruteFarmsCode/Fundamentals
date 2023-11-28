package Generics;

public class Test<T> {
    T obj;
    Test(T obj) {
        this.obj = obj;
    }
    public T geObject() {
        return this.obj;
    }
}
