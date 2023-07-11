package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {

    private static Logger logger;

    protected int num = 1;

    public void log(String msg) {
        String dateTime = DateTimeFormatter.ofPattern("dd.MM.yyyy hh:mm:ss").format(LocalDateTime.now());
        System.out.println("[" + dateTime + " " + num++ + "] " + msg);
    }

    private Logger() {
    }

    public static Logger getInstance() {
        return logger == null ? new Logger() : logger;
    }

}
