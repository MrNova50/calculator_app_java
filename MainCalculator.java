import java.util.Scanner;
public class MainCalculator{
    public static void main(String[] args){
        
// Create a Scanner object
Scanner scanner = new Scanner(System.in);

    // Prompt the user to enter two digits
    System.out.print("Enter first digit: ");
    double digit1 = scanner.nextDouble();

    System.out.print("Enter second digit: ");
    double digit2 = scanner.nextDouble();

    // Prompt user to choose operation
    System.out.println("Choose an operation:");
    System.out.println("1. Addition (+)");
    System.out.println("2. Subtraction (-)");
    System.out.println("3. Multiplication (*)");
    System.out.println("4. Division (/)");

    // Read the user's choice of operation
    System.out.print("Enter the operation number: ");
    int operation = scanner.nextInt();

    double result = 0;

    // Perform the selected operation
    switch (operation) {
        case 1:
            result = digit1 + digit2;
            break;
        case 2:
            result = digit1 - digit2;
            break;
        case 3:
            result = digit1 * digit2;
            break;
        case 4:
            // Check for division by zero (edge case)
            if (digit2 != 0) {
                result = digit1 / digit2;
            } else {
                System.out.println("Error: Division by zero is not allowed.");

                // Exit the program
                System.exit(1);
            }
            break;
        default:
            System.out.println("Invalid operation number.");
            // Exit the program
            System.exit(1);
    }

    // Display the result
    System.out.println("The result is: " + result);

    // Close the Scanner 
    scanner.close();
}
}

