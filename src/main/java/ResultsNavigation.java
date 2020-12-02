import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsNavigation extends Strona{

    public void enterTextandSubmit(String text) {
        WebElement field = driver.findElement(By.name("q"));
        field.sendKeys(text);
        field.submit();
    }

    public void clickImages() {
        List<WebElement> listaLinkow = driver.findElements(By.cssSelector("#hdtb-msb>div>div>div"));
        for (WebElement link : listaLinkow) {
            if (link.getText().equals("Grafika")) {
                link.click();
                break;
            }
        }

    }
}
