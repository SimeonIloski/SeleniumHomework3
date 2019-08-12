package Pages;

import Utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayBillsPage extends BasePage {
    public PayBillsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage newInstance(WebDriver driver) {
        return null;
    }
    @FindBy(linkText = "Pay Saved Payee")
    WebElement tabElementPaySavedPayee;

    @FindBy(linkText = "Add New Payee")
    WebElement tabElementAddNewPayee;
    @FindBy(linkText = "Purchase Foreign Currency")
    WebElement tabElementPurchaseForeignCurrency;


    public AddNewPage goToTab(WebDriver driver){
        tabElementAddNewPayee.click();
        return new AddNewPage(getDriver());
    }


}
