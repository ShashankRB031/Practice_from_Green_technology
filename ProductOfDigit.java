import java.util.Scanner;

public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number to get product of Digits: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int remainder = 0;
        int result = 1;

        while(num > 0) {
            remainder = num % 10;
            result = remainder * result;
            num = num / 10;
        }

        System.out.println("Product of the given num is : " + result);
    }
}
