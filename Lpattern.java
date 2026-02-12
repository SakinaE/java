import java.util.Scanner;

public class Lpattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int num = sc.nextInt();
        vertical(num);
        horizontal(num);
    }

    static void vertical(int num) {
        for (int i = 1; i <= num-1; i++) {
            System.out.println("*");
        }
    }

    static void horizontal(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("* ");
        }
    }
}
