import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Please enter your age:");
      Scanner scanner = new Scanner(System.in);
      byte age = scanner.nextByte();
        System.out.println("You are "+ age);
    }
}
