
/**
 * Write a description of class greatest_of_3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class greatest_of_three
{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your three no. one by one");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("the greatest of three no. is "+a);
        if(b>a&&b>c)
            System.out.println("the greatest of three no. is "+b);
        if(c>a&&c>b)
            System.out.println("the greatest of three no. is "+c);
sc.close();
    }
}
