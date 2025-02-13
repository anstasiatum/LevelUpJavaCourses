package levelupjavastart.threads;

public class LogRunner {
    public static void main(String[] args) {
        final String filePath = "src/main/resources/logger/logs";

        Thread threadButterfly = createLoggerThread("Butterfly", filePath);
        threadButterfly.start();

        Thread threadCaterpillar = createLoggerThread("Caterpillar", filePath);
        threadCaterpillar.start();

        Thread threadMoth = createLoggerThread("Moth", filePath);
        threadMoth.start();

        try {
            threadButterfly.join();
            threadCaterpillar.join();
            threadMoth.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        FilePrinter.filePrinter(filePath);
    }
    public static Thread createLoggerThread(String threadName, String filePath) {
        Logger logger = Logger.logBuilder();
        PrintLog printLog = new PrintLog(logger, filePath);
        Thread thread = new Thread(printLog);
        thread.setName(threadName);
        return thread;
    }
}
