package pattern_printing.AllinOneMethod;

import java.util.Scanner;

public class LeftUpTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int nst=n;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
                System.out.print("* ");

            nst-=1;

            System.out.println(" ");
        }
    }
}
