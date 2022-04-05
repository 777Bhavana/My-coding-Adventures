    import java.util.Scanner;
    
    class CompundInterest
    {
        public static void main(String args[])
        {
            System.out.println('\u000C');
            double amount=0,principle,rate,time,ci,t=1,si=0;        
            Scanner sc= new Scanner(System.in);
            System.out.println("welcome to my compound / simple interest calculator");
            System.out.println("do as directed");
            System.out.println("enter principle ");
            principle=sc.nextDouble();
            System.out.println("enter rate");
            rate=sc.nextDouble();
            System.out.println("enter time");
            time=sc.nextDouble();    
            System.out.println("enter 1. for compound interest");
            System.out.println("enter 2. for simple   interest");
            int g=sc.nextInt();
            sc.close();
            switch(g) 
            {
                case 1:
                    rate=(1+rate/100);
                    int i=0;
                    while(i<time)
                    {
                        t=t*rate;
                        i++;
                    }
                    amount=principle*t;
                    System.out.println("amount="+amount);
                    ci=amount-principle;
                    System.out.println("compound interest="+ci);
                    break;
                case 2:
                    double amt=0;
                    si=principle*rate*time/100;
                    amt=principle-si;
                    System.out.println("simple interest="+si);
                    System.out.println("amt="+amt);
                    break;
                default:
                    System.out.println("wrong choice");
                        break;
    
            }
   
        }
}