package if_else;

import java.util.Scanner;

public class isFourDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int no=sc.nextInt();

        if(no>999 && no<=9999) System.out.println("Number is four digit.");
        else System.out.println("Number is not four digit.");
    }
}
