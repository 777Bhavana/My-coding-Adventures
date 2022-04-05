
/**
 * Write a description of class pos_neg here.
 *to find if a number is positive or negative
 * @author BHAVANA
 * @version 5-11-21
 */
import java.util.Scanner;
public class pos_neg {
    public static void main(String args[]){
        Scanner in = new Scanner (System.in);
        System.out.println('\u000C');
        System.out.println("Enter your no.");
        double a= in.nextDouble();
        if (a>0)
            System.out.println("your no. entered is positive");
        else
            System.out.println("your no. entered is negative");
            in.close();
    }
}

