package org.example.OOP;

import java.util.Random;

public class DeliveryBoy {
    public void deliver() {
        System.out.println("Delivering Item");
    }
    public static DeliveryBoy getDelivery() {
        Random random = new Random();
        int number = random.nextInt(5);
        return number % 2 == 0 ? new Postman() : new FoodDeliveryBoy();
    }
}
