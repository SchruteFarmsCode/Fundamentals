package org.example;

import org.example.DataStructures.BinarySearchTree;

import java.util.HashMap;

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
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);
        //Pobieranie wartości na podstawie klucza:
        System.out.println("Value for key 'two': " + myHashMap.get("two"));
        //Sprawdzanie czy klucz istnieje:
        System.out.println("Contains key 'four': " + myHashMap.containsKey("four"));
        //Usuwanie elementu:
        myHashMap.remove("three");
        System.out.println(myHashMap);

        }
    }














