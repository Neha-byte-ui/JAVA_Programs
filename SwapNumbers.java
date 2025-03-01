import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Take input for two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display numbers before swapping
        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Swap the numbers using a temporary variable
        int temp = num1;  // Store the value of num1 in temp
        num1 = num2;      // Assign the value of num2 to num1
        num2 = temp;      // Assign the value of temp (original num1) to num2

        // Display numbers after swapping
        System.out.println("After swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        // Close the scanner
        scanner.close();
    }
}

