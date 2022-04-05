
/**
 * Write a description of class five_three_divisibleNOT here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class five_three_divisibleNOT
{
    public static void main(int a)
    {
        if(a%3==0&&a%5==0)
        System.out.println("your no is: \n divisible by both 5 and 3 ");
        if(a%3!=0&&a%5==0)
        System.out.println("your no is: \n divisible by only by 5 ");
        if(a%3==0&&a%5!=0)
        System.out.println("your no is: \n divisible by only by 3 ");
        if(a%3!=0&&a%5!=0)
        System.out.println("your no is: \n divisible by nothing ");
    }
    
    
    }

