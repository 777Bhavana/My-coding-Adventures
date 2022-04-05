import java.util.*;
public class gas_laws_programs {
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("choose your option");
        System.out.println("to find constant with Boyle's Law's P1v1 = P2V2 = K");
        System.out.println("to find constant with Charles Law's v1/t1 = v2/t2 = k");
        System.out.println("to find the constant with GAS EQUATION p1*v1/t1 =p2*v2/t2 ");
        String ch,ch2;
        ch =in.next();
        double p1 =0,v1 = 0,p2,v2,t1 = 0,t2;
        switch (ch) {
            case "1" :
                System.out.println("to find constant with Boyle's Law's P1v1 = P2V2 = K");
                System.out.println("What do you want to keep as x constant enter that as lower case letter followed by 1or2 like p1 p2 v1 v2 t1 t2");
                System.out.println("p1\np2\nv1\nv2");
                System.out.println("enter the other values in STP conditions only \n in this order p1,v1,p2,v2\n your chosen constant value will be ignored;");
                 ch2 =in.next();
                if(ch2.equals("p1")){
                    v1 = in.nextDouble();
                    p2= in.nextDouble();
                    v2= in.nextDouble();
                    p1 =(p2*v2)/v1;
                System.out.println("value of preassure 1 ="+p1);
            }
                if (ch2.equals("v1")){
                    p1 = in.nextDouble();
                    p2= in.nextDouble();
                    v2= in.nextDouble();
                    v1 =p2*v2/p1;
                System.out.println("value of Volume  1 ="+v1);
            }
                if(ch2.equals("p2")){
                    p1 = in.nextDouble();
                v1 = in.nextDouble();
                v2= in.nextDouble();
                p2 =p1*v1/v2 ;
                System.out.println("value of preassure 2 ="+p2);
            }
                if(ch2.equals("v2")){
                    p1 = in.nextDouble();
                v1= in.nextDouble();
                p2= in.nextDouble();
                v2= p1*v1/p2;
                System.out.println("value of volume 2 ="+v2);
            }
                break;
            case "2":
                System.out.println("to find constant with Charles Law's v1/t1 = v2/t2 = k");
                System.out.println("What do you want to keep as x constant enter that as lower case letter followed by 1or2 like p1 p2 v1 v2 t1 t2");
                System.out.println("t1\nt2\nv1\nv2");
                ch2 =in.next();
                System.out.println("enter the other values in STP conditions only \n in this order t1,v1,t2,v2\n your chosen constant value will be ignored;");
                if(ch2.equals("t1"))
                {    
                v1 = in.nextDouble();
                t2= in.nextDouble();
                v2= in.nextDouble();
                t1 =v2/t2*v1;
                System.out.println("value of tempature 1 ="+t1);
            }
                if(ch2.equals("v1")){
                    t1 = in.nextDouble();
                t2= in.nextDouble();
                v2= in.nextDouble();
                v1 = v2/t2*t1;
                System.out.println("value of volume1 ="+v1);
            }
                if(ch2.equals("v2")){
                    t1 = in.nextDouble();
                v1= in.nextDouble();
                t2= in.nextDouble();
                v2 =v1/t1*t2;
                System.out.println("value of volume2 ="+v2);
            }
                if(ch2.equals("t2")){
                    t1= in.nextDouble();
                v1= in.nextDouble();
                v2= in.nextDouble();
                t2= t1*v2/v1;
                System.out.println("value of temperature 2 ="+t2);
            }
                break;
            case "3":
                System.out.println("to find the constant with GAS EQUATION p1*v1/t1 =p2*v2/t2 ");
                System.out.println("the values should be entered in the order t1 v1 t2 v2 p1 p2 in stp conditions only");
                System.out.println("enter your constant value as p1 t1 v1 t2 v2 p1 p2  only no upper case or spaces");
                ch2 = in.next();
                if(ch2.equals("p1")){
                t1 = in.nextDouble();
                v1 = in.nextDouble();
                t2= in.nextDouble();
                v2= in.nextDouble();
                p2= in.nextDouble();
                p1 =p2*v2*v1/t2*t1;
                System.out.println("p1 ="+p1);}

                if(ch2.equals("p2")){
                    t1 = in.nextDouble();
                v1 = in.nextDouble();
                t2= in.nextDouble();
                v2= in.nextDouble();
                p1= in.nextDouble();
                p2= (p1*v1*t2)/(t1*v2);
                System.out.println("p2 ="+p2);}

                if (ch2.equals("v1")){
                    t1 = in.nextDouble();
                t2= in.nextDouble();
                v2= in.nextDouble();
                p1= in.nextDouble();
                p2= in.nextDouble();
                v1 =(p2*v2*t1)/(t2*p1);
                System.out.println("v1 ="+v1);
            }

                if(ch2.equals("v2")){
                    t1 = in.nextDouble();
                v1 = in.nextDouble();
                t2= in.nextDouble();
                p1= in.nextDouble();
                p2= in.nextDouble();
                v2=(p1*v1*t2)/(t1*p2);
                System.out.println("v2 ="+v2);}

                if(ch2.equals("t1")){
                v1 = in.nextDouble();
                t2= in.nextDouble();
                v2= in.nextDouble();
                p1= in.nextDouble();
                p2= in.nextDouble();
                t1=(p2*v2)/(t2*p1*v1);
                System.out.println("t1 ="+t1);
            }

                if (ch2.equals("t2")){
                t1 = in.nextDouble();
                v1 = in.nextDouble();
                v2= in.nextDouble();
                p1= in.nextDouble();
                p2= in.nextDouble();
                t2 =(p1*v1)/(t1*p2*v2);
                System.out.println("t2 ="+t2);
            }
                break;
            default:
                System.out.println('\u000C');
                System.out.println("wrong input\n program terminates");
                break;
             }

        in.close();
    }
}
