package thread.start.test;

import thread.util.MyLogger;

import static thread.util.MyLogger.log;

public class CounterRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            log(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }


    }
}
