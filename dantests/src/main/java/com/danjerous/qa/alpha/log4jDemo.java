package com.danjerous.qa.alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4jDemo {

    private static Logger log = LogManager.getLogger(log4jDemo.class.getName());

    public static void main(String[] args) {
        log.debug("I am debugging.");

        if (5>4)
            log.info("Object is present.");
        log.error("Object is not present.");

        log.fatal("This is fatal.");

        // By default only prints error and fatal messages when there's not some configuration file.
    }
}
