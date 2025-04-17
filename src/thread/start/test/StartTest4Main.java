package thread.start.test;



import static thread.util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {

        Thread threadA = new Thread(new PrintWork(1000, "A"));
        Thread threadB = new Thread(new PrintWork(500, "B"));

        threadA.start();
        threadB.start();
    }


    static class PrintWork implements Runnable {

        private int sec;
        private String s;

        public PrintWork(int sec, String s) {
            this.sec = sec;
            this.s = s;
        }

        @Override
        public void run() {
            while (true) {
                log(s);
                try {
                    Thread.sleep(sec);
                } catch (InterruptedException e) {
                    throw new RuntimeException();
                }
            }

        }
    }
}
