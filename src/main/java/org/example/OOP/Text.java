package org.example.OOP;

public class Text {
    int a;
    int b;
    public Text() {
        a = 10;
        b = 20;
    }
     public Text get() {
        return this;
    }
    public void display() {
        System.out.println("a = " + a + " b = " + b);
    }
}
