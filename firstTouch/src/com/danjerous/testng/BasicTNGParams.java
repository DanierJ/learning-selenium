package com.danjerous.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class BasicTNGParams {


    @Parameters({"URL"})
    @Test(groups = {"Smoke"}) // Can't use data provider and parameters together.
    public void workingWithParameters(String urlname) {
        System.out.println("Parameters: " + urlname);
    }

    @Test(groups = {"Smoke"}, dataProvider = "getData")
    public void workingWithDataProvider(String username, String password) {
        System.out.println("username: " + username + ", password: " + password);
    }

    @DataProvider
    public Object[][] getData() {

        // 1st combination - username password | case 1
        // 2nd combination - username password | case 2
        // 3rd combination - username password | case 3
       /* Object[][] data = new Object[3][2];


        // 1st set
        data[0][0] = "firstUsername";
        data[0][1] = "firstPassword";

        // 2nd set
        data[1][0] = "secondUsername";
        data[1][1] = "secondPassword";

        // 3rd set
        data[2][0] = "thirdUsername";
        data[2][1] = "thirdPassword";

        return data;*/

       return new Object[][] {
           {"firstUsername", "firstPassword"},
           {"secondUsername", "secondPassword"},
           {"thirdUsername", "thirdPassword"},
           {"fourthUsername", "fourthPassword"}
       };
    }

}
