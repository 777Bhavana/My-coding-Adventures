import java.util.Scanner;
import java.lang.Math;
public class calculating_powers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base no.");
        double x=sc.nextInt();
        System.out.println("Enter your exponential no.");
        double y=sc.nextInt();
        double answer =Math.pow(x,y);
        System.out.println(x+"to the power "+y+" = "+answer);
        sc.close();
    }
}

