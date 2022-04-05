import java.util.Scanner;
public class Budget {
    public static void main(String args[]){
        Scanner sc =new Scanner (System.in) ;
        System.out.println('\u000C');
        System.out.println("welcome to budget calC \n Enter your Monthly income");
        double  mi,rent,fb,sch,ebw,inte,sal,mis,total_expenses;
        mi = sc.nextDouble();
        System.out.println("enter your your monthly rent \\ home loan EMI if any else type in 0.0");
        rent=sc.nextDouble();
        System.out.println("Enter your expenses on F&B");
        fb=sc.nextDouble();
        System.out.println("Enter your  school and ed expenses");
        sch=sc.nextDouble();
        System.out.println("Enter your bill of water and electricity combined");
        ebw= sc.nextDouble();
        System.out.println("enter your internet carrier and tv cable bill");
        inte=sc.nextDouble();
        System.out.println("any salary of home employed workers");
        sal=sc.nextDouble();
        System.out.println("any other miscellaneous expenses");
        mis=sc.nextDouble();
        System.out.println();
        System.out.println('\u000C');
        total_expenses= rent+fb+sch+ebw+inte+sal+mis;
        double outmoney=mi-total_expenses;
        System.out.println("your budget over view :");
        // double  mi,rent,fb,sch,ebw,inte,sal,mis,total_expenses;
        System.out.println(mi+"your monthly income");
        System.out.println();
        System.out.println(rent+"rent");
        System.out.println(fb+"grocery");
        System.out.println(sch+"school and tuition fee");
        System.out.println(ebw+"Electricity and Water");
        System.out.println(inte+"internet bill\\cable");
        System.out.println(mis+"other expenses");
        System.out.println();
        System.out.println(total_expenses+"total money spent this month");
        System.out.println(outmoney+"remaining money left this month");
        System.out.println("SAVE MONEY >>>>>>> RETIRE HAPPY");
        System.out.println("BYE!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        sc.close();
    }
}
