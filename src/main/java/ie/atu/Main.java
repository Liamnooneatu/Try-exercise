package ie.atu;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("please enter a number between 0 - 9:");
        Scanner myscan = new Scanner(System.in);
        int x = 0;

        while(x < 1){
            try {
                String input = myscan.nextLine();

                int myNum = Integer.parseInt(input);
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
