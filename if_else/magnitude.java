package if_else;

import java.util.Scanner;

public class magnitude {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int no=sc.nextInt();

        if(no<0) no=-(no);
        if(no<69) System.out.println("Magnitude is smaller than 69.");
        else if(no>69) System.out.println("Magnitude is greater than 69.");
        else System.out.print("Magnitude is 69.");
    }
}
