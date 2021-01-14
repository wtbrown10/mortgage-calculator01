package com.will;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
//        System.out.println("Your principal is " + principal);

        System.out.print("Annual Interest Rate: ");
        float interest = scanner.nextFloat();
//        System.out.println("Your interest rate is " + interest);

        System.out.print("Period (Years): ");
        int period = scanner.nextInt();
//        System.out.println("Your Period is " + period + " years!");

        long mortgage = Math.round(principal * ((interest * (Math.pow((1 + interest), period))) / (Math.pow((1 + interest), period) - 1))) ;

        System.out.print("Mortgage: " + mortgage);
    }
}
