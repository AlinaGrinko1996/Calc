package ua.nure.hrynko;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.LogManager;

public class JULConfig {
    public JULConfig() {
        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("./logging.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
