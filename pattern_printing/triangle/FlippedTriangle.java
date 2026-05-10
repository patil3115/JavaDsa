package pattern_printing.triangle;

import java.util.Scanner;

public class FlippedTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        //Method 1...using calculations
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //Method 2...when calculations are not possible or to complex, take a extra variable

        int a=n;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print("* ");
            }
            a--;
            System.out.println(" ");
        }
    }
}
