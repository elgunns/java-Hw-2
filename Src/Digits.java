import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        long n = Math.abs(sc.nextLong());

        if (n == 0){
            System.out.println("Sum = 0, Product = 0, Average = 0");
            return;
        }
        long sum = 0;
        long product = 1;
        long count = 0;
        while (n > 0) {
            long digit = n % 10;
            sum += digit;
            product *= digit;
            count++;
            n /= 10;
        }
        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);
        System.out.println("Average = " + (double)sum / count);
    }
}
