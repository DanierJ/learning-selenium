package com.danjerous.qa;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelAccess {


    public XSSFWorkbook getExcelWorkBook(File file) throws IOException {

        FileInputStream fs = new FileInputStream(file);

        return new XSSFWorkbook(fs);
    }

   
}
