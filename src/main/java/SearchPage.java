import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
public class SearchPage extends Strona{

    public void openSearchPage() {
        driver.get("https://www.google.com/");
        driver.findElement(By.tagName("iframe"));
        WebElement iframe = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(iframe);
        driver.findElement(By.cssSelector("div[role=\"button\"] span.RveJvd.snByac")).click();
        driver.switchTo().defaultContent();
    }

    public boolean popUpisClosed() {
        try {
            WebElement iframe = driver.findElement(By.tagName("iframe"));
            return false;
        }
        catch (NotFoundException e) {
            return true;
        }
    }

    public AllResultsPage enterTextandSubmit(String text) {
        WebElement field = driver.findElement(By.name("q"));
        field.sendKeys(text);
        field.submit();
        return new AllResultsPage();
    }
}
