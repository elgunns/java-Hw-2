import java.util.Scanner;
public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seconds ");
        int t = sc.nextInt();
        int hours  = t / 3600;
        int minutes = (t % 3600)/60;
        int seconds = t % 60;
        System.out.println(hours + " h " + minutes + " min " + seconds + " s");
    }
}
