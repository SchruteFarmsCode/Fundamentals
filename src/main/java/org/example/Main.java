package org.example;

import org.example.Syntax.Car;
import org.example.Syntax.Method;
import org.example.Syntax.Syntax;

public class Main {
    static void myMethod(String fName, int age) {
        System.out.println(fName + " Carell: " + age + " lat" );

    }
    static  int secondMethod(int x) {
        return 5 + x;
    }
    static int sumMethod(int x, int y) {
        return x + y;
    }
        static void ageMethod(int age){
            if (age >= 18) {
                System.out.println("Jesteś pełnoletni");
            }else{
                System.out.println("Jesteś niepełnoletni");
            }
        }


    public static void main(String[] args) {

        myMethod("John", 5);
        myMethod("Pam", 64);
        myMethod("Dwight", 34);
//        System.out.println(secondMethod(3));
        secondMethod(5);
        System.out.println(secondMethod(6));
//        System.out.println(sumMethod(3, 4));
//        sumMethod(5, 5);
//        System.out.println(sumMethod(4,6));
//        int variable = sumMethod(5, 6);
//        System.out.println(variable);
//        ageMethod(13);
//        Method method = new Method();
//       int num1 = method.plusMethod(5, 5);
//        double num2 = method.plusMethod(5.4, 5.3);
//        System.out.println(num1);
//        System.out.println(num2);
//        Syntax syntax = new Syntax();
//        syntax.syntaxMethod(12);

//        Car car = new Car();
//        car.drive(76);
//        Car VolvoCar = new Car();
//        VolvoCar.drive(120);
//        car.brands = "Audi";
//        car.color = "red";
//        car.price = 400000;
//        car.productionYear  = 2023;

        Car  myCar = new Car();
        System.out.println("ProductionYear: " + myCar.productionYear + ", Color: " + myCar.color + ", Price: " + myCar.price);





        }
    }
