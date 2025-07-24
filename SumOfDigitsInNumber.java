import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        System.out.print("Enter Number to get the Sum of Digits: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int res = 0;
        int rem;
        int original = num; // store original for display if needed

        while (num > 0) {
            rem = num % 10;
            res += rem;
            num /= 10;
        }

        System.out.println("Sum of Digits of " + original + " is: " + res);
    }
}
