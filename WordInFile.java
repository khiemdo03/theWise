import java.io.*;
import java.util.*;
// Khiem Do
public class WordInFile {
public static void main (String [] args) throws IOException { 
    Scanner input = new Scanner(System.in);
    System.out.print("What is the name of the file? ");                //Input to name file
    String filename = input.nextLine();
    System.out.print("What would you like to print to the file? ");     // Input to write into file
    String s = input.nextLine();
    File myFile = writeText(filename, s);                            //a created file contained a method (2)
    int numWords = countWord(myFile);                                // a created int contained a method (3)
    System.out.println(filename + " contains " + numWords + " word(s)");
    /*
     * to have numWord
     * get method countWord(myFile) method 3
     * to have method 3
     * get method writeText(filename,s) method 2
     */
} 

public static File writeText(String filename, String s /* this string name doesnt matter, line 11 matter */) throws IOException{   //(2) Writer
    File file = new File(filename);                 //new file created named by line 8
    PrintWriter outFS = new PrintWriter(file);                       
    outFS.println(s);                                                       // write from line 10
    outFS.close();
    return file;                            // returned with // named created file // and contents inside the file
}

public static int countWord(File f/*this file doesnt matter, line 12 matter */) throws FileNotFoundException {   //(3) Reader
    int wc = 0;
        Scanner Reader = new Scanner(f);     // (f) is myFile from line 12
        while (Reader.hasNext()) {           // hasNext() is boolean, not jumping
            String nextWord = Reader.next();        // next() is jumping to another
            wc++;
        } 
        Reader.close();
        return wc;
} 
}
// My comments explain in the way that I understand how the coding works, not how it should be explained. Thank you



