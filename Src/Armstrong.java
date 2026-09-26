import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int original = n;
        int NumDigits = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, NumDigits);
            n = n / 10;
        }
        if (original == sum) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
