import java.util.Scanner;  // Import the Scanner class

public class PaymentProcessor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create a Scanner object for user input
        
        System.out.print("Enter the amount of payment: ");
        int amountOfPayment = sc.nextInt();  // Read user input as an integer
        
        System.out.println("Amount of payment entered: " + amountOfPayment);
        
        // You can now use amountOfPayment in your program logic
        // For example, you could perform calculations or further processing
        
        sc.close();  // Close the Scanner to release resources
    }
}
