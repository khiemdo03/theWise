import java.util.Scanner;
// Khiem Do
public class AveragePositive {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); 
      double enter;                             //assigned variables
      double sum;
      double quantity;
      sum = 0;
      quantity = 0;

      System.out.print("Enter a series of values (99999 to quit): "); 
      enter = scnr.nextInt();

      while (enter != 99999) {
         if (enter > 0) {
            sum = sum + enter;                       //searching for positive nums only
            quantity = quantity + 1;
         }
         enter = scnr.nextInt();
      }
      
      System.out.println("The average of the positive values is " + (sum / quantity)); 

   }
}