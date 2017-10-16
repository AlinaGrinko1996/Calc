package ua.nure.hrynko;

public class Calc {
    public static double Sub(double arg1, double arg2) {
        return arg1 - arg2;
    }

    public static double Div(double arg1, double arg2) {
        return arg1 / arg2;
    }

    public static double Mult(double arg1, double arg2) {
        return arg1 * arg2;
    }

    public static double Add(double arg1, double arg2) {
        return arg1 + arg2;
    }

    public static void main(String[] args) {
        System.out.println(Sub(3.0,5.0));
        System.out.println(Div(10.0,5.0));
        System.out.println(Mult(3.0,5.0));
        System.out.println(Add(3.0,5.0));
    }
}
