import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Enter the number to check Even or Odd: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is Even");
        } else {
            System.out.println(n + " is Odd");
        }

        sc.close(); 
    }
}
