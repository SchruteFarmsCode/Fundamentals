package org.example;

import org.example.Syntax.*;

import java.awt.image.PixelGrabber;
import java.io.*;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main extends Thread {
    //    static void myMethod(String fName, int age) {
//        System.out.println(fName + " Carell: " + age + " lat" );
//
//    }
//    static  int secondMethod(int x) {
//        return 5 + x;
//    }
//    static int sumMethod(int x, int y) {
//        return x + y;
//    }
//        static void ageMethod(int age){
//            if (age >= 18) {
//                System.out.println("Jesteś pełnoletni");
//            }else{
//                System.out.println("Jesteś niepełnoletni");
//            }
//        }
//static void checkAge(int age) {
//    if (age < 18) {
//        throw new ArithmeticException("Akcess denied: You must be age at least 18");
//    } else {
//        System.out.println("Akcess granted- You are old enough");
//    }
//}
//    public void run() {
//        System.out.println("This code is running in a thread");
//    }

    public static int amount = 0;

    public static void main(String[] args) {

//        myMethod("John", 5);
//        myMethod("Pam", 64);
//        myMethod("Dwight", 34);
//        System.out.println(secondMethod(3));
//        secondMethod(5);
//        System.out.println(secondMethod(6));
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

//        Car  myCar = new Car();
//        System.out.println("ProductionYear: " + myCar.productionYear + ", Color: " + myCar.color + ", Price: " + myCar.price);

//        Student myObj = new Student();
//        System.out.println("Name: " + myObj.fName);
//        System.out.println("Age: " + myObj.age);
//        System.out.println("Graduation Year: " + myObj.graduationYear);
//        Person myPerson = new Person();
//        myPerson.setName("Szymon");
//        System.out.println(myPerson.getName());

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj swoje imię: ");
//        String name = scanner.nextLine();
//        System.out.print("Witaj " + name + "!!!!");
//        scanner.close();

//        Animal myAnimal = new Animal();
//        Dog myDog = new Dog();
//        Pig myPig = new Pig();
//        myAnimal.animalSound();
//        myDog.animalSound();
//        myPig.animalSound();

//        Pig myPig = new Pig();
//        myPig.animalSound();
//        myPig.sleep();
//        Pigg newPigg =  new Pigg();
//        newPigg.animalSound();
//        newPigg.run();
//        newPigg.myPiggMethod();
//Enumy w połączeniu z Switch:
//        Level myEnum = Level.LOW;
//        System.out.println(myEnum);
//
//
//        switch (myEnum) {
//            case LOW:
//                System.out.println("Low level");
//                break;
//            case HIGH:
//                System.out.println("High Level");
//                break;
//            case MEDIUM:
//                System.out.println("medium level");
//                break;
//            default:
//                System.out.println("Other level");
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj wiek:");
//        int age = scanner.nextInt();
//        System.out.print("Twój wiek to: " + age + "lat");
//        scanner.close();
//Formatowanie daty:
//        LocalDateTime myDate =  LocalDateTime.now();
//        System.out.println("Date before formating: " + myDate);
//        DateTimeFormatter myDateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
//        String formattedDate = myDate.format(myDateFormat);
//        System.out.println(formattedDate);

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("BMW");
//        cars.add("Fiat");
//        for (int i = 0; i < cars.size(); i++) {
//            System.out.println(cars.get(i));
//        }
//        System.out.println(cars);
//        Collections.sort(cars);
//        System.out.println(cars);
//        System.out.println(cars.get(1));
//        cars.set(0, "Bentley");
//        System.out.println(cars);
//        cars.remove(2);
//        System.out.println(cars);
//        System.out.println(cars.size());
//HashMap
//        HashMap<String, String> myHashMap =  new HashMap<>();
//        myHashMap.put("England", "London");
//        myHashMap.put("Spain", "Madrid");
//        myHashMap.put("Portugal", "Lisbon");
//        System.out.println(myHashMap);
//        System.out.println(myHashMap.get("Spain"));
//        System.out.println(myHashMap.size());
//        for (String s : myHashMap.keySet()) {
//            System.out.println(s);
//        }
//        HashMap<String, Integer> NameAge = new HashMap<>();
//        NameAge.put("Andrzej", 25);
//        NameAge.put("Bartosz", 62);
//        NameAge.put("John", 14);
//        for (String s : NameAge.keySet()) {
//            System.out.println("key: " + s + ", value: " + NameAge.get(s));
//        }

//        HashSet<Integer> cars = new HashSet<>();
//        cars.add(1);
//        cars.add(3);
//        cars.add(5);
//        cars.add(7);
//        for (int i = 0; i <= 10; i++) {
//            if (cars.contains(i)) {
//                System.out.println(i + " Found num: ");
//            }else {
//                System.out.println(i + " Not found");
//            }
//    }

//        ArrayList<String> cars = new ArrayList<>();
//        cars.add("Volvo");
//        cars.add("Fiat");
//        cars.add("Audi");
//        cars.add("KIA");
//
//        Iterator<String> iter = cars.iterator();
//        System.out.println(iter.next());
//        }
//Użyj iteratora, aby usunąć z kolekcji liczby mniejsze niż 10:
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(12);
//        numbers.add(6);
//        numbers.add(2);
//        numbers.add(23);
//
//        Iterator<Integer> it = numbers.iterator();
//        while(it.hasNext()) {
//            Integer i = it.next();
//            if (i < 10) {
//                it.remove();
//            }
//        }
//        System.out.println(numbers);
//Tworzenie obiektów opakowujących:
//        Integer myInt = 2;
//        Double myDouble = 1.3;
//        Character myChar = 'A';
//        System.out.println(myInt.intValue());
//        System.out.println(myDouble.doubleValue());
//        System.out.println(myChar.charValue());

//       Integer myInt = 34;
//       String myString = myInt.toString();
//        System.out.println(myString);
//        System.out.println(myString.length());
//Wyjątki:
//        try {
//            int[] myTable = {1, 4, 5, 6};
//            System.out.println(myTable[10]);
//        }catch (Exception e) {
//            System.out.println("Num 10 is not exist");
//        }finally {
//            System.out.println("All is good");
//        }

//        checkAge(33);
//REGEX:
//        Pattern pattern = Pattern.compile("W3Schools", Pattern.CASE_INSENSITIVE);
//        Matcher  matcher = pattern.matcher("W3Schools");
//        boolean matchFound = matcher.find();
//        if(matchFound) {
//            System.out.println("Match found");
//        }else {
//            System.out.println("Match Not found");
//        }
//WĄTKI:
//        Main obj = new Main();
//        Thread thread = new Thread(obj);
//        thread.start();
//        System.out.println("This code is outside of the thread");

//        Main thread = new Main();
//        thread.start();
//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);
//
//
//        public void run() {
//            amount++;
//        }
//Używanie interfejsu Consumer, aby zapisać lambde w zmiennej
//        ArrayList<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(3);
//        myList.add(5);
//        myList.add(34);
//        Consumer<Integer> myLambda = (i) -> System.out.println(i);
//        myList.forEach(myLambda);
//Obsługa plików java:
//        File myobj = new File("filname.txt");
//Tworzenie pliku "filman.txt"
//        try{
//            File obj = new File("filman.txt");
//            if (obj.createNewFile()) {
//                System.out.println("Create new File: " + obj);
//            }else {
//                System.out.println("File is exists");
//            }
//        }catch (Exception e) {
//            System.out.println("Occurred error, sorry");
//            e.printStackTrace();
//        }
// Zapisywanie do pliku:

//        try {
//            FileWriter myWriter = new FileWriter("glass.txt");
//            myWriter.write("Cup is the best glass");
//            myWriter.close();
//            System.out.println("Succesfully wrote to the file with glass");
//        }catch (IOException e) {
//            System.out.println("Error occurred");
//            e.printStackTrace();
//        }
//        Czytanie pliku:
//        try{
//            File obj = new File("filename.txt");
//            Scanner myReader = new Scanner(obj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        }catch (FileNotFoundException e) {
//            System.out.println("An error occurrted");
//            e.printStackTrace();
//        }
//        Przykład wykorzystania metod:
//        File obj = new File("filman.txt");
//        if (obj.exists()) {
//            System.out.println("File name: " + obj.getName());
//            System.out.println("Absolute path: " + obj.getAbsolutePath());
//            System.out.println("Writeable: " + obj.canWrite());
//            System.out.println("Readable: " + obj.canRead());
//            System.out.println("File size in byte: " + obj.length());
//
//        }else {
//            System.out.println("The file does not exist");
//        }
//        Dodaj dwie liczby za pomocą danych wejściowych:
//        int sum, x, y;
//        Scanner myObj = new Scanner(System.in);
//        System.out.println("To jest kalkulator, możesz sumować liczby:");
//        System.out.println("Podaj pierszą  liczbe: ");
//        x = myObj.nextInt();
//        System.out.println("Wpisz następną liczbę numer: ");
//        y = myObj.nextInt();
//        sum = x + y;
//        System.out.println("Suma tych liczb to: " + sum);
//        myObj.close();
//Policz słowa:
//        String words = "To jest jesień i jest deszcz";
//        int countWords = words.split("\\s").length;
//        System.out.println(countWords);
//Napisz string, a później wydrukuj go w odbiciu lustrzanym(od tyłu)
//        String example = "Poland";
//        String revers = "";
//        for (int i = 0; i < example.length(); i++) {
//            revers = example.charAt(i) + revers;
//
//        }
//        System.out.println("Słowo Poland odwrocone: " + revers);
//Oblicz sume liczb w tablicy:
//        int[] obj = {4, 5, 9, 2};
//        int sum = 0;
//        int i;
//        for (int i = 0; i < obj.length; i++) { {
//            sum += obj[i];
//            System.out.println("Sum of table: " + sum);
//        }
//        }
//        Sprawdz czy liczba jest parzysta czy nieparzysta:
//        int myNum = 11;
//        if (myNum % 2 == 0) {
//            System.out.println(myNum + " --> Liczba jest parzysta");
//        }else {
//            System.out.println(myNum + " --> Liczba jest nieparzysta");
//        }
//        Example:
//        float a = 12.3f;
//        Float myFloat = new Float(a);
//        System.out.println(myFloat);
//        Next:
//        BufferedReader obj = new BufferedReader(System.in);
//        String age = obj.readLine()
//        System.out.println("Podaj swoje imię: ");
//        StringBuffer:
//        StringBuffer sb = new StringBuffer();
//        sb.append("Helko");
//        sb.append("elo");
//        sb.append("siema");
//        String message = sb.toString();
//        System.out.println(message);
//        Next Example:
//        HashMap<String, Integer> myMap = new HashMap<>();
//        myMap.put("John", 5);
//        myMap.put("Arnold", 23);
//        System.out.println(myMap.size());
//        System.out.println(myMap.put("Marcin",4));
//        System.out.println(myMap);
//        Sprawdzanie czy rok jest przestępny(leapYear)

//        int year = 2024;
//        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
//            System.out.println(year + " --> to rok przestępny");
//        }else {
//            System.out.println(year + " --> to nie rok przestępny");
//    }
//Użyj rekurencji aby dodać wszystkie liczby od 5 do 10:

//        int result = sum(5, 10);
//        System.out.println(result);
//    }
//    public static int sum(int start, int end) {
//        if( end >start) {
//            return end + sum(start, end - 1);
//        }else {
//            return end;
//        }
//        Przykład piramidy:
//        for (int j = 1; j <= 5; j++) {
//            for (int k = 1; k <= j; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        aa:
//        for (int j = 1; j <= 3; j++) {
//            bb:
//            for (int k = 1; k <= 3; k++) {
//                if(j == 2 && k == 2) {
//                    break aa;
//                }
//                System.out.println(j + " " + k);
//            }
//        }
//     infinitive loop:
//        for (;;) {
//            System.out.println("Petla bezokolicznikowa");
//        }
//   Petla while:
//        int j = 1;
//        while(j <= 10) {
//            System.out.println(j);
//            j++;
//        }
//    Petla while nieskończona:
//        int k = 1;
//        while (true) {
//            System.out.println("Nieskończona, aż się skończy pamięć ");
//        }

//        for (int j = 1; j <= 10 ; j++) {
//            if(j == 5) {
//                break;
//            }
//            System.out.println(j);
//
//        }
//        for (int j = 0; j <= 10; j++) {
//            if (j == 7) {
//                continue;
//            }
//            System.out.println(j);

//        int k = 1;
//        do{
//            if (k == 5) {
//                k++;
//                continue;
//            }
//            System.out.println(k);
//            k++;
//        }while (k <= 10);

       HashMap<String, Integer> obj = new HashMap();
       obj.put("Andrzej Morawa", 34);
       obj.put("Mietek Żul", 25);
       obj.put("Renaugh Oklash", 47);

        System.out.println(obj);



    }
}



