package Theory;

public class isAliveDemo {
    public static void main() throws InterruptedException {
        SleepRunnable sleepRunnable = new SleepRunnable();

        Thread thread = new Thread(sleepRunnable);
        System.out.println("Before starting " + thread.isAlive());
        thread.start();
        System.out.println("After starting " + thread.isAlive());
        thread.join();
        System.out.println("After thread completed " + thread.isAlive());
    }
}
