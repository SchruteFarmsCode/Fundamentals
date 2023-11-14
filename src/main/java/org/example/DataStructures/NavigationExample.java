package org.example.DataStructures;

import java.util.Stack;

public class NavigationExample {
     private Stack<String> historyStack = new Stack<>();
     private String currentLocation = "Home";

     //Metoda do navigacji do nowej lokalizacji:
     public void navigateTo(String newLocation) {
         historyStack.push(currentLocation);
         //Przechodzenie do nowej lokalizacji:
         currentLocation = newLocation;
         System.out.println("Navigated to: " + currentLocation);
     }

     //Metoda do nawigacji wstecz:
    public void navigateBack() {
         if (!historyStack.isEmpty()) {
             //Pobieranie poprzedniej lokalizacji ze stosu:
             String previousLocalization = historyStack.pop();
             //Przechodzenie do poprzedniej lokalizacji:
             currentLocation = previousLocalization;
             System.out.println("Navigated back to: " + currentLocation);
         }else {
             System.out.println("Cannot navigate back. History stack is empty. ");
         }
    }
}
