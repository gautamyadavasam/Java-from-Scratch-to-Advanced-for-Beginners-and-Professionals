import java.util.*;

public class input {
    public static void main(String[] args) {
        // Taking a string input from the user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine(); // nextLine is a method which helps to take an input of a line
        System.out.println("Hello, " + name);

        // Taking two integer inputs from the user and calculating their sum
        System.out.println("Enter two integers to sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}
