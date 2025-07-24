import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        
        int original = num;
        int count = 0;
        int sum = 0;

        // Count digits
        int temp = num;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        System.out.println("number of digits : " + count);

        // Calculate sum of digits raised to power of count
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, count);
            temp /= 10;
        }

        System.out.println("sum is : " + sum);
        System.out.println("Is armstrong number : " + (sum == original));
    }
}
