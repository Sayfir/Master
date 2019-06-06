package epam.mentoring.aprokofi;

import java.util.Scanner;

public class Utils {

    public static int getAddition(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int getSubstraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int getMultplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int getDivision(int a, int b) {
        int result = a / b;
        return result;
    }

    public static String getSymbol() {
        System.out.println("Enter operation: ");
        Scanner in = new Scanner(System.in);
        String symbol = in.nextLine();
        return symbol;
    }

    public static int getFirstNumber() {
        System.out.println("Enter first number: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int number = a;
        return number;
    }

    public static int getSecondNumber() {
        System.out.println("Enter second number: ");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int number = b;
        return number;
    }

    public static void getLogging(int a, int b, String operator, int result){
        System.out.println(a + " " + operator + " " + b + " = " + result);
    }

    public static int getResult() {
        int a = Utils.getFirstNumber();
        String operator = Utils.getSymbol();
        int b = Utils.getSecondNumber();
        int result = 0;
        if (operator.equals("+")) {
            result = getAddition(a, b);
            Utils.getLogging(a,b,operator,result);
        }
        else if (operator.equals("-")) {
            result = getSubstraction(a, b);
            Utils.getLogging(a,b,operator,result);
        }
        else if (operator.equals("*")) {
            result = getMultplication(a, b);
            Utils.getLogging(a,b,operator,result);
        }
        else if (operator.equals("/")) {
            result = getDivision(a, b);
            Utils.getLogging(a,b,operator,result);
        }
        else
            System.out.println("Wrong symbol ");

        return result;
    }
}
