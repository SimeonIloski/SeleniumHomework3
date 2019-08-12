package Utils;

import Enums.DriverTypeEnum;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class BaseTestClass extends BaseTest {

    protected WebDriver driver;
    protected String baseUrl;
    protected SoftAssert softAssert;

    @BeforeClass
    protected void beforeClass() throws IOException {
        baseUrl ="http://zero.webappsecurity.com";
        driver = DriverFactory.createDriverForBrowserWithValue( DriverTypeEnum.GOOGLE_CHROME_DRIVER);
        beforeClassExtended();
    }

    protected void beforeClassExtended() throws IOException {
    }

    @BeforeMethod
    public void beforeMethodImpl() {
        beforeMethod();
    }

    protected void beforeMethod(){

    }

    @AfterMethod
    public void afterMethod() {

    }

    protected void afterClassExtended() {
    }

    @AfterClass(alwaysRun = true)
    protected void afterClass() {
        afterClassExtended();
        driver.quit();
    }
}
