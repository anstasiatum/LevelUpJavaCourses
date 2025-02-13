package levelupjavastart.threads;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Instant;
import java.util.Random;

@Getter
@AllArgsConstructor
public class Logger {
    private LogLevels logLevel;
    private String message;

    private static Random RANDOM = new Random();

    public static Logger logBuilder() {

        int logType = RANDOM.nextInt(0, 4);
        LogLevels logLevel = switch (logType) {
            case 0 -> LogLevels.ERROR;
            case 1 -> LogLevels.WARN;
            case 2 -> LogLevels.INFO;
            case 3 -> LogLevels.DEBUG;
            case 4 -> LogLevels.TRACE;
            default -> null;
        };

        String message = switch (logLevel) {
            case ERROR -> "Error message";
            case WARN -> "Warning message";
            case INFO -> "Info message";
            case DEBUG -> "Debug message";
            case TRACE -> "Trace message";
        };
        return new Logger(logLevel, message);
    }

    public void logWriter(String filePath) {
        Instant currentTime = Instant.now();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            bufferedWriter.append(currentTime.toString())
                    .append(" ")
                    .append(String.valueOf(this.logLevel))
                    .append(" ")
                    .append(String.valueOf(Thread.currentThread().getName()))
                    .append(" ")
                    .append(this.message)
                    .append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
