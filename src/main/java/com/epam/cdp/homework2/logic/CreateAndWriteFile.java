package com.epam.cdp.homework2.logic;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CreateAndWriteFile {

    public String createFileName() {
        DateFormat dateFormat = new SimpleDateFormat("dd_MM_yy_HH_mm");
        Date today = Calendar.getInstance().getTime();
        String fileName = dateFormat.format(today);
        return fileName;
    }

    public void writeDataToFile(double resultToWrite) {
        try {
            //print writer for writing to a file
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(createFileName() + ".txt", true)));
            out.println("The result of calcPerOperation is: " + resultToWrite);
            out.close();
        } catch (
                IOException e1) {
            System.out.println("Error during reading/writing");
        }

    }


}

