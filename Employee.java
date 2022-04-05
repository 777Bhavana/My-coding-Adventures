import java.util.Scanner;
public class Employee {
   public static void main(String [] args){
      Scanner in =new Scanner(System.in)  ;
       float sal,da,hra,pf,DA,HRA,PF;
       System.out.println("Enter your Basic pay");
       sal=in.nextFloat();
       System.out.println("Enter rate of deduction/allowance of each of the following");
       System.out.println("Do not add % sign with the value");
       System.out.println("dearness allowance");
       da= in.nextInt();
       DA=sal*da/100;
       System.out.println("House rent allowance");
       hra= in.nextFloat();
       HRA = sal*hra/100;
       System.out.println(" provident fund ");
       pf= in.nextFloat();
       PF=sal*pf/100;
       double gross_pay , net_pay;
       gross_pay =sal+DA+HRA;
       net_pay= gross_pay-PF;
       System.out.println("GROSS PAY ="+gross_pay);
       System.out.println("NET PAY ="+net_pay);
       //works don't worry
       in.close();
    }
}

