import java.util.Scanner;

public class PrintNumbers {

    public static void printNumbersUpToN(int n) {

        for (int counter = 1; counter <= n; counter++) {
            System.out.println(counter);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = input.nextInt();

        printNumbersUpToN(n);

        input.close();
    }
}