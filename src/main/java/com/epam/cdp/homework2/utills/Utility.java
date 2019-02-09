package com.epam.cdp.homework2.utills;

import java.util.Scanner;

public class Utility {

    public int consoleScan(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Waiting a number: ");
        int number;
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
        } else {
            System.out.println("Please enter a digits!!!");
            scanner.next();
            number = consoleScan();
        }
        return number;
    }
}
