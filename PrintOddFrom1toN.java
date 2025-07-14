import java.util.Scanner;

public class PrintOddFrom1toN {
    public static void main(String[] args) {
        System.out.print("Enter the number to print Odd numbers from 1 to n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Odd Numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) { 
                System.out.print(i + " ");
            }
        }

        sc.close();
    }
}
