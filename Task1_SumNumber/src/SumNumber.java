import java.util.Scanner;

public class SumNumber {
    public static void calculateNumber(int number1, int number2) {
        if (number1 == number2) {
            new ShouldntBeEqualNumber();
        } else {
            if (number1 < 0 || number2 < 0) {
                new ShouldntBeNegativeNumber();
            } else {
                System.out.println(number1 + number2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner one = new Scanner(System.in);
        int num1;
        System.out.println("Enter number 1: ");
        num1 = one.nextInt();
        int num2;
        System.out.println("Enter number 2: ");
        num2 = one.nextInt();

        SumNumber.calculateNumber(num1,num2);
    }
}
