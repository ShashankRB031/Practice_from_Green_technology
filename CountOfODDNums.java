import java.util.Scanner;

public class CountOfODDNums {
    public static void main(String[] args) {
        System.out.print("Enter the number to count Odd numbers from 1 to n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0; // Declare and initialize count

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                count++; // Increment count when i is odd
            }
        }

        System.out.println("Total odd numbers from 1 to " + n + " = " + count);
        sc.close();
    }
}
