package levelupjavastart.loggerwithexecutors;

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
        while (!Thread.currentThread().isInterrupted()) {
            try {
                sleepTime = RANDOM.nextInt(0, 5000);
                Thread.sleep(sleepTime);
                logger.logWriter(filePath);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

