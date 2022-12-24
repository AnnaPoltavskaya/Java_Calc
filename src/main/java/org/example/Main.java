package org.example;

public class Main {
    public static void main(String[] args) {

        calc(2.0, 4.0, "+");
        calc(6.0, 2.0, "-");
        calc(9.0, 2.0, "*");
        calc(6.0, 2.0, "/");
        calc(2.0, 2.0, "XOXOXO");

    }

    public static void calc(double param1, double param2, String operation) {
        switch (operation) {
            case ("+"):
                System.out.println(param1 + param2);
                break;
            case ("-"):
                System.out.println(param1 - param2);
                break;
            case ("/"):
                System.out.println(param1 / param2);
                break;
            case ("*"):
                System.out.println(param1 * param2);
                break;
            default:
                System.out.println("Что-то пошло не так");
                break;
        }
    }
}