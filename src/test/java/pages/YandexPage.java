package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Collection;

public class YandexPage extends AbstractPage {
    private final String BASE_URL = "https://mail.yandex.ru/";

    @FindBy(xpath = "//div[@class='mail-MessageSnippet-Content']")
    private WebElement mail;

    public YandexPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public int findAmount(){
        Collection<WebElement> mails = driver.findElements(By.xpath("//div[@class='mail-MessageSnippet-Content']"));
        return mails.size();
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
    }
}
