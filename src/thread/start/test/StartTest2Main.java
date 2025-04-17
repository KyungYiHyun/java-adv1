package thread.start.test;

public class StartTest2Main {

    public static void main(String[] args) {

        CounterRunnable counterRunnable = new CounterRunnable();

        Thread thread = new Thread(counterRunnable,"counter");
        thread.start();
    }
}
