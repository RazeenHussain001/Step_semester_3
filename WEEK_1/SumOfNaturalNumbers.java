import java.util.Scanner;

public class SumOfNaturalNumbers {

    public static void sumOfNaturalNumbers(int n) {

        int counter = 1;
        int total = 0;

        while (counter <= n) {
            total = total + counter;
            counter++;
        }

        System.out.println("Sum of numbers from 1 to " + n + " = " + total);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        sumOfNaturalNumbers(n);

        input.close();
    }
}