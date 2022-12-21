import java.util.Scanner;
//Khiem Do
public class midterm {
  public static void main(String[] args) {
     Scanner scnr = new Scanner(System.in);
    String input = scnr.next();
    char a = input.charAt(0);
     if (a == 'q'){
      System.exit(0);
     }
     int lbs = input.nextInt;
     boolean b = lbs >= 2 && lbs <= 19;
     boolean c = lbs >= 20 && lbs <= 40;
     boolean d = lbs >= 2 && lbs <=10;
     boolean e = lbs >= 11 && lbs <= 20;

     if (a == 'a') {
      if (b == true){
        System.out.println("3 cups per day");
      }else if (c){
        System.out.println("4 cups per day");
     } else {
      System.out.println("Do you have a dog?");
     }
     }
     if (a == 'p') {
      if (b == true){
        System.out.println("3 cups per day");
      }else if (c){
        System.out.println("4 cups per day");
     } else {
      System.out.println("Do you have a dog?");
     }
     
     }



    } 
  }
