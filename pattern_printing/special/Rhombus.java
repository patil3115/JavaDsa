package pattern_printing.special;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        //Method1: complex
//        for(int i=1;i<=n;i++)
//        {
//            for(int j=1;j<=n-i;j++)
//                System.out.print("  ");
//            for(int j=1;j<=i;j++)
//                System.out.print("* ");
//            for(int j=1;j<=n-i;j++)
//                System.out.print("* ");
//
//            System.out.println(" ");
//        }

        //Method 2:Optimized

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=n;j++)
                System.out.print("* ");

            System.out.println(" ");
        }
    }
}
