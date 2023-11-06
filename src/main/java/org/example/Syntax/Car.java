package org.example.Syntax;

public class Car {
    public  String brands = "Audi";
    public String color =  "red";
    public  int productionYear = 2023;
    public int price = 203556;

    public void drive(int km) {
        if (km > 50) {
            System.out.println(km + " -->Too speed");
        }else {
            System.out.println(km + " --> too slowly");
        }
    }
}
