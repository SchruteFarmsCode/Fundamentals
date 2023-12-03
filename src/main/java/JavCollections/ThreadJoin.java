package JavCollections;

public class ThreadJoin extends Thread{
    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(300);
                System.out.println("The current thread name is: " + Thread.currentThread().getName());
            }catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
}
