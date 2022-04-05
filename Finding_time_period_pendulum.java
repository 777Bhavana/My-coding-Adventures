
import java.util.*;
public class Finding_time_period_pendulum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double g,t,pi,l;
        System.out.println("this calculates the time period of a pendulum(simple)");
        System.out.println("Do as directed");
        System.out.println("Enter the value of \'g\' [acceleration due to gravity]");
        g=in.nextDouble();
        System.out.println("enter the length");
        l=in.nextDouble();
        pi=3.14;
        t=2*pi*Math.sqrt(l/g);
        System.out.println("the value of t(time period ) is ="+t);
        in.close();
    }
}
