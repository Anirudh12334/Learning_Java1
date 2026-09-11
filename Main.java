import java.util.Scanner;

public class Main{
    public static void main(String[] args)
    {
        System.out.println("Hello, This Is The Max Value Finder!");

        int maxValue = Integer.MAX_VALUE;
byte maxByteValue = Byte.MAX_VALUE;
long maxLongValue = Long.MAX_VALUE;
double maxDoubleValue = Double.MAX_VALUE;
float maxFloatValue = Float.MAX_VALUE;

Scanner ask = new Scanner(System.in);
        System.out.print("Enter 1 to know the max value of an integer, enter 2 for byte, 3 for long, 4 for double, 5 for float: ");
        int choice = ask.nextInt();
        
        if (choice == 1) {
            System.out.println("The maximum value of an integer is: " + maxValue);
        } else if (choice == 2) {
            System.out.println("The maximum value of a byte is: " + maxByteValue);
        } else if (choice == 3) {
            System.out.println("The maximum value of a long is: " + maxLongValue);
        } else if (choice == 4) {
            System.out.println("The maximum value of a double is: " + maxDoubleValue);
        } else if (choice == 5) {
            System.out.println("The maximum value of a float is: " + maxFloatValue);
        } else {
            System.out.println("Invalid choice. Please enter a number between 1 and 5.");
        }
    }
}

