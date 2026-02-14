import java.util.Scanner;

public class Char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an ASCII value: ");
        int ascii = sc.nextInt();

        printChar(ascii);
    }

    public static void printChar(int ascii) {
        char ch = (char) ascii;
        System.out.println("Character for ASCII value " + ascii + " is: " + ch);
    }
}