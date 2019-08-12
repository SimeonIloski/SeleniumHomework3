package TestClasses;

import Enums.DriverTypeEnum;
import Pages.*;
import Utils.BaseTestClass;
import Utils.ConfigurationConstants;
import Utils.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testAddNewPayeeWithoutDataProvider extends BaseTestClass {

    private WebDriver driver;
    private HomePage homePage;
    private LoginPage loginPage;
    private AccountSummaryPage accountSummaryPage;
    private AddNewPage addNewPage;


@Override
public void  beforeMethod(){
    System.out.println("This was executed before each test method");
}

    @BeforeTest
    private void before() {
        driver = DriverFactory.createDriverForBrowserWithValue(DriverTypeEnum.GOOGLE_CHROME_DRIVER);
        homePage = new HomePage(driver);
        homePage = (HomePage) homePage.navigateTo(ConfigurationConstants.BASE_URL, homePage);
        loginPage = homePage.clickBtnSignIn();
        accountSummaryPage = loginPage.loginUsingCredentials
                (ConfigurationConstants.USERNAME_COURSE, ConfigurationConstants.PASSWORD_COURSE);
        PayBillsPage payBillsPage=accountSummaryPage.navigateToPayBills();
         addNewPage=payBillsPage.goToTab(driver);

    }

    @Test
    void checkIfPayeeISAdedTest(){

       String message= addNewPage.getMessage(ConfigurationConstants.PAYEE_NAME,ConfigurationConstants.PAYEE_ADDRESS,ConfigurationConstants.PAYEE_ACCOUNT,ConfigurationConstants.PAYEE_DETAILS);
        Assert.assertEquals("The new payee Simeon was successfully created.",message);
    }
    @Override
    public void  afterMethod(){
        System.out.println("This was executed after each test method");
    }
    @AfterClass(alwaysRun = true)
    @Override
    protected void afterClass() {
        super.afterClass();
        driver.close();
        driver.quit();
    }
}
