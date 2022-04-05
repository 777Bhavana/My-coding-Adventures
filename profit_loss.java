
/**
 *  description of class profit_loss here.
 * it finds the percentage of loss-profit or neutral sale as per the
 * user entered cost and selling price
 * @Bhavana
 * @completed( date = 28/10/21)
 */
import java.util.Scanner;
public class profit_loss
{
    public static void main(String args[]){
        Scanner bhavana = new Scanner(System.in);
        double cp,sp,p,loss;
        System.out.println("Enter cost price");
        cp =bhavana.nextDouble();
        System.out.println("enter Selling price");
        sp =bhavana.nextDouble();
        if(cp<sp)
        {
            p=cp/sp*100;
            double a = sp-cp;
            System.out.println("\f profit = "+a);
            System.out.println(" profit percentage ="+ p +"%");
        }

        else
        {
            double b=cp-sp;
            loss=sp/cp*100;
            System.out.println("\f loss ="+ b);
            System.out.println("loss percentage ="+loss+"%");
        }
    bhavana.close();
    }

}

