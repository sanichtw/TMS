public class ThreadDemoRunnable extends Thread{
    @Override
    public void run() {
        String currentThreadName = currentThread().getName();

        for (int x = 1; x <= 5; x++) {
            System.out.println(currentThreadName + " is running! " + x);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(currentThreadName + " completed");
    }
}
