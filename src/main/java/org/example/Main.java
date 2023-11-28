package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Main {
//     static void myMethod(String fName, int age) {
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

//    public static int amount = 0;

    public static void main(String[] args) {

//        Data.myMethod();
//        Data next = new Data();
//        next.mySecond();
//        System.out.println(Data.threeMethod(1, 2));
//        Data three = new Data();
//        System.out.println(three.fourMethod("Aleks", "Chrzan"));
//        Sortowanie niemutowalnej list elementów od tyłu za pomocą Comparatora:
//        List<Double> myList = Arrays.asList(3.45, 3.1, 3.76, 3.09);
//        System.out.println(myList);
//        Comparator<Double> comparator = Comparator.<Double>naturalOrder().reversed();
//        myList.sort(comparator);
//        System.out.println(myList);
//        List<String> list1 = Arrays.asList("a", "b", "c");
//        List<String> list2 = List.of();
//        List<String> list3 = Collections.singletonList("a");
//        List<String> list4 = Collections.emptyList();
//        List<String> list5 = new LinkedList<>();
//        List<String> list6 = new ArrayList<>();
//        System.out.println(list6);
//
//        list6.add("a");
//        list6.add("b");
//        list6.add("c");
//        System.out.println(list6);
//        list6.add(1, "d");
//        System.out.println(list6.get(1));
//        System.out.println(list6.indexOf("a"));
//        Array
//        int[] myTable = new int[4];
//        System.out.println("Arrays length = "  + myTable.length);
//        String ad = "sss";
//        System.out.println(ad);
//        example:
//        Student[] arr;
//        arr = new Student[5];
//        arr[0] = new Student(1, "John Wick");
//        arr[1] = new Student(2, "Jack Sparrow");
//        arr[2] = new Student(3, "Bard Zcberg");
//        arr[3] = new Student(4, "khabby McRubby");
//        arr[4] = new Student(5, "Wiliam Tuwin");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Student array: " + i + " : " + arr[i].roll_no + " " +  arr[i].name);
//        Lists:
//        ArrayList<String> listOfWords = new ArrayList<>();
//        listOfWords.add("milk");
//        listOfWords.add("chocolade");
//        listOfWords.add("cake");
//        System.out.println(listOfWords);
////        Maps:
//        HashMap<Integer, String> myHashMap = new HashMap<>();
//        myHashMap.put(1, " Andrzejek");
//        myHashMap.put(2, " Adrianek");
//        myHashMap.put(3, " Dyzio");
//        System.out.println(myHashMap);
//// Queue:
//        Queue<String> myQueue = new LinkedList<>();
//        myQueue.offer("Bartoszek");
//        myQueue.offer("Bartoszek");
//        myQueue.offer("Bartoszek");
//Stack:
//        Stack<Integer> myStack = new Stack<>();
//        myStack.push(20);
//        myStack.push(12);
//        myStack.push(67);
//        System.out.println(myStack);
//        int poppedElement = myStack.pop();
//        System.out.println(poppedElement);
//        System.out.println(myStack);
//        int topElement = myStack.peek();
//        System.out.println(topElement);
//        boolean isEmpty = myStack.isEmpty();
//        System.out.println(isEmpty);


//        programista pracuje nad edytorem tekstu lub przeglądarką internetową i chciałby umożliwić użytkownikowi
//        nawigację wstecz poprzez wciskanie przycisku "Back". W takim przypadku stos może być wykorzystywany
//        do przechowywania historii odwiedzonych stron lub edytowanych plików.

//        NavigationExample navigator = new NavigationExample();
//        navigator.navigateTo("Page 1");
//        navigator.navigateTo("Page 2");
//        navigator.navigateBack();
//        navigator.navigateBack();

        //Queue:
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(234);
//        queue.add(54);
//        queue.add(14);
//        System.out.println("Our Queue: " + queue);
//        int deleteElementQueue = queue.poll();
//        System.out.println("Delete element is : " + deleteElementQueue);
//        System.out.println(queue);
//        boolean offer = queue.offer(2);
//        System.out.println(offer);
//        System.out.println(queue);
//        Queue<Integer> myqueue = new PriorityQueue<>();
//        myqueue.offer(30);
//        myqueue.offer(20);
//        myqueue.offer(10);
//        myqueue.offer(40);
//        while(!myqueue.isEmpty()) {
//            System.out.println(myqueue.poll());
//            System.out.println(myqueue);//
//        }
        //BinaryTree
//        BinarySearchTree bst = new BinarySearchTree();
//        bst.insert(50);
//        bst.insert(30);
//        bst.insert(20);
//        bst.insert(40);
//        bst.insert(70);
//        bst.insert(60);
//        bst.insert(80);
//        System.out.println("In-order traversal of BST:");
//        bst.inOrderTraversal();
        //HashMap
//        HashMap<String, Integer> myHashMap = new HashMap<>();
//        myHashMap.put("one", 1);
//        myHashMap.put("two", 2);
//        myHashMap.put("three", 3);
//        Pobieranie wartości na podstawie klucza:
//        System.out.println("Value for key 'two': " + myHashMap.get("two"));
        //Sprawdzanie czy klucz istnieje:
//        System.out.println("Contains key 'four': " + myHashMap.containsKey("four"));
//        Usuwanie elementu:
//        myHashMap.remove("three");
//        System.out.println(myHashMap);
//Matrix(macierz):
//        int[][] matrix = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        System.out.println(matrix);

//        ExampleClass arg = new ExampleClass();
//        arg.display();
//        System.out.println(a);

        //Next:
//        Bicycle bicycle = new Bicycle();
//        bicycle.changeGear(2);
//        bicycle.speedUp(3);
//        bicycle.applyBrakes(1);
//
//        System.out.println("Bicycle present state :");
//        bicycle.printStates();
//
//        Bicycle bike = new Bicycle();
//        bicycle.changeGear(1);
//        bicycle.speedUp(4);
//        bicycle.applyBrakes(3);
//
//        System.out.println("Bike present state :");
//        bike.printStates();
        //Przykład polimorfizmu z wykorzystaniem klasy Sum:
//        Sum s = new Sum();
//        System.out.println(s.sum(10, 20));
//        System.out.println(s.sum(10, 20, 30));
//        System.out.println(s.sum(10.5, 20.5));
        //OOP wykorzystanie klasy Dog:

//        Dog Luna = new Dog("Luna", "Kaukaz", 6, "black");
//        System.out.println(Luna.toString());

//Dezerializacja:
//        File myFile = new File("cross.txt");
//        ObjectInputStream inObj = new ObjectInputStream(myFile);
//        Object obj = inObj.readObject();
//        System.out.println(obj);
        //fun
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj imię: ");
//        String name = scanner.nextLine();
//        System.out.println("Witaj " + name + "!!!!");
//        System.out.print("Podaj wiek: " );
//        int age = scanner.nextInt();
//        if (age < 18){
//            System.out.println("Denied akcess!! You're too young!!: " + age + " years");
//        }else {
//            System.out.println("Akcess grated!! You have of legal age: " + age + " years");
//        }
//        scanner.close();
        //Example:
//        Person personFirst = new Person("Andrzej", 23);
//        Person personSecond = new Person("Ryszard", 65);
//        personFirst.printDetails();
//        personSecond.printDetails();
//        personFirst.setName("Geniek");
//        System.out.println("Name has been changed to: " + personFirst.getName());
//        personFirst.printDetails();

        //Example:
//        Text obj = new Text();
//        obj.get().display();
//
//        Example:
//        DeliveryBoy deliveryBoy = DeliveryBoy.getDelivery();
//        deliveryBoy.deliver();

//        Example:
//        try{
//            File file = new File("maineFilen.txt");
//            if (file.createNewFile()) {
//                System.out.println("New file is created");
//            }else {
//                System.out.println("File already exists");
//            }
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//Second Example:
//        String path = "";
//        boolean bool = false;
//        try {
//            File file = new File("testFile2");
//            file.createNewFile();
//            System.out.println(file);
//            File file2 = file.getCanonicalFile();
//            System.out.println(file2);
//            bool = file.exists();
//            System.out.println(bool);
//            if (bool) {
//                System.out.println(path +  " Exists? " + bool);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        //Klasa FileDescripot:
//        FileDescriptor fd = null;
//        byte[]b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58};
//        try {
//            FileOutputStream fos = new FileOutputStream("record.txt");
//            FileInputStream fis = new FileInputStream("record.txt");
//            fd = fos.getFD();
//            fos.write(b);
//            fos.flush();
//            fd.sync();
//            int value = 0;
//            while((value = fis.read()) != -1) {
//                char c = (char) value;
//                System.out.print(c);
//            }
//            System.out.println("\nSync() successfully executed!!");
//        }catch (Exception e) {
//            e.printStackTrace();
//        }

        //RandomAkcessFileExample
//        try {
//            RandomAccessFileExample file = new RandomAccessFileExample();
//
//            System.out.println(new String(RandomAccessFileExample.readFromFile(file.FILEPATH, 0, 18)));
//            RandomAccessFileExample.writeToFile(file.FILEPATH, "I love my country", 31);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Podaj swoje imię: ");
//        String name = scanner.nextLine();
//        System.out.println("Witaj " + name + "!!!!!");
//        System.out.print("Podaj wiek: ");
//        int age =scanner.nextInt();
//        System.out.print("Twój wiek to " + age + "lat");
//        scanner.close();
//        try {
//            URL url = new URL("https://www.example.com");
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setRequestMethod("GET");
//            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//            String line;
//            StringBuilder answer = new StringBuilder();
//            while ((line = reader.readLine()) != null) {
//                answer.append(line);
//            }
//            reader.close();
//            System.out.println(answer.toString());
//            connection.disconnect();
//        }catch (IOException e) {
//            e.printStackTrace();
//        }

//        Integer[] a = {100, 22, 56, 41, 5, 34};
//        Character[] c = {'v', 'b', 'd', 'y', 'q', 'n'};
//        String[] s = { "Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalm"};
//        System.out.print("Sorted Integer array: ");
//        sort_generics(a);
//        System.out.println("Sorted Characker : ");
//        sort_generics(c);
//        System.out.println("Sorted String array: ");
//        sort_generics(s);
//
//        }
//        public static <T extends  Comparable<T> > void sort_generics(T[] a) {
//            for (int i = 0; i < a.length - 1; i++) {
//                for (int j = 0; j < a.length - i - 1; j++) {
//                    if (a[j].compareTo(a[j + 1]) > 0) {
//                        swap(j, j + 1, a);
//                    }
//                }
//            }
//            for (T i : a) {
//                System.out.print(i + ", ");
//            }
//        }
//    public static <T> void swap(int i, int j, T[] a) {
//        T t = a[i];
//        a[i] = a[j];
//        a[j] = t;

//        Sortowanie elementów listy za pomoca Comparatora(za 1 razem normalnie, 2 razem w odwrotnej kolejności)
//        List<Integer> number = Arrays.asList(1, 22, 3,43, 15, 6);
//        System.out.println(number);
//        Comparator<Integer> comparator1 = Comparator.naturalOrder();
//        number.sort(comparator1);
//        System.out.println(number);
//        Comparator<Integer> comparator = Comparator.<Integer>naturalOrder().reversed();
//        number.sort(comparator);
//        System.out.println(number);

        //I create an anomynous class, for the end must be ";"
//        new Comparator<>() {
//            @Override
//            public int compare(Object o1, Object o2) {
//                return 0;
//            }
//        };

//        Comparator<Cat> comparator = ((o1, o2) -> o2.getWeight() - o1.getWeight());
//        Comparator<Cat> comparator2 = new Comparator<Cat>() {
//            @Override
//            public int compare(Cat o1, Cat o2) {
//                return o1.getWeight() - o2.getWeight();
//            }
//        };
//        List<Cat> cats2 = new ArrayList<>();
//        cats2.add(new Cat(2));
//        cats2.add(new Cat(1));
//        cats2.add(new Cat(4));
//        cats2.add(new Cat(3));
//
//        System.out.println("Before: " + cats2);
//        Collections.sort(cats2, comparator2);
//        System.out.println("After: " + cats2);
        //Przykład w którym możemy policzyć ile zajmuje znalezienie elementu w milisekundach:
//        Set<Cat> cats = new HashSet<>();
//        LocalTime time = LocalTime.now();
//        for (int i = 0; i < 1000; i++) {
//            cats.add(new Cat(12, "Maniek" + i / 12));
//            System.out.println("Took: " + Duration.between(time, LocalTime.now()).toMillis());
//        }

        //HashMap:
//        Map<String, Integer> map = new HashMap<>();
//        map.put("Andrzej", 12);
//        map.put("Karol", 2);
//        map.put("Jendrzej", 15);
//        System.out.println(map);
//        System.out.println(map.get(0));
        //TreeMap--> przechowuje swoje elementy w posortowanej strukturze drzewa. Zestaw jest zawsze posegregowany na podstawie kluczy

//        Map<Cat, String> treeMap = new TreeMap<>();
//        treeMap.put(new Cat(12, "Andrzejek"), "some treeMap 1");
//        treeMap.put(new Cat(7, "Miauczek"), "some treeMap 2");
//        treeMap.put(new Cat(4, "Genio"), "some treeMap 3");
//        treeMap.put(new Cat(23, "Maro"), "some treeMap 4");
//        for (Map.Entry<Cat, String> catStringEntry : treeMap.entrySet()) {
//            System.out.println(catStringEntry);
//            for (String value : treeMap.values()) {
//                System.out.println(value);
//            }
//            for (Cat cat : treeMap.keySet()) {
//                System.out.println(cat);
//            }
//        }
//    }
//    private static class Dog implements Comparable<Dog> {
//        private final String name;
//
//        public Dog(String name) {
//            this.name = name;
//        }

//        public String getName() {
//            return name;
//        }

//        @Override
//        public String toString() {
//            return "Dog{" +
//                    "name='" + name + '\'' +
//                    '}';
//        }
//
//        @Override
//        public int compareTo(Dog o) {
//            return this.name.compareTo(o.name);
//        }

        //Queue:
//        List<Integer> myList = List.of(1, 4, 5, 76, 32);
//        Queue<Integer> queue = new ArrayDeque<>();
//        for (Integer element : queue) {
//            System.out.println(element);
//            System.out.println("queue offer: " + queue.offer(element) + ", added element: " + element);
//            System.out.println(queue);
//        }
//        System.out.println(queue);
//        int size = queue.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println("queue.peek: " + queue.peek());
//            System.out.println(queue);
//            System.out.println("queue.poll: " + queue.poll());
//
//        }
//        Deque<Integer> deque = new ArrayDeque<>();
//        deque.addFirst(1);
//        System.out.println(deque);
//        deque.addFirst(43);
//        System.out.println(deque);
//        deque.addLast(2);
//        System.out.println(deque);

        //The following example ilustates how we can print an array  of diffrent types  using one generics method
//        GenericMethod method = new GenericMethod();
//        Integer[] intArray = {1, 2, 3, 4, 5};
//        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
//        Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//        System.out.println("Array integerArray contains:");
//        method.printArray(intArray);
//
//        System.out.println("Array doubleArray contains:");
//        method.printArray(doubleArray);
//
//        System.out.println("Array charArray contains:");
//        method.printArray(charArray);

        //The following example ilustrates how extension is used in the general sense to mean
//        System.out.printf("Max of %d, %d and %d is %d\n\n",
//                3, 4, 5, maximum(3, 4, 5));
//        System.out.printf("Max of %.1f,%.1f and %.1f is %.1f\n\n", 6.6, 8.8, 7.7, maximum(6.6, 8.8, 7.7));
//        System.out.printf("Max of %s, %s and %s is %s\n", "pear", "apple", "orange", maximum("pear", "apple", "orange"));

        //The following example ilustrates how we can define a general class:
//        Box<Integer> integerBox = new Box<Integer>();
//        Box<String> stringBox = new Box<String>();
//        integerBox.add(new Integer(10));
//        stringBox.add(new String("Hello World"));
//
//        System.out.printf("Integer Value :%d\n\n", integerBox.getT());
//        System.out.printf("String Value :%s\n", stringBox.getT());

        //Example Generic:

//        Generic generic = new Generic();
//        List<Rectangle> list1 = new ArrayList<Rectangle>();
//        list1.add(new Rectangle());
//
//        List<Circle> list2 = new ArrayList<Circle>();
//        list2.add(new Circle());
//        list2.add(new Circle());
//        generic.drawShapes(list1);
//        generic.drawShapes(list2);

        //UpperBoundedWildcard:
//        UpperBoundWildcard ad = new UpperBoundWildcard();
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        System.out.println("displaying the sum= " + ad.add(list));
//
//        ArrayList<Double> list2 = new ArrayList<>();
//        list2.add(30.00);
//        list2.add(40.00);
//        System.out.println("displayinh the sum: " + ad.add(list2));

//        LowerBoundWildCard lower  = new LowerBoundWildCard();
//        List<Integer> list = Arrays.asList(1, 2, 3);
//        System.out.println("displaying the Integer values");
//        lower.addNumbers(list);
//
//        List<Number> list2 = Arrays.asList(1.0, 2.0, 3.0);
//        System.out.println("displaying the Number values");
//        lower.addNumbers(list2);

        //Streams:

        // create a list of integers
        List<Integer> number = Arrays.asList(2, 3, 4, 5);

        //demostration of map method
        List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(square);

        //create a list of String
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream");
        System.out.println(names);

        //demonstation of filter method
//        List<String> result = names.stream().filter(s -> s.startsWith("R")).collect(Collectors.toList());
//        System.out.println(result);

        //demostration of sorted method
        List<String> show = names.stream().sorted().collect(Collectors.toList());
        System.out.println(show);

        //create a list of integers
        List<Integer> numbers = Arrays.asList(2, 3, 4, 5, 3);

        //collect method returns a set
//        Set<Integer> squareSet = numbers.stream().map(z -> z * z)).collect(Collectors.toSet());
//        System.out.println(squareSet);

        //demonstation of forEach method
        number.stream().map(x -> x * x).forEach(y -> System.out.println(y));

        //demonstation of reduce method
        int even = number.stream().filter(x -> x % 2 == 0).reduce(0, (ans, i) -> ans + i);
        System.out.println(even);

        List<String> myList = Arrays.asList("Lato", "Koniec", "Wiosna", "Zima");
        long result = myList.stream().filter(z -> z.endsWith("a")).count();
        System.out.println(result);

        //collect
        List<String> word = Arrays.asList("Java", "is", "wonderful", "and", "powerful");
        String result2 = word.stream().collect(Collectors.joining());

        //Za pomocą method reduce() obliczam sumy elementów w streamie:
        List<Integer> number2 = Arrays.asList(1, 2, 3, 4, 5);
        int sum = number2.stream().reduce(0, (a, b)-> a + b);
        System.out.println("sum: " + sum);

        //Znalezienie maksimum:
        List<Integer> num = Arrays.asList(2, 8, 16, 25, 5);
        int max = num.stream().reduce((a, b) -> Integer.max(a, b)).orElseThrow(() -> new NoSuchElementException());

        //Łaczenie napisów:
        List<String> words = Arrays.asList("Java", "is", "wonderful");
        String combine = words.stream().reduce((s1, s2) -> s1 + " " + s2).orElse("");
        System.out.println(combine);


    }
    }














