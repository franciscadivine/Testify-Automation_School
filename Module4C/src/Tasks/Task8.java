package Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        // Code to calculate Simple Interest
        //Simple interest = Principal * Rate * Time / 100
        Scanner interestCalculator = new Scanner(System.in);

        System.out.print("Please enter the principal amount: ");
        double principal = interestCalculator.nextDouble();

        System.out.print("Please enter the rate of interest: ");
        double rate = interestCalculator.nextDouble();

        System.out.print("Please enter the time (in years): ");
        double time = interestCalculator.nextDouble();

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Simple Interest is: " + simpleInterest);

        interestCalculator.close();
    }
}
