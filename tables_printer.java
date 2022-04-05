import java.util.Scanner;
public class tables_printer {
     public static void main(String[] args) 
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number you want the tables to be printed");
        int num = in.nextInt();
        System.out.println("Enter for how many iterations do you want the tables to printed");
        int x= in.nextInt();
        for(int i = 1 ; i<=x ; i++)
        {
            System.out.println(num + " * " + i + " = "+ num*i);
        }
        in.close();

    }
    
}
