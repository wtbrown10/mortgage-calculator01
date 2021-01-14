package com.will;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final byte MonthsInYears = 12;
        final byte Percent = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
//        System.out.println("Your principal is " + principal);

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
//        System.out.println("Your interest rate is " + interest);
        float monthlyInterest = interest / Percent / MonthsInYears;

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
//        System.out.println("Your Period is " + period + " years!");

        long mortgage = Math.round(principal * ((monthlyInterest * (Math.pow((1 + monthlyInterest), period))) / (Math.pow((1 + monthlyInterest), period) - 1))) ;
        String mortgageFormated = NumberFormat.getCurrencyInstance().format(mortgage);

        System.out.print("Mortgage: " + mortgageFormated);
    }
}
