package levelupjavastart.loggerwithexecutors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LogRunner {
    static final String filePath = "test";

    public static void main(String[] args) {

        PrintLog printLog1 = createPrintLog(filePath);
        PrintLog printLog2 = createPrintLog(filePath);
        PrintLog printLog3 = createPrintLog(filePath);

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(printLog1);
        executorService.execute(printLog2);
        executorService.execute(printLog3);

        try {
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
        executorService.shutdownNow();

        FilePrinter.filePrinter(filePath);
    }

    public static PrintLog createPrintLog(String filePath) {
        Logger logger = Logger.logBuilder();
        return new PrintLog(logger, filePath);
    }
}
