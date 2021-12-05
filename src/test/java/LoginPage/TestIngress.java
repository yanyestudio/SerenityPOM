package LoginPage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(SerenityRunner.class)
public class TestIngress {
    @Managed(driver="chrome")

    WebDriver driver;
    @Test
    public void verifyIngress(){
               driver.get("https://www.avianca.com/co/en/");
    }
}
