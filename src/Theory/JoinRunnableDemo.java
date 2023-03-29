package Theory;

public class JoinRunnableDemo {
    public static void main() {
        JoinRunnable a = new JoinRunnable("A");
        JoinRunnable b = new JoinRunnable("B");
        JoinRunnable c = new JoinRunnable("C");

        a.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        b.start();
        try {
            b.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        c.start();
    }
}
