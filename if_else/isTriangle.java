package if_else;

import java.util.Scanner;

public class isTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter Side1: ");
        double s1=sc.nextDouble();

        System.out.print("Enter Side2: ");
        double s2=sc.nextDouble();

        System.out.print("Enter Side3: ");
        double s3=sc.nextDouble();

        if(s1+s2>s3 && s2+s3>s1 && s3+s1>s2)
            System.out.println("Can be a triangle.");
        else
            System.out.println("Can not be a triangle.");
    }
}
