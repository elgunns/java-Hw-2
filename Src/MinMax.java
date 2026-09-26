import java.util.Scanner;
public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        double first = sc.nextDouble();
        double min = first;
        double max = first;
        while (sc.hasNextDouble()) {
            double x = sc.nextDouble();
            if (x < min) min =x;
            if (x > max) max =x;
        }
        System.out.println("Minimum number is: " + min);
        System.out.println("Maximum number is: " + max);
    }
}
