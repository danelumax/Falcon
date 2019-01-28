package com.daniel.rest.Log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggerWrapper {

    private static Logger getLoggerImpl() {
        return LoggerFactory.getLogger("server");
    }

    public static void trace(String message) {
        Logger log = getLoggerImpl();
        log.trace(message);
    }

    public static void info(String message) {
        Logger log = getLoggerImpl();
        log.info(message);
    }
}
