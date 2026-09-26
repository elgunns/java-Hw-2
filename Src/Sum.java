import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = sc.nextInt();
        System.out.print("Enter second integer: ");
        int second = sc.nextInt();
        int sum = first + second;
        System.out.println(sum);
    }
}
