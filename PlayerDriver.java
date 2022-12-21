import java.util.*;
// Khiem Do
public class PlayerDriver {
    public static void main(String[] args){
        Player first = new Player("Sigma", 100, 10); // 1. set data for player1
        Player second = new Player("Beta", 50, 5);   // 2. set data for player2

        while (first.getHealth() > 0 && second.getHealth() > 0){
            System.out.println(first + "\t" + second);
            first.hit(second);
            second.hit(first);
        }
        System.out.println(first + "\t" + second);         
    }
}
