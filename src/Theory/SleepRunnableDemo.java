package Theory;

public class SleepRunnableDemo {
    public static void main() {
        SleepRunnable sleepRunnable = new SleepRunnable();

        Thread one = new Thread(sleepRunnable);
        one.setName("Nikita");
        Thread two = new Thread(sleepRunnable);
        two.setName("Dasha");
        Thread three = new Thread(sleepRunnable);
        three.setName("Egor");

        one.start();
        two.start();
        three.start();
    }
}
