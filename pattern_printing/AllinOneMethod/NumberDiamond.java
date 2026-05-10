package pattern_printing.AllinOneMethod;

import java.util.Scanner;

public class NumberDiamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int nsp=n-1,nst=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp;j++)
                System.out.print("  ");

            nsp-=1;

            for(int j=1;j<=nst;j++)
                System.out.print(i+" ");

            nst+=2;

            System.out.println(" ");
        }

        int Nsp=1,Nst=2*n-3;

        for(int i=n-1;i>=1;i--)
        {
            for(int j=1;j<=Nsp;j++)
                System.out.print("  ");

            Nsp+=1;

            for(int j=1;j<=Nst;j++)
                System.out.print(i+" ");

            Nst-=2;

            System.out.println(" ");
        }
    }
}
