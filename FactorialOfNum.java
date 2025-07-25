import java.util.Scanner;

public class FactorialOfNum {
    public static void main(String[] args) {
        System.out.print("Enter a number to get its Factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // Factorial is not defined for negative numbers
        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial of " + num + " is: " + fact);
        sc.close();
    }
}
