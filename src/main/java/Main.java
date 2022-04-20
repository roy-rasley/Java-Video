import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Gets need input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int number = scanner.nextInt();

        //if statement for fizz, and buzz
        if (number%5 == 0 && number%3 ==0){
            System.out.println("fizzbuzz");
        } else if (number%5 == 0) {
            System.out.println("fizz");
        }else if (number%3 == 0){
            System.out.println("buzz");
        }else{
            System.out.println(number);
        }

    }
}
