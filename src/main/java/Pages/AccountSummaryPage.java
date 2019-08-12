package Pages;

import Enums.HeaderMenuItemsEnum;
import Utils.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountSummaryPage extends BasePage {

    public AccountSummaryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public BasePage newInstance(WebDriver driver) {
        return null;
    }
    @FindBy(id = "pay_bills_tab")
    WebElement payBissTab;
    public PayBillsPage navigateToPayBills() {
       waitForElementToBeClickableAndClick(payBissTab);
        return new PayBillsPage(getDriver());
    }


}
