package thread.executor.poolsize;

import thread.executor.RunnableTask;

import java.util.concurrent.*;

import static thread.executor.ExecutorUtils.printState;
import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class PoolSizeMainV3 {

    public static void main(String[] args) {
//        ExecutorService es = Executors.newFixedThreadPool(2);
//        ExecutorService es = Executors.newCachedThreadPool();
        ExecutorService es =  new ThreadPoolExecutor(0, Integer.MAX_VALUE,
                3, TimeUnit.SECONDS,
                new SynchronousQueue<Runnable>());

        log("pool 생성");
        printState(es);

        for (int i = 1; i <= 6; i++) {
            String taskName = "task" + i;
            es.execute(new RunnableTask(taskName));
            printState(es, taskName);
        }

        sleep(4000);
        log("== 작업 수행 완료 ==");
        printState(es);
        es.close();
        log("== shutdown 완료 ==");
    }
}
