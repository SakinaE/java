/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, a = 0, b = 1, c, i = 1;

        System.out.print("Enter number of terms: ");
        n = sc.nextInt();

        while (i <= n) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
    }
}
