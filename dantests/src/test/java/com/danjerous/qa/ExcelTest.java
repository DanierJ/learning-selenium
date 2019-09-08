package com.danjerous.qa;

import java.io.IOException;
import java.util.List;

public class ExcelTest {
    public static void main(String[] args) throws IOException {
        ExcelAccess excelAccess = new ExcelAccess("exceltests.xlsx");

        List<String> purchasesData = excelAccess.getTestCaseValues("testdata",  "Purchases");
        List<String> loginData =  excelAccess.getTestCaseValues("testdata",  "Login");
        List<String> addProfileData =excelAccess.getTestCaseValues("testdata", "Add Profile");
        List<String> deleteProfileData =excelAccess.getTestCaseValues("testdata",  "Delete Profile");

        listData(purchasesData);
    }


    public static void listData(List<String> data) {
        data.forEach(System.out::println);
    }
}
