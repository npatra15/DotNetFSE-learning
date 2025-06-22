// File: Logger.java
public class Logger {
    // Step 2.1: private static instance
    private static Logger instance;

    // Step 2.2: private constructor
    private Logger() {
        System.out.println("Logger Initialized.");
    }

    // Step 2.3: public static method to get the instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // Lazy initialization
        }
        return instance;
    }

    // Example method for logging
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
