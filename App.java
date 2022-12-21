import java.util.Scanner;

public class App {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      String passCode;

      passCode = scnr.next();
      boolean is_Letter;

      is_Letter = (Character.isLetter(passCode.charAt(0))) && (Character.isLetter(passCode.charAt((1))));
      if (Character.isLetter(passCode.charAt(0))) {
         System.out.print("Alphabetic at 0");
      }
      if (Character.isLetter(passCode.charAt(1))) {
         System.out.print("Alphabetic at 1");
      }
      if (is_Letter) {
         System.out.println("Alphabetic at 0");
         System.out.println("Alphabetic at 1");
      }
      
}     


}


