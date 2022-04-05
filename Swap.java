import java.util.*;
class SWAP
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int a,b,c;
        System.out.println('\u000C');
        System.out.println("Enter your no.");
        System.out.println("enter 'a' value");
        a=in.nextInt();
        System.out.println("enter 'b' value");
        b=in.nextInt();
        c=a;
        a=b;
        b=c;
        System.out.println("value of A ="+a);
        System.out.println("value of B ="+b);
        in.close();
    }
}
