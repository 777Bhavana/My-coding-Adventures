
import java.util.Scanner;
public class equal_or_greater {
    public static void main(String[]args){
        int a,b,c;
        Scanner in = new Scanner(System.in);
        a= in.nextInt();
        b= in.nextInt();
        c=in.nextInt();
        if (a==b&&b==c)
            System.out.println("all your entered no. are equal");
        else
        {
            if(a>b&&a>c)
                System.out.println("the greater no. of three is ="+a);
            if( b>a&&b>c)
                System.out.println("the greater no. of three is ="+b);
            if(c>a&&c>b)
                System.out.println("the greater no. of three is ="+c);
        }
        in.close();
    }
}



