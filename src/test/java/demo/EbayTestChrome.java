package demo;

import factory.DriverFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import templates.TestTemplate;

public class EbayTestChrome {
    DriverFactory factory = new DriverFactory();
    TestTemplate testEbay;

    @BeforeTest
    public void setup() {
        testEbay = factory.getDriver("CHROME");
        testEbay.setup();
    }

    @Test
    public void visitEbay() {
        testEbay.verifyNumberOfShoes();
    }

    @AfterTest
    public void teardown() {
        testEbay.teardown();
    }
}
