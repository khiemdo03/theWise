import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class CardGame{
   public static void main(String [] args) {
      Scanner scnr = new Scanner(System.in);
      
     List<String> rank = new ArrayList<String>();
      rank.add("2");
      rank.add("3");
      rank.add("4");
      rank.add("5");
      rank.add("6");
      rank.add("7");                                                                //Put ranks into a box
      rank.add("8");
      rank.add("9");
      rank.add("10");
      rank.add("J");
      rank.add("Q");
      rank.add("K");
      rank.add("A");  
      
   
      List<String> suit = new ArrayList<>();
      suit.add("D");
      suit.add("S");
      suit.add("H");
      suit.add("C");
      suit.add("d");                                                                     //Put suits into a box
      suit.add("s");
      suit.add("h");
      suit.add("c");

      System.out.print("Please enter 3 cards: ");

      String card_1 = scnr.next();
      String card_2 = scnr.next();                                                              // Ask for 3 cards
      String card_3 = scnr.next();

      String rank_card_1 = card_1.substring(0, card_1.length() - 1);
      String suit_card_1 = card_1.substring(card_1.length() - 1, card_1.length());
      String rank_card_2 = card_2.substring(0, card_2.length() - 1);       // Clarify positions of "rank" && "suit" on each card
      String suit_card_2 = card_2.substring(card_2.length() - 1, card_2.length());
      String rank_card_3 = card_3.substring(0, card_3.length() - 1);
      String suit_card_3 = card_3.substring(card_3.length() - 1 , card_3.length());
      
      for (int i = 0; i < rank.size(); i++) {
         if (!rank.contains(rank_card_1)) {
            System.out.println(card_1 + " has an invalid rank. Exiting... ");
            System.exit(0);
         }                                                                                  //Card 1 check validity
         else if (!suit.contains(suit_card_1)){
            System.out.println(card_1 + " has an invalid suit. Exiting...");
            System.exit(0);
         }
       }
       for (int i = 0; i < rank.size(); i++) {
         if (!rank.contains(rank_card_2)) {
            System.out.println(card_2 + " has an invalid rank. Exiting... ");
            System.exit(0);
         }                                                                                //Card 2 check validity
         else if (!suit.contains(suit_card_2)){
            System.out.println(card_2 + " has an invalid suit. Exiting...");
            System.exit(0);
         }
       }
       for (int i = 0; i < rank.size(); i++) {
         if (!rank.contains(rank_card_3)) {
            System.out.println(card_3 + " has an invalid rank. Exiting... ");
            System.exit(0);
         }                                                                                 //Card 3 check validity
         else if (!suit.contains(suit_card_3)){
            System.out.println(card_3 + " has an invalid suit. Exiting...");
            System.exit(0);
         }
       }

       int int_rank_1 = Integer.parseInt(rank_card_1);
       int int_rank_2 = Integer.parseInt(rank_card_2);                                              //Convert string into #s
       int int_rank_3 = Integer.parseInt(rank_card_3); 
      
       if ((int_rank_1 >= int_rank_2) && (int_rank_1 >= int_rank_3)){
         if(int_rank_2 > int_rank_3) {
         System.out.println("Player 2 plays the " + card_2);                                     // Return the win for Player 1 aka Card_1
       } else if(int_rank_2 < int_rank_3) {
         System.out.println("Player 2 plays the " + card_3);
       }
       System.out.println("Player 1 wins the round"); 
      }

       if ((int_rank_1 < int_rank_2) || (int_rank_1 < int_rank_3)) {
         if ((int_rank_3 <= int_rank_2) && (int_rank_1 <= int_rank_2) ) {
            System.out.println("Player 2 plays the " + card_2);
         } else if((int_rank_2 <= int_rank_3) && (int_rank_3 >= int_rank_1)) {                                            // Return the win for Player 2 aka Card_2 || Card_3
            System.out.println("Player 2 plays the " + card_3);
         } else if((int_rank_1 <= int_rank_3) && (int_rank_3 <= int_rank_2) && (int_rank_1 <= int_rank_2)) {
            System.out.println("Player 2 plays the " + card_3);
         }
         System.out.println("Player 2 wins the round");
       }
   }
}
      
 
      