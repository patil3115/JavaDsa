package pattern_printing.special;

import java.util.Scanner;

public class AllinOneMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int nsp=n-1, nst=1;

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= nsp; j++)
                System.out.print("  ");

            nsp -= 1;

            for (int j = 1; j <= nst; j++)
                System.out.print("* ");

            nst += 2;

            System.out.println(" ");

        }
    }
}
