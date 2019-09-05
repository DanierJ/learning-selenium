package com.danjerous.testng;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Yeah! I succeed: ");
        System.out.println("---[" + result.getName() + "]---");
    }
}
