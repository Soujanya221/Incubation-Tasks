package com.epam.ui;

import java.io.IOException;
import java.util.logging.*;

public class Log {
    private static final Logger logger = Logger.getLogger(Log.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("ui.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void info(String message){
        logger.log(Level.INFO, message);
    }

    public static void error(String message){
        logger.log(Level.SEVERE, message);
    }
}

