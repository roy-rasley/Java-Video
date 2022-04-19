import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Gets need input from the user
        System.out.print("Principal:");
        Scanner scanner = new Scanner(System.in);
        int principal = scanner.nextInt();
        System.out.print("Annual interest rate: ");
        float interestRate = scanner.nextFloat();
        System.out.print("Period (Years): ");
        int years = scanner.nextInt();

        //calculations
        int p = principal;
        //yearly rate
        double i = interestRate;
        //monthly rate
        double m = interestRate/100/12;
        //number of payments
        int n = (years*12);

        //actual monthly payment calculation
        double mortgagePayment = principal * (m * Math.pow(1 + m, n))
                / (Math.pow(1 + m, n)-1);

        //p(m(1+m)^n)/((1+m)^n-1);


        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Your monthly mortgage payment is "+mortgageFormatted);


    }
}
