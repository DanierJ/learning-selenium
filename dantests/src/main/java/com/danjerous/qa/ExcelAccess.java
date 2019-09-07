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
    
    public XSSFSheet getExcelSheet(XSSFWorkbook workbook, String sheetName) {
        int sheetCount = workbook.getNumberOfSheets();

        for (int i = 0; i < sheetCount; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                XSSFSheet sheet = workbook.getSheetAt(i);

                return sheet;
            }
        }

        return null;
    }

    public File fileBuilder(String filePath) {
        return new File(filePath);
    }


}
