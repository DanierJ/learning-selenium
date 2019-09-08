package com.danjerous;

public enum Browser {
    CHROME ("webdriver.chrome.driver", "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\\\chromedriver.exe"),
    FIREFOX ("webdriver.gecko.driver", "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\\\geckodriver.exe");

   /* CHROME ("webdriver.chrome.driver", "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\\\chromedriver.exe") {
        @Override
        void setSystemProperty() {
            System.setProperty(this.getDriver(), this.getLocation());
        }
    },
    FIREFOX ("webdriver.gecko.driver", "C:\\Users\\Danier Javid\\Documents\\libs\\selenium-java-3.141.59\\\\geckodriver.exe") {
        @Override
        void setSystemProperty() {
            System.setProperty(this.getDriver(), this.getLocation());
        }
    };*/


    private String driver;
    private String location;


    Browser (String driver, String location) {
        this.driver = driver;
        this.location = location;
    }

    /*public String getDriver() {
        return driver;
    }

    public String getLocation() {
        return location;
    }*/

    public void setSystemProperty() {
        System.setProperty(this.driver, this.location);
    }

   // abstract void setSystemProperty();

}
