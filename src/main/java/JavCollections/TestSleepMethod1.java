package JavCollections;

public class TestSleepMethod1 extends Thread {
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            }catch (InterruptedException e) {
                System.out.println(e);
            }

        }
    }
}
