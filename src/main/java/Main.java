import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int principal = 0;
        float interestRate = 0;
        int years = 0;
        Scanner scanner = new Scanner(System.in);
        //Gets need input from the user
        while(true){
        System.out.print("Principal ($1K-$1M):");
        principal = scanner.nextInt();
        if(principal>=1000 && principal<=1000000)
            break;
        System.out.println("Enter a value within the given parameters");
        }

        while(true){
            System.out.print("Annual interest rate: ");
            interestRate = scanner.nextFloat();
            if(interestRate>0&&interestRate<=30)
                break;
            System.out.println("Enter an interest rate within the given parameters");
        }

        while(true){
            System.out.print("Period (Years): ");
            years = scanner.nextInt();
            if(years>0&&years<=30)
                break;
            System.out.println("Enter a value greater than one year and less than 30 years");
        }

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
