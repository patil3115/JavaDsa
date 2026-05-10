package pattern_printing.special;

import java.util.Scanner;

public class VarFlippedTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
            {   //Method 1
//                if(i+j<=n)
//                    System.out.print("  ");
//                else
//                    System.out.print("* ");

                //Method 2...

                System.out.print("  ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
