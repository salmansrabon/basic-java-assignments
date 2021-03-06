package ifelse_for_loop;

import java.util.Scanner;

// Write a program to check balance and withdraw money from ATM booth using switch case and if else

public class Program_04 {
    public static void main(String[] args) {
        int PIN = 1234;
        double balance = 5000;
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw balance");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                int count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter your PIN");
                    int pin = scanner.nextInt();
                    if (PIN == pin) {
                        System.out.println("Balance is " + balance + " Tk");
                        break;
                    } else {
                        System.out.println("Wrong PIN inserted");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                }
                break;
            case 2:
                count = 0;
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Enter your PIN");
                    int pin = scanner.nextInt();
                    if (PIN == pin) {
                        System.out.println("Input amount that multiply by 500");
                        int amount = scanner.nextInt();
                        if (amount <= balance && amount % 500 == 0) {
                            balance -= amount;
                            System.out.println("Withdraw successful. Your current balance is " + balance + " Tk");
                            break;
                        } else if (amount > balance) {
                            System.out.println("Not enough balance. Please input valid amount");
                        } else {
                            System.out.println("Balance is not multiply by 500. Please try with another amount");
                        }
                    } else if (PIN != pin) {
                        System.out.println("Wrong PIN inserted");
                    } else if (count >= 3) {
                        System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                    }
                    count++;

                }
                if (count >= 3) {
                    System.out.println("You have entered wrong PIN more than 3 times. Card has blocked.");
                }
                break;
            default:
                System.out.println("Please select option either 1 or 2");

        }
    }
}
