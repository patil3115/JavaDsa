package pattern_printing.AllinOneMethod;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        int nsp1=n-1,nst1=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp1;j++)
                System.out.print("  ");

            nsp1-=1;

            for(int j=1;j<=nst1;j++)
                System.out.print("* ");

            nst1+=2;

            System.out.println(" ");
        }

        int nst2=2*n-3,nsp2=1;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nsp2;j++)
                System.out.print("  ");

            nsp2+=1;

            for(int j=1;j<=nst2;j++)
                System.out.print("* ");

            nst2-=2;

            System.out.println(" ");
        }
    }
}
