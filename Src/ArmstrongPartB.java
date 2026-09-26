import java.util.Scanner;

public class ArmstrongPartB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int first = sc.nextInt();

        System.out.print("Enter the second number: ");
        int second = sc.nextInt();

        for (int i = first; i <= second; i++) {

            int number = i;
            int original = number;
            int count = 0;
            int temp = number;
            while (temp > 0) {
                count++;
                temp = temp / 10;
            }
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                int power = 1;
                for (int j = 0; j < count; j++) {
                    power = power * digit;
                }
                sum = sum + power;
                number = number / 10;
            }

            if (original == sum) {
                System.out.println(original);
            }
        }
    }
}