import java.util.Scanner;
public class greetings {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your time without minutes in 24hr format only");
        int time ,cr = 0;
        time= in.nextInt();
        if(time<=4)
          cr = 1;//go to sleep
        if (time>=5 && time<=11)
            cr= 2;// gm
        if (time>=12&&time<=17)
            cr=3;//ga
        if (time>=18&&time<=19)
            cr=4;//ge
        if (time>=20&&time<24)
            cr=5;//gn
        switch (cr) {
            case 1:
                System.out.println("GO TO SLEEP IT\'S MIDNIGHT");
                break;
            case 2:
                System.out.println("GOOD MORNING");
                break;
            case 3:
                System.out.println("GOOD AFTERNOON");
                break;
            case 4:
                System.out.println("GOOD EVENING");
                break;
            case 5:
                System.out.println("GOOD NIGHT");
                break;
            default:
                System.out.println("You have entered the wrong option \n The Program terminates\n BYEE!!!!!!!!!!!");
                break;
        }
        in.close();
    }
}
