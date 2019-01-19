package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MainTutBy extends AbstractPage{
    private final String BASE_URL = "https://www.tut.by/";

    @FindBy(xpath = "//a[@title='Почта'][contains(text(),'Почта')]")
    private WebElement mailButton;

    @FindBy(xpath = "//input[@name='login']")
    private WebElement inputUsername;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputPassword;

    @FindBy(xpath = "//input[@class='button auth__enter']")
    private WebElement submitButton;

    @FindBy(xpath = "//a[@class='enter']")
    private WebElement enterButton;

    public MainTutBy(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void login (String username, String password){
        enterButton.click();
        inputUsername.sendKeys(username);
        inputPassword.sendKeys(password);
        Assert.assertTrue(submitButton.isEnabled());
        submitButton.submit();
    }

    public void pressMailButton(){
        mailButton.click();
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
    }
}
