import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * Write a description of class leloo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class leloo
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int x = in.nextInt();
        int mark =0, avg=0;
        int b[] =new int[x];
        for (int i =1 ;i<=x;i++)
        {
            System.out.print("Math : ");
            int m =in.nextInt();
            System.out.print("comp : ");
            int c= in.nextInt();
            mark =(m+c)/2;
            b[i]= mark;
        }
        for(int y=1;y==x;y++)
        avg=b[y]+avg;

        avg=avg/x;
        System.out.println("Average marks of the class = "+avg);
    }

}
