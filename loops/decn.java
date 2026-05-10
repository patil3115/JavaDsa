package loops;

import java.util.Scanner;

public class decn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter first digit to print: ");
        int a=sc.nextInt();

        System.out.print("Enter the common difference: ");
        int d=sc.nextInt();

        for(int i=a;i>=0;i-=d)
        {
            System.out.print(i+" ");
        }
    }
}
