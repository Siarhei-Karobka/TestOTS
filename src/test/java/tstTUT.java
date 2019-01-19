import org.testng.annotations.*;
import steps.Steps;

public class tstTUT {
    private Steps steps;
    String USERNAME = "testEmailForOTS";
    String PASSWORD = "passwordOTS";

    @BeforeMethod
    public void setUp() {
        steps = new Steps();
        steps.openBrowser();
    }

    @Test
    public void loginTutBy() {
        steps.loginTutBy(USERNAME, PASSWORD);
        steps.goToMailPage();
        steps.showEmailsAmount();
    }

    @AfterMethod
    public void stopBrowser(){
        steps.closeBrowser();
    }
}
