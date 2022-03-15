package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args ) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Welcome to XYZ Bank");
        System.out.println("Choose from the following accounts :");
        System.out.println("1. Regular account");
        System.out.println("2. Interest account");
        System.out.println("3. Checking account");
        System.out.println("4. CD account");
        int pin = scn.nextByte();
        switch (pin) {
            case 1 -> {
                System.out.println("Charges are: 10% of the available balance every month");
                System.out.println("Interests: Zero");
                System.out.println("Minimum balance: 50000.00");
                System.out.println("Penalties: 10.00 when balance falls a minimum of 50000.00");
            }
            case 2 -> {
                System.out.println("Charges are: 10% of the available balance every month");
                System.out.println("Interests: 7% monthly");
                System.out.println("Minimum balance: Zero");
                System.out.println("Penalties: Zero");
            }
            case 3 -> {
                System.out.println("Charges are: 10% of the available balance every month");
                System.out.println("Interests: 7% monthly");
                System.out.println("Charges per transaction: 0.10");
                System.out.println("Minimum balance: Zero");
                System.out.println("Penalties: 10.00 when balance falls a minimum of 10000.00");
            }
            case 4 -> {
                System.out.println("Charges are: 10% of the available balance every month");
                System.out.println("Interests: 15% yearly");
                System.out.println("Minimum balance: Zero");
                System.out.println("Penalties: 20% of balance when withdraw made before 12 months from opening of account");
            }
            default -> {
                System.out.println("Invalid chose, choose again");
                main(null);
            }

        }
    }
}
