package thread.start.test;

import static thread.util.MyLogger.log;

public class StartTestMain {

    public static void main(String[] args) {

        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }
}
