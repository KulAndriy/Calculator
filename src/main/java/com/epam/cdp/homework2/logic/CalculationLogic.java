package com.epam.cdp.homework2.logic;

import com.epam.cdp.homework2.tasks.InputNumber;
import com.epam.cdp.homework2.tasks.InputOperation;
import com.epam.cdp.homework2.utills.Utility;

public class CalculationLogic {
    public InputNumber digits = new InputNumber();
    public InputOperation operator = new InputOperation();

    double firstNumber;
    double secondNumber;
    String operation;
    double result;
    int countOfOperation;
    boolean runAgain;

    public double runCalculator() {
        do {
            if (countOfOperation == 0) {
                firstNumber = digits.getInt("first");
            } else {
                firstNumber = result;
            }
            operation = operator.getOperation();
            secondNumber = digits.getInt("second");
            result = calcPerOperation(firstNumber, secondNumber, operation, result);
            nextOperation();
        } while (runAgain);
        return result;
    }

    public double calcPerOperation(double firstNumber, double secondNumber, String operation, double result) {
        switch (operation) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
                break;
            case "=":
                break;
            default:
                System.out.println("Wrong operation, please try again. ");
        }
        return result;
    }

    public boolean askNextAction() {
        Utility scanNext = new Utility();
        System.out.println("Do you want to perform the next calcPerOperation? Y/N");
        char answer = scanNext.scanner.next().toUpperCase().charAt(0);
        switch (answer) {
            case 'Y':
                runAgain = true;
                break;
            case 'N':
                runAgain = false;
                break;
        }
        return runAgain;
    }

    public void nextOperation() {
        System.out.println("The current result is: " + result);
        countOfOperation++;
        askNextAction();
    }

}

