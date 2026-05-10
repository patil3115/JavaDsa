package Basics;

import java.util.Scanner;

public class SquareofNumber {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no=sc.nextInt();

        int square=no*no;
        System.out.print("Square is: ");
        System.out.print(square);
    }
}
