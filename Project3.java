//Khiem Do

import java.io.*;
import java.util.*;
public class Project3 {

    /* main */ public static void main(String[] args) throws IOException {
        String myWord = "";
        int score = 0;
        Scanner scnr = new Scanner(System.in);

        ArrayList<String> answers = new ArrayList<>();
        ArrayList<String> list = readFile("words.txt");  // create a list . by reading a file. call method 2

        Collections.shuffle(list);                               // list created and shuffle
        for (String i : list) {                                 // (i = 0, i <= list.size, i++) list.get(i)
            String word = i;                                   // Get every words in list.size
            if (wordChecking(word)) {                         // boolean. call method 3
                myWord = word;
            }
        }
        System.out.println("Make words of at least 4 letters");
        System.out.println(shuffled(myWord));                       // call method 4, print spaced and shuffled word
        System.out.println("Score: " + score + "\n");

        String input = scnr.next();
        // if input = bye, exit.
        while (!input.equalsIgnoreCase("bye")) {    // BYE statement
             if (input.equalsIgnoreCase("mix")) {   // MIX statement
                System.out.println("mixed :" + shuffled(myWord));      // call method 4
                System.out.println("Score: " + score + "\n");            
            } 
            else if (input.equalsIgnoreCase("ls")){     // LS (list) statement
                System.out.println("This is your list of word(s)\n"  + answers);
                System.out.println("Score: " + score + "\n");  
            }
            else if (list.contains(input)) {                      // ANY OTHER (valid) WORD statement
                if(!answers.contains(input)){                   
                    answers.add(input);                       
                    score = score + scoreWord(input);            // call method 5
                } else {
                    System.out.println("You already used this word, keep going.");    // same input case
                    System.out.println("Score: " + score + "\n");  
                }
                System.out.println("New Score: " + score + "\n");
            }
             else if (!list.contains(input)) {                    // ANY OTHER (invalid) WORD statement
                System.out.println("The word is not in the list, keep going.");   
                System.out.println("Score: " + score + "\n");         
            } 
            input = scnr.next();
        }
        System.out.println("See you later then, your final score is : " + score + "\n");
    }

    /* method 2 */ public static ArrayList<String> readFile(String fileName) throws FileNotFoundException {
        File file = new File(fileName);                                 // create file
        Scanner scnr = new Scanner(file);                              // reader reads file
        ArrayList<String> list = new ArrayList<>();                   // create new list of strings. EMPTY list
        while (scnr.hasNext()) {                                     // scan , if true >> add to list & keep going
            list.add(scnr.nextLine());
        }
        scnr.close();                                              // close reader
        return list;                                              // list of read strings
    }

    /* method 3 */ public static boolean wordChecking(String word) { // if one of the return is executed (in order 1,2,3), the method stops.
        if (word.length() != 7) {           // 1.
            return false;                                           // stop here if the return is executed, check next words
        }                                                          // if word.length == 7, mean above return isn't executed, run below loop
        for (int i = 0; i <= 6; i++) {     // 2.                 0   1   2   3   4   5   6
            char letterOne = word.charAt(i); //                      0   1   2   3   4   5
            for (int j = i + 1; j <= 6; j++) {
                char letterTwo = word.charAt(j);
                if (letterOne == letterTwo) {
                    return false;                             // stop if false
                }
            }
        }
        return true;                      // 3. last return. Return for the whole method
    }

    /* method 4 */ public static String shuffled(String myWord) {
        List<String> letters = Arrays.asList(myWord.split("")); // List. of char. splited by "". from the myWord
        Collections.shuffle(letters);
        String shuffled = "";
        for (String i : letters) {                                    // for (i = 0, i <= letter.size, i ++) a= letters.get(i)
            shuffled += i;                                           // from "" to "-------"
        }
        String spacedWord = shuffled.replaceAll("", "   ");
        return spacedWord;
    }

    /* method 5 */public static int scoreWord(String word){

        if(word.length() == 4){
            return 1;
            }
            else if (word.length() >= 5){                       // no need to comment
                return word.length();
            }
            return 0;
    }
}
// Due to MY OWN definition of readable, put statements in main method() is better. 