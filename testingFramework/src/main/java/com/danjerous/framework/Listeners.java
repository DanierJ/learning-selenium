package com.danjerous.framework;

import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result) {
        Base base = new Base();

        try {
            base.getScreenShot(result.getName());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
