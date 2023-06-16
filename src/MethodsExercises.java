import java.util.Scanner;

public class MethodsExercises {
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

    public static void main(String[] args) {
    getInteger(1, 100);



    }
}
