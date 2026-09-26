import  java.util.Scanner;
public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int first = sc.nextInt();
        System.out.print("Enter second integer: ");
        int second = sc.nextInt();
        int sum = first + second;
        int substract = first - second;
        int multiplication = first * second;
        if (second == 0){
            System.out.println("cannot divide by zero");
        } else {
            int division = first / second;
            int remainder = first % second;
            System.out.println(division);
            System.out.println(remainder);
        }
        System.out.println(sum);
        System.out.println(substract);
        System.out.println(multiplication);
    }
}
