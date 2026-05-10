package pattern_printing.special;

import java.util.Scanner;

public class BinaryTri {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                //Method 1

                if((i+j)%2==0)
                    System.out.print(1+" ");
                else
                    System.out.print(0+" ");

                //Method 2
//                if(i%2!=0 && j%2!=0)
//                    System.out.print(1+" ");
//                else if(i%2==0 && j%2!=0)
//                    System.out.print(0+" ");
//                else if(i%2==0 && j%2==0)
//                    System.out.print(1+" ");
//                else if(i%2!=0 && j%2==0)
//                    System.out.print(0+" ");
            }
            System.out.println(" ");
        }
    }
}
