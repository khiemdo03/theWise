import java.util.Scanner;
// Khiem Do

public class LoanEligible {
   public static void main (String [] args) {

      Scanner scan = new Scanner(System.in);

      System.out.println("What is the loan amount?");                      //asking for loan amount
      int loan_amount = scan.nextInt();                                        // input for loan amount
      System.out.println("What is the down payment?");                      //asking for down payment
      int down_payment = scan.nextInt();                                        //input for down payment

      if (down_payment >= loan_amount * 0.2){                           //calculate for at least 20%
         System.out.println("You are eligible for this loan.");          //eligibled
      } else {                                                            //if not, keep asking

      System.out.println("Have you held your current job for at least a year?"); //asking for working period
      String yes_no = scan.next();                                               // input for working period
      String a = "yes";                                                        // object for input
      String b = "no";                                                           // object for input
      System.out.println("What is your annual salary?");                     //asking for annual salary
      int salary = scan.nextInt();                                       //input for annual salary

      if (yes_no.equals(a) && salary >= loan_amount * 0.5){              // if both conditions are true, thus eligible
         System.out.println("You are eligible for this loan.");       // eligibled
      } else {                                                          //if 1 of 2 conditions are false, thus not eligible
         System.out.println("You are not eligible for this loan.");  //keep  working  bro  !!!
      }
   }
   }
   }