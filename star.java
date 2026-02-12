import java.util.Scanner;
public class star {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no:");
        int num = sc.nextInt();
        horizontal(num);
        vertical(num);

    }

    static void horizontal(int num) {
        for (int i = 1; i <= num; i++) {
            System.out.print("*");
        }

    }
    static void vertical(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("*");
        }
    }
}