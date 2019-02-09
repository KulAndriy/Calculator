package com.epam.cdp.homework2.logic;

import com.epam.cdp.homework2.tasks.InputNumber;
import com.epam.cdp.homework2.tasks.InputOperation;

public class CalculationLogic {
    public InputNumber digits = new InputNumber();
    public InputOperation operator = new InputOperation();

    public int calculation() {

        int result = digits.getInt();
        String operation = operator.getOperation();

        while (!operation.equals("=")) {
            int number = digits.getInt();
            switch (operation) {
                case "+":
                    result += number;
                    break;
                case "-":
                    result -= number;
                    break;
                case "*":
                    result *= number;
                    break;
                case "/":
                    result /= number;
                    break;
                case "=":
                    break;
                default:
                    System.out.println("Wrong operation, please try again. ");
            }
            operation = operator.getOperation();
        }
        return result;
    }
}

