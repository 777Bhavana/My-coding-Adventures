import java.util.*;
public class loop {
     public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       int no_pos=0,n,sum_pos=0,no_neg=0,sum_neg=0;
       System.out.println("Enter your no. one by one");
       for(int i=1;i<=50;i++){
            n =in.nextInt();
           if (n>0)
           { no_pos =no_pos+1;
            sum_pos=sum_pos+n;}

           else{
           no_neg=no_neg+1;
           sum_neg=sum_neg+n;}
       }
       System.out.println("No of pos no. = "+no_pos);
       System.out.println("no of neg no = "+no_neg);
       System.out.println("sum of pos ="+sum_pos);
       System.out.println("Sum of neg ="+sum_neg);
       in.close();
    }     
    
}
