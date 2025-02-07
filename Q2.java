import java.util.Scanner;

public class EvenDigitDivisorCheck {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Read the input number N
        int N = scanner.nextInt();

        // Initialize a variable to count even digits
        int evenDigitCount = 0;
        int originalNumber = N;

        // Check each digit of N using a while loop
        while (N > 0) {
            int digit = N % 10;  // Extract the last digit
            if (digit % 2 == 0) {
                evenDigitCount++;  // Increment the even digit count
            }
            N /= 10;  // Remove the last digit
        }

        // Output the appropriate message
        if (evenDigitCount == 0) {
            System.out.println("There are no even digits in the number.");
        } else if (originalNumber % evenDigitCount == 0) {
            System.out.println("It is a divisor of the original number.");
        } else {
            System.out.println("It is not a divisor of the original number.");
        }

        // Close the scanner
        scanner.close();
    }
}
