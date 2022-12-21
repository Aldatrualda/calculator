import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        sayHi();
        mainMethodOfCount();
    }

    public static void sayHi() {
        System.out.println("What's your name?");
        String nameOfUser = new Scanner(System.in).nextLine();
        System.out.println("Hello, " + nameOfUser + "!");
    }

    public static void mainMethodOfCount() {
        System.out.println("Please write down your example!");
        String example = new Scanner(System.in).nextLine();
        String[] arrayOfExample = example.split(" ");

        double number1 = Double.parseDouble(arrayOfExample[0]);
        double number2 = Double.parseDouble(arrayOfExample[2]);
        String element = arrayOfExample[1];
        definitionOfElement(number1, number2, element);


    }

    public static void plus(double number1, double number2) {
        double answer = number1 + number2;
        System.out.println(number1 + " + " + number2 + " = " + answer);
    }

    public static void subtract(double number1, double number2) {
        double answer = number1 - number2;
        System.out.println(number1 + " - " + number2 + " = " + answer);
    }

    public static void multi(double number1, double number2) {
        double answer = number1 * number2;
        System.out.println(number1 + " * " + number2 + " = " + answer);
    }

    public static void div(double number1, double number2) {
        double answer = (float) number1 / number2;
        System.out.println(number1 + " / " + number2 + " = " + answer);
    }

    public static void definitionOfElement(double number1, double number2, String element) {
        switch (element) {
            case "+" -> plus(number1, number2);
            case "-" -> subtract(number1, number2);
            case "*" -> multi(number1, number2);
            case "/" -> div(number1, number2);
            default -> System.out.println("Wrong element is " + element + ". Available elements are \"+\", \"-\", \"*\", \"/\"");
        }
    }
}
