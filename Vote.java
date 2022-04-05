import java.util.*;
class vote
{
    public static void main(String args[])
    {
        {
            System.out.println('\u000C');
            Scanner sc= new Scanner(System.in);
            int Your_age;
            Your_age=sc.nextInt();
            if(Your_age>17)
                System.out.println("you are eligible to vote");
            else
                System.out.println("you are not  eligible to vote");
                sc.close();
        }
    }
}