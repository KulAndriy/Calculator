package com.epam.cdp.homework2;

import com.epam.cdp.homework2.logic.CalculationLogic;
import com.epam.cdp.homework2.logic.CreateAndWriteFile;

public class MainApp {

    public static CalculationLogic logic = new CalculationLogic();
    public static CreateAndWriteFile write = new CreateAndWriteFile();

    public static void main(String[] args) {
        double resultOfCalculation ;
        resultOfCalculation = logic.runCalculator();
        System.out.println("The result of calcPerOperation is: " + resultOfCalculation);

        write.writeDataToFile(resultOfCalculation);
    }
}
