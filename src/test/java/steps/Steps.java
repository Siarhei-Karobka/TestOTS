package steps;

import driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import pages.MainTutBy;
import pages.YandexPage;

public class Steps {
    private WebDriver driver;

    public void openBrowser(){
        driver = DriverSingleton.getDriver();
    }

    public void closeBrowser(){
        DriverSingleton.closeDriver();
    }

    public void loginTutBy(String username, String password){
        MainTutBy mainTutBy = new MainTutBy(driver);
        mainTutBy.openPage();
        mainTutBy.login(username, password);
    }

    public void goToMailPage(){
        MainTutBy mainTutBy = new MainTutBy(driver);
        mainTutBy.pressMailButton();
    }

    public void showEmailsAmount(){
        YandexPage yandexPage = new YandexPage(driver);
        System.out.println("Количество входящих писем: " + yandexPage.findAmount());
    }
}
