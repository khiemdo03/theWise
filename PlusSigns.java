import java.util.*;
// Khiem Do

public class PlusSigns {
    public static int getMax(char[][] input) {
        int i;
        int j;
        Scanner scnr = new Scanner(System.in);
        char plus = '+';
        int left2right = 0;
        int up2down = 0;
        int max = 0;

        for (i = 0; i < input.length; i++) {    // i = horizontal
            left2right = 0;                  
            up2down = 0;
            for (j = 0; j < input[i].length; j++) {             // j = vertical   
                if (input[i][j]==(plus)){
                    left2right ++;
                }        
                if(input[j][i] == plus){
                    up2down++;
                }
            }
            if (left2right > max){
                max = left2right;
            }
            if (up2down > max){
                max = up2down;
            }
        }
        return max;

    }
    public static void main(String[] args) {
        char[][] input = {
                { '+', '-', '-', '-', '+', '+', '-', '+', '-', '-' },
                { '-', '-', '+', '-', '-', '+', '+', '+', '-', '+' },
                { '+', '+', '-', '-', '-', '+', '-', '+', '+', '-' },
                { '+', '-', '-', '+', '-', '+', '-', '+', '-', '+' },
                { '-', '-', '-', '+', '-', '+', '+', '+', '-', '+' },
                { '+', '+', '+', '-', '+', '+', '-', '+', '+', '-' },
                { '-', '-', '+', '+', '-', '+', '+', '+', '-', '+' },
                { '+', '+', '-', '-', '+', '+', '-', '-', '-', '-' },
                { '-', '+', '+', '-', '-', '+', '-', '+', '-', '+' },
                { '-', '+', '+', '+', '-', '+', '-', '-', '-', '-' }
        };
        System.out.println(getMax(input));

    }
}