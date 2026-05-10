package if_else;
import java.util.Scanner;

public class DrivingLicence{
    public static void main(String Args[]){
        System.out.print("Enter Age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if(age>=18)
            System.out.print("Can drive.");
        else
            System.out.print("Can't drive.");
    }
}