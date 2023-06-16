import java.util.Scanner;
import java.lang.Math;

public class HighLow {


    public static void highLow(int guesses) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100 + 1);
        System.out.println("You have " + guesses + " tries to guess the number, what is your guess?");
        while(guesses > 0) {

            int usersGuess = Integer.parseInt(scanner.nextLine());
            if (usersGuess == randomNumber){
                System.out.println("Congrats You Win!!!! " + randomNumber + " was the right guess!!!");
            } else if (usersGuess < randomNumber) {
                System.out.println("Higher");
                guesses--;
                System.out.println("You have " + guesses + " guesses left.");
            } else if (usersGuess > randomNumber) {
                System.out.println("Lower");
                guesses--;
                System.out.println("You have " + guesses + " guesses left.");
            }
        }
        highLow(guesses);
    }




    public static void main(String[] args) {
       highLow(20);
    }
}
