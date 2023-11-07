package org.example.Syntax;

public class Pigg implements Animall, Pigg2{
    @Override
    public void animalSound() {
        System.out.println("The Pigg says: weee wee");

    }

    @Override
    public void run() {
        System.out.println("zzz");


    }


    @Override
    public void myPiggMethod() {
        System.out.println("Body of myPigMethod");

    }
}
