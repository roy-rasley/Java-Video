import java.text.NumberFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
   // count words in string, count number of "The" in sentence, count number of letters in last word.
    Scanner input = new Scanner(System.in);
    String string = input.nextLine();

    StringTokenizer tokens = new StringTokenizer(string);
    //counts number of words in string
    int wordCount = tokens.countTokens();

    int theCounter = 0;

    int charInLastWord = 0;

    //counts number of times "the" shows up in string
    while(tokens.hasMoreTokens()){
        if(tokens.nextToken().equalsIgnoreCase("the"))
            theCounter++;
    }

    //count number of characters in last word of string
        var st = new StringTokenizer(string);
        var l = 0;
        while(st.hasMoreTokens()){ // this goes through the tokenizer until there are no more tokens past the one it is on and will then print out the length of said token
            l = st.nextToken().length();
        }
        System.out.println("The total number of words in the sentence is: "+wordCount);
        System.out.println("The total number of times THE occurs is "+ theCounter + " times.");
        if (string.endsWith(".")){
            l--;
        }
        System.out.println("The last word contains " + l + " letters");





        //System.out.println("The total number of characters in the last word is "+charInLastWord);




        }


    }

