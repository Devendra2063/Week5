import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = 'y';

        while (choice == 'y' || choice == 'Y') {
            System.out.println("\n\tWelcome to Nepal Investment Bank FD Calculator");

            // Input deposit
            System.out.print("Enter deposit amount (minimum Rs.1000): ");
            double P = sc.nextDouble();
            if (P < 1000) {
                System.out.println("Deposit must be at least Rs.1000.");
                continue;
            }

            // Input duration
            System.out.print("Enter duration of FD in years (maximum 5 years): ");
            int years = sc.nextInt();
            if (years > 5 || years <= 0) {
                System.out.println("Duration must be between 1 and 5 years.");
                continue;
            }

            double annualRate = 12.0;
            double monthlyRate = (annualRate / 100.0) / 12.0;
            int months = years * 12;
            double A = P * Math.pow(1 + monthlyRate, months);

            
            double feeRate = 0.005;
            double fee = A * feeRate;
            double finalAmount = A - fee;
            
            System.out.println("\n--- FD Calculation Result ---");
            System.out.printf("Annual Rate: %.2f%%%n", annualRate);
            System.out.printf("Monthly Rate: %.3f%n", monthlyRate);
            System.out.printf("FD Years: %d%n", years);
            System.out.printf("Months: %d%n", months);
            System.out.printf("Maturity Amount (A): Rs. %.2f%n", A);
            System.out.printf("Fee Rate: %.2f%%%n", feeRate * 100);
            System.out.printf("Processing Fee: Rs. %.2f%n", fee);
            System.out.printf("Final Amount: Rs. %.2f%n", finalAmount);


            
            System.out.print("\nDo you want to perform another FD calculation? (y/n): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("\nThank you for using Nepal Investment Bank FD Calculator!");
    }
}