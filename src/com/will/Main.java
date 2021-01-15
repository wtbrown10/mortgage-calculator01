package com.will;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        final byte MonthsInYears = 12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);
        int principal = 0;
        while (true) {
            System.out.print("Principal: ");
            principal = scanner.nextInt();

            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a value between 1,000 and 1,000,000!");
        }

        float interest = 0;
        float monthlyInterest = 0;

        while (true) {
            System.out.print("Annual Interest Rate: ");
            interest = scanner.nextFloat();


            if (interest >= 1 && interest <= 30) {
                monthlyInterest = interest / Percent / MonthsInYears;
                break;
            }

            System.out.println("Enter a value between 1 and 30!");
        }

        int period = 0;
        long mortgage = 0;
        String mortgageFormated = "";
        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextInt();

            if (period >= 1 && period <= 30) {
                mortgage = Math.round(principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), period))) / (Math.pow((1 + monthlyInterest), period) - 1)));
                mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);
                System.out.print("Mortgage: " + mortgageFormated);
                break;
            }
            System.out.println("Enter a number between 1 and 30!");
        }
    }
}
