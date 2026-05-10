package Basics;
import java.util.Scanner;

public class VolumeofSpehere {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter radius: ");
        double r=sc.nextDouble();
        double pie=3.14;

        double volume=(4/3)*pie*r*r*r;
        System.out.print("Volume is: ");
        System.out.println(volume);
    }
}
