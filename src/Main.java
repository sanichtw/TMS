public class Main {
    public static void main(String[] args) {
        // Создать три потока Т1, Т2 и Т3. Реализовать выполнение поток в последовательности Т3 -> Т2 -> Т1
        //(используя метод join)
        ThreadDemoRunnable threadDemoRunnable = new ThreadDemoRunnable();

        Thread thread1 = new Thread(threadDemoRunnable);
        thread1.setName("T1");

        Thread thread2 = new Thread(threadDemoRunnable);
        thread2.setName("T2");

        Thread thread3 = new Thread(threadDemoRunnable);
        thread3.setName("T3");

        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread2.start();
        try {
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        thread1.start();

    }
}