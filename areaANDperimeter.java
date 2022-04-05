import java.util.*;// to find area&perimeter
public class areaANDperimeter
{
public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
System.out.println('\u000C');
    int l,b,p,ar;
System.out.println("enter the length");
    l=in.nextInt();
    System.out.println("enter the breadth");
b=in.nextInt();
p=2*(l+b);
ar=l*b;
 System.out.println("areaANDperimeter of the retangle="+p);
 System.out.println("area of the retangle="+ar);
 in.close();
}
}
