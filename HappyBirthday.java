import java.util.Scanner;

public class HappyBirthday{
    public static void main (String[] args){
    Scanner input = new Scanner(System.in);

        System.out.print("When were you born? ");
        System.out.println("(use the form 1 January 2001) :");
        String DAY = input.next();
        String MONTH = input.next();
        String YEAR = input.next();
        
        System.out.println("Day: " + DAY);
        System.out.println("Month: " + MONTH);
        System.out.println("Year: " + YEAR);
    }
}
