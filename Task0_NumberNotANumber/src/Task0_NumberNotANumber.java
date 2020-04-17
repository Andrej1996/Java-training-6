import java.util.Scanner;

public class Task0_NumberNotANumber {
    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);

        String input = "";
        System.out.println("Please enter number or text: ");

        while (!input.toUpperCase().equals("END")) {
            input = one.nextLine();

            try {
                Integer.parseInt(input);
                System.out.println("A number is entered!");
            } catch (NumberFormatException e) {
                System.out.println("A number is not entered!");
            }
        }
    }
}
