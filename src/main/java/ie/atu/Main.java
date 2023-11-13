package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0 - 9:");
        Scanner myscan = new Scanner(System.in);
        int x = 0;

        while(x < 1){
            try {
                //reads user input as a string
                String input = myscan.nextLine();

                // parse the input to an integer
                int myNum = Integer.parseInt(input);

                //check if number is between 0 and 9
                if (myNum >= 0 && myNum <= 9) {
                    System.out.println("You entered " + myNum);
                    x++;
                }
                else {
                    System.out.println("please enter a number between 0 and 9 \n");
                }

            } catch (NumberFormatException e) {
                System.out.println("please enter a Valid number \n");
            }
        }

    }
}
