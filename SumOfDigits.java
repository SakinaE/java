/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, sum = 0;

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num > 0) {
            sum = sum + (num % 10); 
            num = num / 10;         
        }

        System.out.println("Sum of digits = " + sum);
    }
}
