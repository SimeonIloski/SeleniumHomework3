package DataProviders;

import Utils.ConfigurationConstants;
import org.testng.annotations.DataProvider;

public class MyDataProvider {
    @DataProvider(name = "myDataProvider")
    public static Object[][] dataProviderMethod() {
        return new Object[][] {
                {ConfigurationConstants.PAYEE_NAME,ConfigurationConstants.PAYEE_ADDRESS,ConfigurationConstants.PAYEE_ACCOUNT,ConfigurationConstants.PAYEE_DETAILS},
                 };
    }
}
