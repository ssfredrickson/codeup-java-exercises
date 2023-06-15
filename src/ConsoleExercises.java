import java.sql.SQLOutput;
import java.util.Scanner;


public class ConsoleExercises {

    public static void main(String[] args){
//        double pi = 3.14159;
//
//        System.out.printf("The value of pi is approximately %.2f", pi);

//        -----------------


        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Enter an Integer: ");
//        int userInput = scanner.nextInt();
//
//        System.out.println("Your Integer: " + userInput);

//        ----------------------

//        System.out.println("Enter three words: ");
//        String wordOne = scanner.next();
//        System.out.println(wordOne);
//        String wordTwo = scanner.next();
//        System.out.println(wordTwo);
//        String wordThree = scanner.next();
//        System.out.println(wordThree);


//        -----------------------

//        System.out.println("Give me a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.println(userSentence);

//        -------------------------

        System.out.println("Enter the length of the room: ");

        int length = scanner.nextInt();

        System.out.println("Enter the width of the room: ");

        int width = scanner.nextInt();

        System.out.println("The perimeter of the room is: " + (length * 2 + width * 2) + "ft");

        System.out.println("Your room area is " + (length * width) + " sqft");


    }

}
