package ua.nure.hrynko;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class JULConfig {
    public static Logger instance;
    public JULConfig(Class<?> cls) {
//        final Package pkg = cls.getPackage();
//        final String pkgName = pkg.getName();;
        final Logger newLogger = Logger.getLogger(cls.getName());
        newLogger.setLevel(Level.ALL);
        instance = newLogger;
    }
}
