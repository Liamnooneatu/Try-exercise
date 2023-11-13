package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0 - 9;");
        Scanner myscan = new Scanner(System.in);

        String input = myscan.nextLine();

        int myNum = Integer.parseInt(input);

        if (myNum >= 0 && myNum <= 9) {
            System.out.println("You entered " + myNum);
        } else {
            System.out.println("not a Valid number");
        }

    }
}
