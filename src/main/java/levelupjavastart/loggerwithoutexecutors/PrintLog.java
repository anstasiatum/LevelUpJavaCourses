package levelupjavastart.loggerwithoutexecutors;

import java.util.Random;

public class PrintLog implements Runnable {
    Random RANDOM = new Random();
    int sleepTime;
    Logger logger;
    String filePath;

    public PrintLog(Logger logger, String filePath) {
        this.logger = logger;
        this.filePath = filePath;
    }

    @Override
    public void run() {
        int overallTime = 0;
        while (overallTime <= 60_000) {
            sleepTime = RANDOM.nextInt(0, 5000);
            try {
                Thread.sleep(sleepTime);
                logger.logWriter(filePath);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            overallTime += sleepTime;
        }
    }
}

