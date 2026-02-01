import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        int p = sc.nextInt();

        System.out.print("Enter Time (in years): ");
        int t = sc.nextInt();

        System.out.print("Enter Rate of Interest: ");
        int r = sc.nextInt();

        int si = (p * t * r) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
