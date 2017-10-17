package ua.nure.hrynko;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Calc {
    public static Logger log;
   // static Logger log = Logger.getLogger(Calc.class.getName());

    public static double Sub(double arg1, double arg2) {
        log.log(Level.CONFIG, "Sub");
        log.log(Level.FINEST, "arg1 {0}", arg1);
        log.log(Level.FINEST, "arg2 {0}", arg2);
        return arg1 - arg2;
    }

    public static double Div(double arg1, double arg2) {
        log.log(Level.CONFIG, "Div");
        log.log(Level.FINEST, "arg1 {0}", arg1);
        log.log(Level.FINEST, "arg2 {0}", arg2);
        return arg1 / arg2;
    }

    public static double Mult(double arg1, double arg2) {
        log.log(Level.CONFIG, "Mult");
        log.log(Level.FINEST, "arg1 {0}", arg1);
        log.log(Level.FINEST, "arg2 {0}", arg2);
        return arg1 * arg2;
    }

    public static double Add(double arg1, double arg2) {
        log.log(Level.CONFIG, "Add");
        log.log(Level.FINEST, "arg1 {0}", arg1);
        log.log(Level.FINEST, "arg2 {0}", arg2);
        return arg1 + arg2;
    }

    public static void main(String[] args) {
       // log = JULConfig.getLogger(Calc.class.getName());
    //   log.setLevel(Level.FINEST);

        log = new JULConfig(Calc.class).instance;

        log.log(Level.INFO, "Main");

        System.out.println(Sub(3.0,5.0));
        System.out.println(Div(10.0,5.0));
        System.out.println(Mult(3.0,5.0));
        System.out.println(Add(3.0,5.0));
    }
}
