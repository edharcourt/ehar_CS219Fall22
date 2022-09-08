import Utility.Investment;

import java.util.Scanner;

public class InvestmentCalculator {

    public static void main(String [] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Please enter initial deposit as decimal: ");
        double c = s.nextDouble();

        System.out.print("Please enter interest rate as a decimal: ");
        double r = s.nextDouble();

        System.out.print("Please enter number of years as an integer: ");
        int t = s.nextInt();

        System.out.print("Please enter number of times to compound per year as an integer: ");
        int n = s.nextInt();

        System.out.printf("Your investment is worth %.2f",
                Investment.investment(c,r,t,n));
    }
}
