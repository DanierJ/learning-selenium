package com.danjerous.qa;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExcelAccess {

    private XSSFWorkbook workbook;

    public ExcelAccess(String filePath) throws IOException {
        this.workbook = getExcelWorkBook(filePath);
    }

    private XSSFWorkbook getExcelWorkBook(String filePath) throws IOException {

        File file = fileBuilder(filePath);

        FileInputStream fs = new FileInputStream(file);

        return new XSSFWorkbook(fs);
    }
    
    private XSSFSheet getExcelSheet(String sheetName) {
      /*  int sheetCount = workbook.getNumberOfSheets();

        for (int i = 0; i < sheetCount; i++) {
            if (workbook.getSheetName(i).equalsIgnoreCase(sheetName)) {
                return workbook.getSheetAt(i);
            }
        }

        return null;*/

      return workbook.getSheet(sheetName);
    }

    private File fileBuilder(String filePath) {
        return new File(filePath);
    }

    // Identifying test cases by scanning every column.
    // Once it's identified then scan the entire column to identified purchase test case row.
    // After you grab purchase test case row, pull all the data of that row and feed it into test.
    private Row getRow(XSSFSheet excelSheet, String cellValue) {
        Iterator<Row> rows = excelSheet.iterator(); // get all the rows
        Row row = null;

        while (rows.hasNext()) {
            row = rows.next();

            if (findColumnIndexByColumnValue(row, cellValue) >= 0) {

                return row;
            }
        }
        return null;
    }

    private int findColumnIndexByColumnValue(Row row, String cellValue) {
        int index = 0;

        Iterator<Cell> cellIterator = row.cellIterator(); // Get all the cells

        while (cellIterator.hasNext()) {
            Cell cell = cellIterator.next();

            if (cell.getCellType().equals(CellType.STRING) && cell.getStringCellValue().equalsIgnoreCase(cellValue) ) {
                return index;
            }
            index++;

        }
        return -1;
    }

    public List<String> getTestCaseValues(String sheetName, String testCase) {
       XSSFSheet sheet = getExcelSheet(sheetName);

       // Validar el header.
    //   Row testCasesRow = getRow(sheet, headerName);

       Row testCaseRow = getRow(sheet,testCase);

        return getData(testCaseRow);

    }

    private List<String> getData(Row row) {

        List<String> dataList = new ArrayList<>();
        Iterator<Cell> data = row.cellIterator();

        while (data.hasNext()) {

            Cell dataCell = data.next();

            if (dataCell.getCellType().equals(CellType.STRING)) {
               // System.out.println(dataCell.getStringCellValue() + ", row: " + dataCell.getRowIndex() + ", column: " + dataCell.getColumnIndex());
                dataList.add(dataCell.getStringCellValue());
            } else {
                String text = NumberToTextConverter.toText(dataCell.getNumericCellValue());
                dataList.add(text);
            }
        }
        return dataList;
    }

}
