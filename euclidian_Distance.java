import java.util.Scanner;
public class euclidian_Distance {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        System.out.println("To find the eculidian Distance \n do as directed");
        double x1,y1,x2,y2,diffOFx,diffOFy, distance;
        System.out.println("Enter the vale of x1");
        x1 = in.nextFloat();
        System.out.println("Enter the value of y1");
        y1 = in.nextFloat();
        System.out.println("Enter the value of x2");
        x2 =in.nextFloat();
        System.out.println("Enter the value of y2");
        y2 =in.nextFloat();
        diffOFx = x2-x1;
        diffOFy = y2-y1;
        distance=Math.sqrt(Math.pow(diffOFx,2)+Math.pow(diffOFy,2));
        System.out.println("\f DISTANCE = "+distance);
        in.close();
    }
}
