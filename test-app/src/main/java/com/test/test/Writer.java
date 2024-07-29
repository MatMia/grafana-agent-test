package com.test.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Writer {
    private static Logger logger = LogManager.getLogger(Writer.class);
    private static int i = 0;

    public static void logMessage() throws InterruptedException {

        while (true) {
        logger.debug("Test message %s".formatted(i));
        Thread.sleep(10000);
        i = i + 1;
        }
    }
}
