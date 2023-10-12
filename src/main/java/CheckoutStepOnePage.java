import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutStepOne extends BasePage{
    public CheckoutStepOne(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "first-name")
    private WebElement firstName;

    @FindBy(id = "last-name")
    private WebElement lastName;
    
}

