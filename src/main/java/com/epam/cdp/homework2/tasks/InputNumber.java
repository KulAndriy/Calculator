package com.epam.cdp.homework2.tasks;

import com.epam.cdp.homework2.utills.Utility;

public class InputNumber {

    public static int getInt() {

        Utility scanNum = new Utility();
        System.out.println("Please input the number between -20...20:");
        int num;
        if (scanNum.scanner.hasNextInt()) {
            num = scanNum.scanner.nextInt();
            if ((num >= -20) && (num <= 20)) {
            } else {
                System.out.println("Warning, tne inputted  number " + num + " more than '20' or less than '-21'!");
//                scanNum.scanner.next();
                num = getInt();
            }

        } else {
            System.out.println("You have entered not a digits. Please try again. ");
            scanNum.scanner.next();//рекурсія
            num = getInt();
        }
        return num;
    }
}
