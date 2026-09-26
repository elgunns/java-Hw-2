import java.util.Scanner;

public class PolarityofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double x = sc.nextDouble();

        if (x > 0) {
            System.out.println("positive");
        } else if (x < 0) {
            System.out.println("negative");
        } else {
            System.out.println("neutral (zero)");
        }
    }
}