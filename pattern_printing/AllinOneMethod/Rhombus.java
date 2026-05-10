package pattern_printing.AllinOneMethod;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int nsp=n-1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
                System.out.print("  ");

            nsp-=1;

            for(int j=1;j<=n;j++)
                System.out.print("* ");

            System.out.println(" ");
        }
    }
}
