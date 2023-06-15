import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Say something to Bob:");
        String toBob =  scanner.nextLine();
        String bobSure = "Sure";
        String bobChillOut = "Whoa, chill out!";
        String bobFine = "Fine. Be that way!";
        String bobWhatever = "Whatever";

            if (toBob.endsWith("?")) {
                System.out.println(bobSure);
            } else if (toBob.endsWith("!")){
                System.out.println(bobChillOut);
            }else if (toBob.trim().isEmpty()){
                System.out.println(bobFine);
            }else System.out.println(bobWhatever);

    }
}
