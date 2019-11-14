package com.epam.cdp.homework2.tasks;

import com.epam.cdp.homework2.utills.Utility;

public class InputNumber {
    double num;

    public double getInt(String operantNum) {

        Utility scanNum = new Utility();
        System.out.println("Please input " + operantNum + " number between -20...20:");

        if (scanNum.scanner.hasNextDouble()) {
            num = scanNum.scanner.nextDouble();
            if ((num >= -20) && (num <= 20)) {
            } else {
                System.out.println("Warning, tne inputted  number " + num + " more than '20' or less than '-21'!");
                scanNum.scanner.next();
                num = getInt(operantNum);
            }

        } else {
            System.out.println("You have entered not a digits. Please try again. ");
//            scanNum.scanner.next();//рекурсія
            num = getInt(operantNum);
        }
        return num;
    }
}
