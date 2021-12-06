package Steps;

import com.ibm.icu.impl.duration.TimeUnit;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.vavr.API;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import java.util.concurrent.TimeUnit;

import static com.ibm.icu.impl.duration.TimeUnit.*;


public class QuoteFlightSteps {

    @Managed
    WebDriver driver;

    @Given("effective user entry to flightType page")
    public void EffectiveUserEntryToFlightTypePage() {
        driver.get("https://www.avianca.com/co/en/");
        // confirmo que estoy en la pagina y buco tipo de vuelo
    throw new io.cucumber.java.PendingException();
}
    @When("lightType equal One Way {string}")

    // You can  use the One-neway checkbox, mark it and go to the flight quote page
    public void flightTypeEequalOneWay(String flightType) throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        Thread.sleep(2000);
        driver.findElement(By.id("radioSoloIda")).isSelected();

        WebElement oneWayBtn=driver.findElement(By.id("radioSoloIda"));
        oneWayBtn.isSelected();

        }


    @Then(" go to flight search page")
    public void goToFlightSearchPage() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, java.util.concurrent.TimeUnit.SECONDS);
        driver.findElement(By.id("radioSoloIda")).isSelected();
        Thread.sleep(2000);
        WebElement oneWayBtn=driver.findElement(By.id("radioSoloIda"));
        oneWayBtn.click();
        throw new PendingException();
    }
    //----------------------------------------------------
    @Given ("effective user entry to flightSearch page")
    public void effectiveUserEntryToFlightSearchPage(){
        throw new io.cucumber.java.PendingException();
    }
    @When("select origin destination and date")
    public void selectOriginDestinationAndDate(){
        throw new io.cucumber.java.PendingException();
    }
    @Then("flight search")
    public void flightSearch(){
        throw new io.cucumber.java.PendingException();
    }
    //----------------------------------------------------
    @Given("effective user entry to reportPage")
    public void effectiveUserEntryToReportPage(){
        throw new io.cucumber.java.PendingException();
    }
    @When ("number of records is greater than 0")
    public void numberOfRecordsIsGreaterThan0(){
        throw new io.cucumber.java.PendingException();
    }
    @Then("look for the cheapest flight")
    public void  lookForTheCheapestFlight(){
        throw new io.cucumber.java.PendingException();
    }
    //----------------------------------------------------
    @Given ("effective finding of cheapest flight")
    public void effectiveFindingOfCcheapestFlight(){
        throw new io.cucumber.java.PendingException();
    }
    @When  ("results greater than 0 records")
    public void EffectiveFindingOfCheapestFlight(){
        throw new io.cucumber.java.PendingException();
    }
    @Then ("print the most economical flight")
    public void printTheMostEconomicalFlight(){
        throw new io.cucumber.java.PendingException();
    }

}
