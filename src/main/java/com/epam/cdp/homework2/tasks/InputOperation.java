package com.epam.cdp.homework2.tasks;

import com.epam.cdp.homework2.utills.Utility;

public class InputOperation {
    String operation;

    public String getOperation() {
        Utility scanOperation = new Utility();
        System.out.println("Please input the operation:");
        operation = scanOperation.scanner.next();

        if (operation.equals("+") || operation.equals("-") || operation.equals("*") || operation.equals("/")) {
            this.operation = operation;
        } else {
            System.out.println("You have entered not valid operation. Please try again. ");
            operation = getOperation();
        }
        return operation;
    }
}
