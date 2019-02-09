package com.epam.cdp.homework2.tasks;

import com.epam.cdp.homework2.utills.Utility;

public class InputOperation {

    public static String getOperation() {

        Utility scanOperation = new Utility();
        System.out.println("Please input the operation:");
        String operation = scanOperation.scanner.next();

        return operation;
    }
}
