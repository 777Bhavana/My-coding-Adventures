import java.util.Scanner;
public class Number_Guessing_game 
{
    public static int baby()
    {
        Scanner in = new Scanner(System.in);
        int guess=0,score=0,ran,x=10;
        
        ran =(int)(Math.random()*x)+1;
        while(guess!=ran)
        {
            System.out.println("Enter you Guess");
            guess =in.nextInt();
            score+=1;
            if(guess>x || guess<1) 
            System.out.println("PLEASE ENTER WITHIN THE RANGE");
            if(guess>ran)
            System.out.println("The numer is lower than this");
            if(guess<ran)
            System.out.println("the number is higher than this");
        }
        System.out.println("Yayy you guessed the no right in "+score + "attempts");
        in.close();
        return score;
    }

    // some error in this method
    // but this does'nt affect the code though ^-^
                                                 
    public static void cond()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Do you wanna continue \nEnter (1) for yes (2) for no");
        int yn =in.nextInt();
        if (yn==1)
        baby();
        else
        System.out.println("Alvida bye sayonara");
        in.close();
    }
    public static void main(String[] args)
    {
        baby();
        
    } 


}
