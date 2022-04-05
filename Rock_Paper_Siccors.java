import java.util.Scanner;
// error 
public class Rock_Paper_Siccors
{
    static int times=0;
 public static void play()
 {
    
    String user,computer="7";
     Scanner in = new Scanner(System.in);
    //for assigning a value to var user
    System.out.println("Enter \'p\' or \'s\' or \'r\' for rock papers or siccors \n");
    user  = in.next();

    // for assigning a random value of p r s to var computer
    int rand = (int)(Math.random()*3)+1;
    if (rand == 1)
        computer = "s";
    if (rand == 2)
        computer ="r";
    if (rand == 3)
        computer = "p";
        
    String is_win  = is_win(user, computer);
    if (is_win =="It\'s a tie")
    System.out.println("It\'s a tie");
    if (is_win == "TRUE")
    {
    System.out.println("YOU won!!!!!!!!!!!!!!!!");
    times=times+1;
    }
    if (is_win == "FALSE")
    System.out.println("the computer won");
    in.close();

    
 }
 public static String  is_win( String you, String opp)
{
    String win;
    if (you == opp)
    win ="It\'s a tie";
    // r > s, s > p, p > r
    if ((you == "r"&&opp=="s") || (you=="s"&&opp=="p")|| (you=="p" && opp=="r"))
    win ="TRUE";
    else 
    win = "FALSE";
    return win;
}

public static void main(String[] args) 
    
 {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of rounds you wanna play");
    int round =in.nextInt();
    for (int i=1; i<=round;i++)
    {
        play();
    }
    System.out.println("your score = "+times);
    in.close();
  }
}
