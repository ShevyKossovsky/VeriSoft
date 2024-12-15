package SingeltonExample;

/**
 * Logger class implementing the Singleton design pattern.
 * This class ensures there is only one instance of the Logger throughout
 * the application. It provides a global point of access to log messages.
 */
public class Logger {
    // The single instance of Logger
    private static Logger instance;

    // Private constructor to prevent instantiation
    private Logger() {
    }

    /**
     * Retrieves the single instance of the Logger.
     * @return the Logger instance
     */
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) { // Thread-safe initialization
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
}