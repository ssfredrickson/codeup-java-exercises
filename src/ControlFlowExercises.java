import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        -----------------------

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i++ + " ");
//        }

//        --------------------------

//        long i = 2;
//
//       do {
//
//
//           System.out.println(i);
//           i = i * i;
//
//       }while (i < 1000000);

//        ----------------------------


//        for (long sqr = 2; sqr < 1000000;  sqr = sqr * sqr) {
//            System.out.println(sqr);
//        }


//        ------------------------------

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0)  {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
//
//        ---------------------------------

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int userInt = scanner.nextInt();
        System.out.println("Here is your table:");
        System.out.println("number |squared |cubed");
        System.out.println("------------------------");
        for (int i = 1; i <= userInt; i++) {
            System.out.println(i + "      | " + i * i + "       |    " + i * i * i);
        }


//        -------------------------------------
        

        System.out.println("Please enter your grade: ");
        int grade = scanner.nextInt();

        if (grade <= 100 && grade >= 88) {
            System.out.println(grade + " = A - Good Job");
        } else if (grade < 88 && grade >= 80) {
            System.out.println(grade + " = B - Nice Work");
        } else if (grade < 80 && grade >= 67) {
            System.out.println(grade + " = C - Do Better");
        } else if (grade < 67 && grade >= 60) {
            System.out.println(grade + " = D - Do Much Better");
        } else System.out.println(grade + " = F - Retake Scheduled");


    }
}
