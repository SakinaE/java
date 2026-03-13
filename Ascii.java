import java.util.Scanner;
public class Ascii {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the character:");
        char ch = sc.next().charAt(0);
        Ascii(ch);
    }

    public static void Ascii(char ch) {
        int Ascii = ch;
        System.out.println("Ascii value of " + ch + " is: " + Ascii);
    }
}