package if_else;
import java.util.Scanner;

public class ProfitLoss {
    public static void main(String Args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Cost Price: ");
        double cp=sc.nextDouble();

        System.out.println("Enter Selling Price: ");
        double sp=sc.nextDouble();

        if(cp<sp)
        {
            double profit=sp-cp;
            double perprofit=(profit/cp)*100;
            System.out.println("Seller made "+perprofit+"% which is Rs. "+profit);
        } else if (cp>sp)
        {
            double loss=cp-sp;
            double perloss=(loss/cp)*100;
            System.out.println("Seller made "+perloss+"% which is Rs. "+loss);
        } else
        {
            System.out.println("Seller has not made any profit or any loss.");
        }
    }
}
