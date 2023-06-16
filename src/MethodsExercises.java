import java.util.Scanner;

import java.lang.Math;

public class MethodsExercises {

    Scanner scanner = new Scanner(System.in);
    public static int addition(int x, int y) {
        return x + y;
    };
    public static int subtraction(int x, int y) {
        return x - y;
    };
    public static int multiplication(int x, int y) {
        return x * y;
    };

    public static int theLongWay(int x, int y) {
        int sum = 0;
      for (int i = 1; i <= x; i++) {
          sum = sum + y;
      }
      return sum;
    };

    public static int division(int x, int y) {
        return x / y;
    };

    public static int remainder(int x, int y) {
        return x % y;
    };



    public static int getInteger(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int userInput = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered:" + userInput);
        if (userInput >= min && userInput <= max){
             System.out.println("Thank you!");
             return userInput;
        }System.out.println("Please enter a valid number");
        ;
        return getInteger(min, max);

    };

    public static int factor(int min, int max) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between " + min + " and " + max + ":");
        int userInput = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered:" + userInput);
        if (userInput >= min && userInput <= max){
            System.out.println("Thank you!");
            int fact = 1;
            for (int i = 1; i <= userInput; i++) {
                System.out.println(i + "!" + " = " +(fact = fact * i));
            }
            return userInput;
        }System.out.println("Please enter a valid number");
        ;
        return factor(min, max);

    };

    public static void dice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What sided dice are you rolling?");
        int min = 1;
        int sides = Integer.parseInt(scanner.nextLine());
        int diceOne = (int) (Math.random() * sides + min);
        int diceTwo = (int) (Math.random() * sides + min);
        System.out.println("Your first die rolled a: " + diceOne);
        System.out.println("Your Second die rolled a: " + diceTwo);

    };


    public static void main(String[] args) {
    dice();


    }
}
